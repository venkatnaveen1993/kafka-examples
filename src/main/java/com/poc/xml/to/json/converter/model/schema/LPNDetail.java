package com.poc.xml.to.json.converter.model.schema;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LPNDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name="ItemName")
    private String itemName;
    @XmlElement(name="PurchaseOrderID")
    private String purchaseOrderId;
    @XmlElement(name="PurchaseOrderLineItemID")
    private String purchaseOrderLineItemId;
    @XmlElement(name="DistributionOrderLineItemID")
    private String distributionOrderLineItemId;
    @XmlElement(name="GTIN")
    private String gtin;
    @XmlElement(name="ExpireDate")
    private String expireDate;
    @XmlElement(name="BestBeforeDate")
    private String bestBeforeDate;
    @XmlElement(name="ShipByDate")
    private String shipByDate;
    @XmlElement(name="PrePackGroupCode")
    private String prePackGroupCode;
    @XmlElement(name="CutNbr")
    private String cutNbr;
    @XmlElement(name="ItemSequenceNbr")
    private String itemSequenceNbr;
    @XmlElement(name="AssortmentNbr")
    private String assortmentNbr;
    @XmlElement(name="InstructionCode1")
    private String instructionCode1;
    @XmlElement(name="InstructionCode2")
    private String instructionCode2;
    @XmlElement(name="InstructionCode3")
    private String instructionCode3;
    @XmlElement(name="InstructionCode4")
    private String instructionCode4;
    @XmlElement(name="InstructionCode5")
    private String instructionCode5;
    @XmlElement(name="StandardSubPackQuantity")
    private String standardSubPackQuantity;
    @XmlElement(name="StandardPackQuantity")
    private String standardPackQuantity;
    @XmlElement(name="StandardCaseQuantity")
    private String standardCaseQuantity;

    @XmlElement(name="CustomFieldList")
    private CustomFieldList customFieldList;

    @XmlElement(name="LPNDetailQuantity")
    private LPNDetailQuantity lpnDetailQuantity;

    @XmlElement(name="LPNDetailWeight")
    private LPNDetailWeight lpnDetailWeight;

    @XmlElement(name="LPNDetailVolume")
    private LPNDetailVolume lpnDetailVolume;

    @XmlElement(name="InventoryAttributes")
    private InventoryAttributes inventoryAttributes;

    public LPNDetail() {
    }

    public LPNDetail(String itemName, String purchaseOrderId, String purchaseOrderLineItemId, String distributionOrderLineItemId, String GTIN, String expireDate, String bestBeforeDate, String shipByDate, String prePackGroupCode, String cutNbr, String itemSequenceNbr, String assortmentNbr, String instructionCode1, String instructionCode2, String instructionCode3, String instructionCode4, String instructionCode5, String standardSubPackQuantity, String standardPackQuantity, String standardCaseQuantity, CustomFieldList CustomFieldList, LPNDetailQuantity lpnDetailQuantity, LPNDetailWeight lpnDetailWeight, LPNDetailVolume lpnDetailVolume, InventoryAttributes InventoryAttributes) {
        this.itemName = itemName;
        this.purchaseOrderId = purchaseOrderId;
        this.purchaseOrderLineItemId = purchaseOrderLineItemId;
        this.distributionOrderLineItemId = distributionOrderLineItemId;
        this.gtin = GTIN;
        this.expireDate = expireDate;
        this.bestBeforeDate = bestBeforeDate;
        this.shipByDate = shipByDate;
        this.prePackGroupCode = prePackGroupCode;
        this.cutNbr = cutNbr;
        this.itemSequenceNbr = itemSequenceNbr;
        this.assortmentNbr = assortmentNbr;
        this.instructionCode1 = instructionCode1;
        this.instructionCode2 = instructionCode2;
        this.instructionCode3 = instructionCode3;
        this.instructionCode4 = instructionCode4;
        this.instructionCode5 = instructionCode5;
        this.standardSubPackQuantity = standardSubPackQuantity;
        this.standardPackQuantity = standardPackQuantity;
        this.standardCaseQuantity = standardCaseQuantity;
        this.customFieldList = CustomFieldList;
        this.lpnDetailQuantity = lpnDetailQuantity;
        this.lpnDetailWeight = lpnDetailWeight;
        this.lpnDetailVolume = lpnDetailVolume;
        this.inventoryAttributes = InventoryAttributes;
    }

    @XmlCDATA
    public String getItemName() {
        return itemName;
    }

    @XmlCDATA
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @XmlCDATA
    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    @XmlCDATA
    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    @XmlCDATA
    public String getPurchaseOrderLineItemId() {
        return purchaseOrderLineItemId;
    }

    @XmlCDATA
    public void setPurchaseOrderLineItemId(String purchaseOrderLineItemId) {
        this.purchaseOrderLineItemId = purchaseOrderLineItemId;
    }

    @XmlCDATA
    public String getDistributionOrderLineItemId() {
        return distributionOrderLineItemId;
    }

    @XmlCDATA
    public void setDistributionOrderLineItemId(String distributionOrderLineItemId) {
        this.distributionOrderLineItemId = distributionOrderLineItemId;
    }

    @XmlCDATA
    public String getGtin() {
        return gtin;
    }

    @XmlCDATA
    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    @XmlCDATA
    public String getExpireDate() {
        return expireDate;
    }

    @XmlCDATA
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    @XmlCDATA
    public String getBestBeforeDate() {
        return bestBeforeDate;
    }

    @XmlCDATA
    public void setBestBeforeDate(String bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
    }

    @XmlCDATA
    public String getShipByDate() {
        return shipByDate;
    }

    @XmlCDATA
    public void setShipByDate(String shipByDate) {
        this.shipByDate = shipByDate;
    }

    @XmlCDATA
    public String getPrePackGroupCode() {
        return prePackGroupCode;
    }

    @XmlCDATA
    public void setPrePackGroupCode(String prePackGroupCode) {
        this.prePackGroupCode = prePackGroupCode;
    }

    @XmlCDATA
    public String getCutNbr() {
        return cutNbr;
    }

    @XmlCDATA
    public void setCutNbr(String cutNbr) {
        this.cutNbr = cutNbr;
    }

    @XmlCDATA
    public String getItemSequenceNbr() {
        return itemSequenceNbr;
    }

    @XmlCDATA
    public void setItemSequenceNbr(String itemSequenceNbr) {
        this.itemSequenceNbr = itemSequenceNbr;
    }

    @XmlCDATA
    public String getAssortmentNbr() {
        return assortmentNbr;
    }

    @XmlCDATA
    public void setAssortmentNbr(String assortmentNbr) {
        this.assortmentNbr = assortmentNbr;
    }

    @XmlCDATA
    public String getInstructionCode1() {
        return instructionCode1;
    }

    @XmlCDATA
    public void setInstructionCode1(String instructionCode1) {
        this.instructionCode1 = instructionCode1;
    }

    @XmlCDATA
    public String getInstructionCode2() {
        return instructionCode2;
    }

    @XmlCDATA
    public void setInstructionCode2(String instructionCode2) {
        this.instructionCode2 = instructionCode2;
    }

    @XmlCDATA
    public String getInstructionCode3() {
        return instructionCode3;
    }

    @XmlCDATA
    public void setInstructionCode3(String instructionCode3) {
        this.instructionCode3 = instructionCode3;
    }

    @XmlCDATA
    public String getInstructionCode4() {
        return instructionCode4;
    }

    @XmlCDATA
    public void setInstructionCode4(String instructionCode4) {
        this.instructionCode4 = instructionCode4;
    }

    @XmlCDATA
    public String getInstructionCode5() {
        return instructionCode5;
    }

    @XmlCDATA
    public void setInstructionCode5(String instructionCode5) {
        this.instructionCode5 = instructionCode5;
    }

    @XmlCDATA
    public String getStandardSubPackQuantity() {
        return standardSubPackQuantity;
    }

    @XmlCDATA
    public void setStandardSubPackQuantity(String standardSubPackQuantity) {
        this.standardSubPackQuantity = standardSubPackQuantity;
    }

    @XmlCDATA
    public String getStandardPackQuantity() {
        return standardPackQuantity;
    }

    @XmlCDATA
    public void setStandardPackQuantity(String standardPackQuantity) {
        this.standardPackQuantity = standardPackQuantity;
    }

    @XmlCDATA
    public String getStandardCaseQuantity() {
        return standardCaseQuantity;
    }

    @XmlCDATA
    public void setStandardCaseQuantity(String standardCaseQuantity) {
        this.standardCaseQuantity = standardCaseQuantity;
    }

    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    public void setCustomFieldList(CustomFieldList CustomFieldList) {
        this.customFieldList = CustomFieldList;
    }

    public LPNDetailQuantity getLpnDetailQuantity() {
        return lpnDetailQuantity;
    }

    public void setLpnDetailQuantity(LPNDetailQuantity LPNDetailQuantity) {
        this.lpnDetailQuantity = LPNDetailQuantity;
    }

    public LPNDetailWeight getLpnDetailWeight() {
        return lpnDetailWeight;
    }

    public void setLpnDetailWeight(LPNDetailWeight LPNDetailWeight) {
        this.lpnDetailWeight = LPNDetailWeight;
    }

    public LPNDetailVolume getLpnDetailVolume() {
        return lpnDetailVolume;
    }

    public void setLpnDetailVolume(LPNDetailVolume LPNDetailVolume) {
        this.lpnDetailVolume = LPNDetailVolume;
    }

    public InventoryAttributes getInventoryAttributes() {
        return inventoryAttributes;
    }

    public void setInventoryAttributes(InventoryAttributes InventoryAttributes) {
        this.inventoryAttributes = InventoryAttributes;
    }

    @Override
    public String toString() {
        return "LPNDetail{" +
                "ItemName='" + itemName + '\'' +
                ", PurchaseOrderID='" + purchaseOrderId + '\'' +
                ", PurchaseOrderLineItemID='" + purchaseOrderLineItemId + '\'' +
                ", DistributionOrderLineItemID='" + distributionOrderLineItemId + '\'' +
                ", GTIN='" + gtin + '\'' +
                ", ExpireDate='" + expireDate + '\'' +
                ", BestBeforeDate='" + bestBeforeDate + '\'' +
                ", ShipByDate='" + shipByDate + '\'' +
                ", PrePackGroupCode='" + prePackGroupCode + '\'' +
                ", CutNbr='" + cutNbr + '\'' +
                ", ItemSequenceNbr='" + itemSequenceNbr + '\'' +
                ", AssortmentNbr='" + assortmentNbr + '\'' +
                ", InstructionCode1='" + instructionCode1 + '\'' +
                ", InstructionCode2='" + instructionCode2 + '\'' +
                ", InstructionCode3='" + instructionCode3 + '\'' +
                ", InstructionCode4='" + instructionCode4 + '\'' +
                ", InstructionCode5='" + instructionCode5 + '\'' +
                ", StandardSubPackQuantity='" + standardSubPackQuantity + '\'' +
                ", StandardPackQuantity='" + standardPackQuantity + '\'' +
                ", StandardCaseQuantity='" + standardCaseQuantity + '\'' +
                ", CustomFieldList=" + customFieldList +
                ", LPNDetailQuantity=" + lpnDetailQuantity +
                ", LPNDetailWeight=" + lpnDetailWeight +
                ", LPNDetailVolume=" + lpnDetailVolume +
                ", InventoryAttributes=" + inventoryAttributes +
                '}';
    }
}
