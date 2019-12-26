package com.poc.xml.to.json.converter.model.schema;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LPNDetailVolume implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name="EstimatedVolume")
    private String estimatedVolume;
    @XmlElement(name="VolumeUOM")
    private String volumeUOM;

    public LPNDetailVolume() {
    }

    public LPNDetailVolume(String estimatedVolume, String volumeUOM) {
        this.estimatedVolume = estimatedVolume;
        this.volumeUOM = volumeUOM;
    }

    @XmlCDATA
    public String getEstimatedVolume() {
        return estimatedVolume;
    }

    @XmlCDATA
    public void setEstimatedVolume(String estimatedVolume) {
        this.estimatedVolume = estimatedVolume;
    }

    @XmlCDATA
    public String getVolumeUOM() {
        return volumeUOM;
    }

    @XmlCDATA
    public void setVolumeUOM(String volumeUOM) {
        this.volumeUOM = volumeUOM;
    }

    @Override
    public String toString() {
        return "LPNDetailVolume{" +
                "EstimatedVolume='" + estimatedVolume + '\'' +
                ", VolumeUOM='" + volumeUOM + '\'' +
                '}';
    }
}
