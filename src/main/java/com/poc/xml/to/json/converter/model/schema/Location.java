package com.poc.xml.to.json.converter.model.schema;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "Location")
@XmlAccessorType(XmlAccessType.FIELD)
public class Location implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name="Area")
    private String area;
    @XmlElement(name="Zone")
    private String zone;
    @XmlElement(name="Aisle")
    private String aisle;
    @XmlElement(name="Bay")
    private String bay;
    @XmlElement(name="Level")
    private String level;
    @XmlElement(name="Position")
    private String position;

    public Location() {
    }

    public Location(String area, String zone, String aisle, String bay, String level, String position) {
        this.area = area;
        this.zone = zone;
        this.aisle = aisle;
        this.bay = bay;
        this.level = level;
        this.position = position;
    }

    @XmlCDATA
    public String getArea() {
        return area;
    }

    @XmlCDATA
    public void setArea(String area) {
        this.area = area;
    }

    @XmlCDATA
    public String getZone() {
        return zone;
    }

    @XmlCDATA
    public void setZone(String zone) {
        this.zone = zone;
    }

    @XmlCDATA
    public String getAisle() {
        return aisle;
    }

    @XmlCDATA
    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    @XmlCDATA
    public String getBay() {
        return bay;
    }

    @XmlCDATA
    public void setBay(String bay) {
        this.bay = bay;
    }

    @XmlCDATA
    public String getLevel() {
        return level;
    }

    @XmlCDATA
    public void setLevel(String level) {
        this.level = level;
    }

    @XmlCDATA
    public String getPosition() {
        return position;
    }

    @XmlCDATA
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Location{" +
                "Area='" + area + '\'' +
                ", Zone='" + zone + '\'' +
                ", Aisle='" + aisle + '\'' +
                ", Bay='" + bay + '\'' +
                ", Level='" + level + '\'' +
                ", Position='" + position + '\'' +
                '}';
    }
}
