package com.poc.xml.to.json.converter.model.schema;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class InventoryAttributes implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name="InventoryType")
    private String inventoryType;
    @XmlElement(name="ProductStatus")
    private String productStatus;
    @XmlElement(name="BatchNumber")
    private String batchNumber;
    @XmlElement(name="ItemAttribute1")
    private String itemAttribute1;
    @XmlElement(name="ItemAttribute2")
    private String itemAttribute2;
    @XmlElement(name="ItemAttribute3")
    private String itemAttribute3;
    @XmlElement(name="ItemAttribute4")
    private String itemAttribute4;
    @XmlElement(name="ItemAttribute5")
    private String itemAttribute5;
    @XmlElement(name="CountryofOrigin")
    private String countryOfOrigin;

    public InventoryAttributes() {
    }

    public InventoryAttributes(String inventoryType, String productStatus, String batchNumber, String itemAttribute1, String itemAttribute2, String itemAttribute3, String itemAttribute4, String itemAttribute5, String countryOfOrigin) {
        this.inventoryType = inventoryType;
        this.productStatus = productStatus;
        this.batchNumber = batchNumber;
        this.itemAttribute1 = itemAttribute1;
        this.itemAttribute2 = itemAttribute2;
        this.itemAttribute3 = itemAttribute3;
        this.itemAttribute4 = itemAttribute4;
        this.itemAttribute5 = itemAttribute5;
        this.countryOfOrigin = countryOfOrigin;
    }

    @XmlCDATA
    public String getInventoryType() {
        return inventoryType;
    }

    @XmlCDATA
    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    @XmlCDATA
    public String getProductStatus() {
        return productStatus;
    }

    @XmlCDATA
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    @XmlCDATA
    public String getBatchNumber() {
        return batchNumber;
    }

    @XmlCDATA
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    @XmlCDATA
    public String getItemAttribute1() {
        return itemAttribute1;
    }

    @XmlCDATA
    public void setItemAttribute1(String itemAttribute1) {
        this.itemAttribute1 = itemAttribute1;
    }

    @XmlCDATA
    public String getItemAttribute2() {
        return itemAttribute2;
    }

    @XmlCDATA
    public void setItemAttribute2(String itemAttribute2) {
        this.itemAttribute2 = itemAttribute2;
    }

    @XmlCDATA
    public String getItemAttribute3() {
        return itemAttribute3;
    }

    @XmlCDATA
    public void setItemAttribute3(String itemAttribute3) {
        this.itemAttribute3 = itemAttribute3;
    }

    @XmlCDATA
    public String getItemAttribute4() {
        return itemAttribute4;
    }

    @XmlCDATA
    public void setItemAttribute4(String itemAttribute4) {
        this.itemAttribute4 = itemAttribute4;
    }

    @XmlCDATA
    public String getItemAttribute5() {
        return itemAttribute5;
    }

    @XmlCDATA
    public void setItemAttribute5(String itemAttribute5) {
        this.itemAttribute5 = itemAttribute5;
    }

    @XmlCDATA
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @XmlCDATA
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
