package com.poc.xml.to.json.converter.model.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Message implements Serializable {

    @Override
    public String toString() {
        return "Message{" +
                "asn=" + asn +
                '}';
    }

    @XmlElement(name = "ASN")
    private ASN asn;

    public Message(ASN asn) {
        this.asn = asn;
    }

    public Message() {
    }

    public ASN getAsn() {
        return asn;
    }

    public void setAsn(ASN asn) {
        this.asn = asn;
    }
}
