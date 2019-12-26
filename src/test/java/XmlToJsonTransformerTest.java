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

import com.poc.xml.to.json.converter.XmlToJsonTransformer;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.source.SourceRecord;
import org.junit.After;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.kafka.connect.data.Struct;

import static org.junit.Assert.*;

public class XmlToJsonTransformerTest {

  private XmlToJsonTransformer<SourceRecord> xform = new XmlToJsonTransformer.Value<>();

  @After
  public void tearDown() throws Exception {
    xform.close();
  }


  //@Test
  public void schemalessInsertUuidField() throws IOException {
    final Map<String, Object> props = new HashMap<>();

    props.put("dummy.field.name", "");

    xform.configure(props);

    String xmlAsString = Files
            .lines(Paths.get("src/main/resources/DOM2012.xml"))
            .collect(Collectors.joining("\n"));
    final SourceRecord record = new SourceRecord(null, null, "test", 0,
      null, new Struct(null).put("helo",xmlAsString));

    final SourceRecord transformedRecord = xform.apply(record);

    System.out.println(transformedRecord.value().toString());


  }
}