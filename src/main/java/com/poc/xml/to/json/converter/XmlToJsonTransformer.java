/*
 * Copyright © 2019 Christopher Matta (chris.matta@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.poc.xml.to.json.converter;

import org.apache.kafka.common.cache.Cache;
import org.apache.kafka.common.cache.LRUCache;
import org.apache.kafka.common.cache.SynchronizedCache;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.connect.connector.ConnectRecord;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.transforms.Transformation;
import org.apache.kafka.connect.transforms.util.SimpleConfig;

import static org.apache.kafka.connect.transforms.util.Requirements.requireMap;
import static org.apache.kafka.connect.transforms.util.Requirements.requireStruct;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class XmlToJsonTransformer<R extends ConnectRecord<R>> implements Transformation<R> {

  public static final String OVERVIEW_DOC =
    "transforms xml record to json record";

  private static final String PURPOSE = "convert xml to json record";
  private interface ConfigName {
    String DUMMY_FIELD_NAME = "dummy.field.name";
  }

  public static final ConfigDef CONFIG_DEF = new ConfigDef()
    .define(ConfigName.DUMMY_FIELD_NAME, ConfigDef.Type.STRING, "dummy", ConfigDef.Importance.LOW,
      "it won't do anything");

  private Cache<Schema, Schema> schemaUpdateCache;

  @Override
  public void configure(Map<String, ?> props) {
    final SimpleConfig config = new SimpleConfig(CONFIG_DEF, props);
    String fieldName = config.getString(ConfigName.DUMMY_FIELD_NAME);
    schemaUpdateCache = new SynchronizedCache<>(new LRUCache<Schema, Schema>(16));
  }

  @Override
  public ConfigDef config() {
    return CONFIG_DEF;
  }



  @Override
  public R apply(R record) {

    System.out.println("check "+record.value().toString());
      return applySchemaless(record);

  }

  private R applySchemaless(R record) {


    Struct value = requireStruct(operatingValue(record), PURPOSE);
    XMLToJSONConverter converter = new XMLToJSONConverter();
    //String key = value.keySet().stream().findFirst().get();
    //System.out.println("key:" + key + " , Value: " +  value);

    String jsonString = converter.convertXMLToJson((String)value.get("text"));
    value.put("text",jsonString);
    //value.put("text",jsonString);
    //final Map<String,Object> newValue =new HashMap<>(value);
    //newValue.put("text",jsonString);

    return newRecord(record, record.valueSchema(), jsonString);
  }

  private R applyWithSchema(R record) {

    return applySchemaless(record);
  }



  @Override
  public void close() {
    schemaUpdateCache = null;
  }



  protected abstract Object operatingValue(R record);

  protected abstract R newRecord(R record, Schema updatedSchema, Object updatedValue);

  public static class Key<R extends ConnectRecord<R>> extends XmlToJsonTransformer<R> {


    @Override
    protected Object operatingValue(R record) {
      return record.key();
    }

    @Override
    protected R newRecord(R record, Schema updatedSchema, Object updatedValue) {
      return record.newRecord(record.topic(), record.kafkaPartition(), updatedSchema, updatedValue, record.valueSchema(), record.value(), record.timestamp());
    }

  }

  public static class Value<R extends ConnectRecord<R>> extends XmlToJsonTransformer<R> {


    @Override
    protected Object operatingValue(R record) {
      return record.value();
    }

    @Override
    protected R newRecord(R record, Schema updatedSchema, Object updatedValue) {
      return record.newRecord(record.topic(), record.kafkaPartition(), record.keySchema(), record.key(), updatedSchema, updatedValue, record.timestamp());
    }


  }
}


