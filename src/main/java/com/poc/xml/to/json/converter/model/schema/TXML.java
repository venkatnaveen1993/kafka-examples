package com.poc.xml.to.json.converter.model.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name="tXML")
@XmlAccessorType (XmlAccessType.FIELD)
public class TXML implements Serializable {

    public TXML(Header header, Message message) {
        this.header = header;
        this.message = message;
    }

    public TXML() {}

    @XmlElement(name="Header")
    private Header header;

    @XmlElement(name="Message")
    private Message message;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "TXML{" +
                "header=" + header +
                ", message=" + message +
                '}';
    }
}
