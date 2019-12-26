package com.poc.xml.to.json.converter.model.schema;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Header implements Serializable {

    @XmlElement(name="Source")
    private String source;

    @XmlElement(name="Action_Type")
    private String actionType;

    @XmlElement(name="Reference_ID")
    private String refId;

    @XmlElement(name="Message_Type")
    private String messageType;

    @XmlElement(name="Company_ID")
    private String companyId;

    public Header(String source, String actionType, String refId, String messageType, String companyId) {
        this.source = source;
        this.actionType = actionType;
        this.refId = refId;
        this.messageType = messageType;
        this.companyId = companyId;
    }

    public Header() {
    }


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    @XmlCDATA
    public String getRefId() {
        return refId;
    }

    @XmlCDATA
    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        return "Header{" +
                "source='" + source + '\'' +
                ", actionType='" + actionType + '\'' +
                ", refId='" + refId + '\'' +
                ", messageType='" + messageType + '\'' +
                ", companyId='" + companyId + '\'' +
                '}';
    }
}
