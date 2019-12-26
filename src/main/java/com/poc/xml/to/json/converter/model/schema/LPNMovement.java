package com.poc.xml.to.json.converter.model.schema;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "LPNMovement")
@XmlAccessorType(XmlAccessType.FIELD)
public class LPNMovement implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "ASNID")
    private String asnId;
    @XmlElement(name = "OriginFacilityAliasID")
    private String originFacilityAliasId;
    @XmlElement(name = "DestinationFacilityAliasID")
    private String destinationFacilityAliasID;
    @XmlElement(name = "ShippedDTTM")
    private String shippedDTTM;
    @XmlElement(name = "ReceivedDTTM")
    private String receivedDTTM;

    public LPNMovement() {
    }

    public LPNMovement(String ASNID, String originFacilityAliasId, String destinationFacilityAliasID, String shippedDTTM, String receivedDTTM) {
        this.asnId = ASNID;
        this.originFacilityAliasId = originFacilityAliasId;
        this.destinationFacilityAliasID = destinationFacilityAliasID;
        this.shippedDTTM = shippedDTTM;
        this.receivedDTTM = receivedDTTM;
    }

    @XmlCDATA
    public String getAsnId() {
        return asnId;
    }

    @XmlCDATA
    public void setAsnId(String asnId) {
        this.asnId = asnId;
    }

    @XmlCDATA
    public String getOriginFacilityAliasId() {
        return originFacilityAliasId;
    }

    @XmlCDATA
    public void setOriginFacilityAliasId(String originFacilityAliasId) {
        this.originFacilityAliasId = originFacilityAliasId;
    }

    @XmlCDATA
    public String getDestinationFacilityAliasID() {
        return destinationFacilityAliasID;
    }

    @XmlCDATA
    public void setDestinationFacilityAliasID(String destinationFacilityAliasID) {
        this.destinationFacilityAliasID = destinationFacilityAliasID;
    }

    @XmlCDATA
    public String getShippedDTTM() {
        return shippedDTTM;
    }

    @XmlCDATA
    public void setShippedDTTM(String shippedDTTM) {
        this.shippedDTTM = shippedDTTM;
    }

    @XmlCDATA
    public String getReceivedDTTM() {
        return receivedDTTM;
    }

    @XmlCDATA
    public void setReceivedDTTM(String receivedDTTM) {
        this.receivedDTTM = receivedDTTM;
    }

    @Override
    public String toString() {
        return "LPNMovement{" +
                "ASNID='" + asnId + '\'' +
                ", OriginFacilityAliasID='" + originFacilityAliasId + '\'' +
                ", DestinationFacilityAliasID='" + destinationFacilityAliasID + '\'' +
                ", ShippedDTTM='" + shippedDTTM + '\'' +
                ", ReceivedDTTM='" + receivedDTTM + '\'' +
                '}';
    }
}
