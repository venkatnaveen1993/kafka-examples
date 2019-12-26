package com.poc.xml.to.json.converter.model.schema;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LPNDetailQuantity implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name="Quantity")
    private String quantity;
    @XmlElement(name="QuantityUOM")
    private String quantityUOM;
    @XmlElement(name="ShippedAsnQuantity")
    private String shippedAsnQuantity;
    @XmlElement(name="OriginalQuantity")
    private String originalQuantity;
    @XmlElement(name="ReceivedQuantity")
    private String receivedQuantity;
    @XmlElement(name="HazmatQuantity")
    private String hazmatQuantity;
    @XmlElement(name="HazmatQuantityUOM")
    private String hazmatQuantityUOM;

    public LPNDetailQuantity() {
    }

    public LPNDetailQuantity(String quantity, String quantityUOM, String shippedAsnQuantity, String originalQuantity, String receivedQuantity, String hazmatQuantity, String hazmatQuantityUOM) {
        this.quantity = quantity;
        this.quantityUOM = quantityUOM;
        this.shippedAsnQuantity = shippedAsnQuantity;
        this.originalQuantity = originalQuantity;
        this.receivedQuantity = receivedQuantity;
        this.hazmatQuantity = hazmatQuantity;
        this.hazmatQuantityUOM = hazmatQuantityUOM;
    }

    @XmlCDATA
    public String getQuantity() {
        return quantity;
    }

    @XmlCDATA
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @XmlCDATA
    public String getQuantityUOM() {
        return quantityUOM;
    }

    @XmlCDATA
    public void setQuantityUOM(String quantityUOM) {
        this.quantityUOM = quantityUOM;
    }

    @XmlCDATA
    public String getShippedAsnQuantity() {
        return shippedAsnQuantity;
    }

    @XmlCDATA
    public void setShippedAsnQuantity(String shippedAsnQuantity) {
        this.shippedAsnQuantity = shippedAsnQuantity;
    }

    @XmlCDATA
    public String getOriginalQuantity() {
        return originalQuantity;
    }

    @XmlCDATA
    public void setOriginalQuantity(String originalQuantity) {
        this.originalQuantity = originalQuantity;
    }

    @XmlCDATA
    public String getReceivedQuantity() {
        return receivedQuantity;
    }

    @XmlCDATA
    public void setReceivedQuantity(String receivedQuantity) {
        this.receivedQuantity = receivedQuantity;
    }

    @XmlCDATA
    public String getHazmatQuantity() {
        return hazmatQuantity;
    }

    @XmlCDATA
    public void setHazmatQuantity(String hazmatQuantity) {
        this.hazmatQuantity = hazmatQuantity;
    }

    @XmlCDATA
    public String getHazmatQuantityUOM() {
        return hazmatQuantityUOM;
    }

    @XmlCDATA
    public void setHazmatQuantityUOM(String hazmatQuantityUOM) {
        this.hazmatQuantityUOM = hazmatQuantityUOM;
    }

    @Override
    public String toString() {
        return "LPNDetailQuantity{" +
                "Quantity='" + quantity + '\'' +
                ", QuantityUOM='" + quantityUOM + '\'' +
                ", ShippedAsnQuantity='" + shippedAsnQuantity + '\'' +
                ", OriginalQuantity='" + originalQuantity + '\'' +
                ", ReceivedQuantity='" + receivedQuantity + '\'' +
                ", HazmatQuantity='" + hazmatQuantity + '\'' +
                ", HazmatQuantityUOM='" + hazmatQuantityUOM + '\'' +
                '}';
    }
}
