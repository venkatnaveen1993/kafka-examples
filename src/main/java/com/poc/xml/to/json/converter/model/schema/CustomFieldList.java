package com.poc.xml.to.json.converter.model.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomFieldList implements Serializable {
    private static final long serialVersionUID = 1L;

    public CustomFieldList() {
    }
}
