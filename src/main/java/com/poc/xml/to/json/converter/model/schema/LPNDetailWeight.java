package com.poc.xml.to.json.converter.model.schema;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LPNDetailWeight implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name="EstimatedWeight")
    private String estimatedWeight;

    @XmlElement(name="Weight")
    private String weight;

    @XmlElement(name="WeightUOM")
    private String weightUOM;

    public LPNDetailWeight() {
    }

    public LPNDetailWeight(String estimatedWeight, String weight, String weightUOM) {
        this.estimatedWeight = estimatedWeight;
        this.weight = weight;
        this.weightUOM = weightUOM;
    }

    @XmlCDATA
    public String getEstimatedWeight() {
        return estimatedWeight;
    }

    @XmlCDATA
    public void setEstimatedWeight(String estimatedWeight) {
        this.estimatedWeight = estimatedWeight;
    }

    @XmlCDATA
    public String getWeight() {
        return weight;
    }

    @XmlCDATA
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @XmlCDATA
    public String getWeightUOM() {
        return weightUOM;
    }

    @XmlCDATA
    public void setWeightUOM(String weightUOM) {
        this.weightUOM = weightUOM;
    }

    @Override
    public String toString() {
        return "LPNDetailWeight{" +
                "EstimatedWeight='" + estimatedWeight + '\'' +
                ", Weight='" + weight + '\'' +
                ", WeightUOM='" + weightUOM + '\'' +
                '}';
    }
}
