package com.poc.xml.to.json.converter.model.schema;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ASN implements Serializable {


    @XmlElement(name = "ASNID")
    private String asnId;

    @XmlElement(name="ASNType")
    private String asnType;

    @XmlElement(name="ShipmentID")
    private String shipmentId;

    @XmlElement(name="LastTransmittedDTTM")
    private String lastTransmittedDTTM;

    @XmlElement(name="ASNStatus")
    private String asnStatus;

    @XmlElement(name="ASNPriority")
    private String asnPriority;

    @XmlElement(name="BusinessPartnerCode")
    private String businessPartnerCode;

    @XmlElement(name="BusinessUnit")
    private String businessUnit;

    @XmlElement(name="OriginFacilityAliasID")
    private String originFacilityAliasID;

    @XmlElement(name="DestinationFacilityAliasID")
    private String destinationFacilityAliasID;

    @XmlElement(name="MfgPlant")
    private String mfgPlant;

    @XmlElement(name="PalletFootprint")
    private String palletFootprint;

    @XmlElement(name="PickupEndDTTM")
    private String pickupEndDTTM;

    @XmlElement(name="ActualShippedDTTM")
    private String actualShippedDTTM;

    @XmlElement(name="DeliveryStart")
    private String deliveryStart;

    @XmlElement(name="DeliveryEnd")
    private String deliveryEnd;

    @XmlElement(name="AppointmentID")
    private String appointmentId;

    @XmlElement(name="AppointmentDTTM")
    private String appointmentDTTM;

    @XmlElement(name="AppointmentDuration")
    private String appointmentDuration;

    @XmlElement(name="ScheduleAppointment")
    private String scheduleAppointment;

    @XmlElement(name="FirmAppointmentIndicator")
    private String firmAppointmentIndicator;

    @XmlElement(name="AssignedCarrierCode")
    private String assignedCarrierCode;

    @XmlElement(name="DriverName")
    private String driverName;

    @XmlElement(name="BillOfLadingNumber")
    private String billOfLadingNumber;

    @XmlElement(name="PRONumber")
    private String proNumber;

    @XmlElement(name="EquipmentCode")
    private String equipmentCode;

    @XmlElement(name="TractorCarrierCode")
    private String tractorCarrierCode;

    @XmlElement(name="TractorNumber")
    private String tractorNumber;

    @XmlElement(name="Mode")
    private String mode;

    @XmlElement(name="ShippingCost")
    private String shippingCost;

    @XmlElement(name="ShippingCostCurrency")
    private String shippingCostCurrency;

    @XmlElement(name="BuyerCode")
    private String buyerCode;

    @XmlElement(name="RepresentativeName")
    private String representativeName;

    @XmlElement(name="ContactAddress1")
    private String contactAddress1;

    @XmlElement(name="ContactAddress2")
    private String contactAddress2;

    @XmlElement(name="ContactAddress3")
    private String contactAddress3;

    @XmlElement(name="ContactCity")
    private String contactCity;

    @XmlElement(name="ContactStateOrProvince")
    private String contactStateOrProvince;

    @XmlElement(name="ContactPostalCode")
    private String contactPostalCode;

    @XmlElement(name="ContactCounty")
    private String contactCounty;

    @XmlElement(name="ContactCountry")
    private String contactCountry;

    @XmlElement(name="ContactNumber")
    private String contactNumber;

    @XmlElement(name="RefField1")
    private String refField1;

    @XmlElement(name="RefField2")
    private String refField2;

    @XmlElement(name="RefField3")
    private String refField3;

    @XmlElement(name="ExternalSysCreationDTTM")
    private String externalSysCreationDTTM;

    @XmlElement(name="EquipmentType")
    private String equipmentType;

    @XmlElement(name="OriginType")
    private String originType;

    @XmlElement(name="DestinationType")
    private String destinationType;

    @XmlElement(name="DCOrderNumber")
    private String dcOrderNumber;

    @XmlElement(name="ContractLocation")
    private String contractLocation;

    @XmlElement(name="TransferFlag")
    private String transferFlag;

    @XmlElement(name="QualityCheckHoldUponReceipt")
    private String qualityCheckHoldUponReceipt;

    @XmlElement(name="ManifNbr")
    private String manifNbr;

    @XmlElement(name="ManifType")
    private String manifType;

    @XmlElement(name="DeliveryStopSeq")
    private String deliveryStopSeq;

    @XmlElement(name="CutNbr")
    private String cutNbr;

    @XmlElement(name="IsCancelled")
    private String isCancelled;

    @XmlElement(name="IsClosed")
    private String isClosed;

    @XmlElement(name="TrailerNbr")
    private String trailerNbr;

    @XmlElement(name="ShippedLPNCount")
    private String shippedLPNCount;

    @XmlElement(name="FlowthruAllocMethod")
    private String flowthruAllocMethod;

    @XmlElement(name="ExpectedReceiptDate")
    private String expectedReceiptDate;

    @XmlElement(name="WorkOrdNbr")
    private String workOrdNbr;

    @XmlElement(name="TotalWeight")
    private String totalWeight;

    @XmlElement(name="TotalWeightUOM")
    private String totalWeightUOM;

    @XmlElement(name="Volume")
    private String volume;

    @XmlElement(name="VolumeUOM")
    private String volumeUOM;

    @XmlElement(name="ReceiptType")
    private String receiptType;

    @XmlElement(name="ReturnReferenceNumber")
    private String returnReferenceNumber;


    @XmlElement(name="CustomFieldList")
    private CustomFieldList customFieldList;

    @XmlElement(name = "LPN")
    private LPN lpn;

    public ASN(String asnId, String asnType, String shipmentId, String lastTransmittedDTTM, String ASNStatus, String ASNPriority, String businessPartnerCode, String businessUnit, String originFacilityAliasID, String destinationFacilityAliasID, String mfgPlant, String palletFootprint, String pickupEndDTTM, String actualShippedDTTM, String deliveryStart, String deliveryEnd, String appointmentID, String appointmentDTTM, String appointmentDuration, String scheduleAppointment, String firmAppointmentIndicator, String assignedCarrierCode, String driverName, String billOfLadingNumber, String PRONumber, String equipmentCode, String tractorCarrierCode, String tractorNumber, String mode, String shippingCost, String shippingCostCurrency, String buyerCode, String representativeName, String contactAddress1, String contactAddress2, String contactAddress3, String contactCity, String contactStateOrProvince, String contactPostalCode, String contactCounty, String contactCountry, String contactNumber, String refField1, String refField2, String refField3, String externalSysCreationDTTM, String equipmentType, String originType, String destinationType, String DCOrderNumber, String contractLocation, String transferFlag, String qualityCheckHoldUponReceipt, String manifNbr, String manifType, String deliveryStopSeq, String cutNbr, String isCancelled, String isClosed, String trailerNbr, String shippedLPNCount, String flowthruAllocMethod, String expectedReceiptDate, String workOrdNbr, String totalWeight, String totalWeightUOM, String volume, String volumeUOM, String receiptType, String returnReferenceNumber, CustomFieldList customFieldList, LPN lpn) {
        this.asnId = asnId;
        this.asnType = asnType;
        this.shipmentId = shipmentId;
        this.lastTransmittedDTTM = lastTransmittedDTTM;
        this.asnStatus = ASNStatus;
        this.asnPriority = ASNPriority;
        this.businessPartnerCode = businessPartnerCode;
        this.businessUnit = businessUnit;
        this.originFacilityAliasID = originFacilityAliasID;
        this.destinationFacilityAliasID = destinationFacilityAliasID;
        this.mfgPlant = mfgPlant;
        this.palletFootprint = palletFootprint;
        this.pickupEndDTTM = pickupEndDTTM;
        this.actualShippedDTTM = actualShippedDTTM;
        this.deliveryStart = deliveryStart;
        this.deliveryEnd = deliveryEnd;
        this.appointmentId = appointmentID;
        this.appointmentDTTM = appointmentDTTM;
        this.appointmentDuration = appointmentDuration;
        this.scheduleAppointment = scheduleAppointment;
        this.firmAppointmentIndicator = firmAppointmentIndicator;
        this.assignedCarrierCode = assignedCarrierCode;
        this.driverName = driverName;
        this.billOfLadingNumber = billOfLadingNumber;
        this.proNumber = PRONumber;
        this.equipmentCode = equipmentCode;
        this.tractorCarrierCode = tractorCarrierCode;
        this.tractorNumber = tractorNumber;
        this.mode = mode;
        this.shippingCost = shippingCost;
        this.shippingCostCurrency = shippingCostCurrency;
        this.buyerCode = buyerCode;
        this.representativeName = representativeName;
        this.contactAddress1 = contactAddress1;
        this.contactAddress2 = contactAddress2;
        this.contactAddress3 = contactAddress3;
        this.contactCity = contactCity;
        this.contactStateOrProvince = contactStateOrProvince;
        this.contactPostalCode = contactPostalCode;
        this.contactCounty = contactCounty;
        this.contactCountry = contactCountry;
        this.contactNumber = contactNumber;
        this.refField1 = refField1;
        this.refField2 = refField2;
        this.refField3 = refField3;
        this.externalSysCreationDTTM = externalSysCreationDTTM;
        this.equipmentType = equipmentType;
        this.originType = originType;
        this.destinationType = destinationType;
        this.dcOrderNumber = DCOrderNumber;
        this.contractLocation = contractLocation;
        this.transferFlag = transferFlag;
        this.qualityCheckHoldUponReceipt = qualityCheckHoldUponReceipt;
        this.manifNbr = manifNbr;
        this.manifType = manifType;
        this.deliveryStopSeq = deliveryStopSeq;
        this.cutNbr = cutNbr;
        this.isCancelled = isCancelled;
        this.isClosed = isClosed;
        this.trailerNbr = trailerNbr;
        this.shippedLPNCount = shippedLPNCount;
        this.flowthruAllocMethod = flowthruAllocMethod;
        this.expectedReceiptDate = expectedReceiptDate;
        this.workOrdNbr = workOrdNbr;
        this.totalWeight = totalWeight;
        this.totalWeightUOM = totalWeightUOM;
        this.volume = volume;
        this.volumeUOM = volumeUOM;
        this.receiptType = receiptType;
        this.returnReferenceNumber = returnReferenceNumber;
        this.customFieldList = customFieldList;
        this.lpn = lpn;
    }

    public ASN() {
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
    public String getAsnType() {
        return asnType;
    }

    @XmlCDATA
    public void setAsnType(String asnType) {
        this.asnType = asnType;
    }

    @XmlCDATA
    public String getShipmentId() {
        return shipmentId;
    }
    @XmlCDATA
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
    @XmlCDATA
    public String getLastTransmittedDTTM() {
        return lastTransmittedDTTM;
    }
    @XmlCDATA
    public void setLastTransmittedDTTM(String lastTransmittedDTTM) {
        this.lastTransmittedDTTM = lastTransmittedDTTM;
    }
    @XmlCDATA
    public String getASNStatus() {
        return asnStatus;
    }
    @XmlCDATA
    public void setASNStatus(String ASNStatus) {
        this.asnStatus = ASNStatus;
    }
    @XmlCDATA
    public String getASNPriority() {
        return asnPriority;
    }
    @XmlCDATA
    public void setASNPriority(String ASNPriority) {
        this.asnPriority = ASNPriority;
    }
    @XmlCDATA
    public String getBusinessPartnerCode() {
        return businessPartnerCode;
    }
    @XmlCDATA
    public void setBusinessPartnerCode(String businessPartnerCode) {
        this.businessPartnerCode = businessPartnerCode;
    }
    @XmlCDATA
    public String getBusinessUnit() {
        return businessUnit;
    }
    @XmlCDATA
    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }
    @XmlCDATA
    public String getOriginFacilityAliasID() {
        return originFacilityAliasID;
    }
    @XmlCDATA
    public void setOriginFacilityAliasID(String originFacilityAliasID) {
        this.originFacilityAliasID = originFacilityAliasID;
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
    public String getMfgPlant() {
        return mfgPlant;
    }
    @XmlCDATA
    public void setMfgPlant(String mfgPlant) {
        this.mfgPlant = mfgPlant;
    }
    @XmlCDATA
    public String getPalletFootprint() {
        return palletFootprint;
    }
    @XmlCDATA
    public void setPalletFootprint(String palletFootprint) {
        this.palletFootprint = palletFootprint;
    }
    @XmlCDATA
    public String getPickupEndDTTM() {
        return pickupEndDTTM;
    }
    @XmlCDATA
    public void setPickupEndDTTM(String pickupEndDTTM) {
        //SimpleDateFormat format  =  new  SimpleDateFormat();
        this.pickupEndDTTM = pickupEndDTTM;
    }
    @XmlCDATA
    public String getActualShippedDTTM() {
        return actualShippedDTTM;
    }
    @XmlCDATA
    public void setActualShippedDTTM(String actualShippedDTTM) {
        this.actualShippedDTTM = actualShippedDTTM;
    }
    @XmlCDATA
    public String getDeliveryStart() {
        return deliveryStart;
    }
    @XmlCDATA
    public void setDeliveryStart(String deliveryStart) {
        this.deliveryStart = deliveryStart;
    }
    @XmlCDATA
    public String getDeliveryEnd() {
        return deliveryEnd;
    }
    @XmlCDATA
    public void setDeliveryEnd(String deliveryEnd) {
        this.deliveryEnd = deliveryEnd;
    }
    @XmlCDATA
    public String getAppointmentID() {
        return appointmentId;
    }
    @XmlCDATA
    public void setAppointmentID(String appointmentID) {
        this.appointmentId = appointmentID;
    }
    @XmlCDATA
    public String getAppointmentDTTM() {
        return appointmentDTTM;
    }
    @XmlCDATA
    public void setAppointmentDTTM(String appointmentDTTM) {
        this.appointmentDTTM = appointmentDTTM;
    }
    @XmlCDATA
    public String getAppointmentDuration() {
        return appointmentDuration;
    }
    @XmlCDATA
    public void setAppointmentDuration(String appointmentDuration) {
        this.appointmentDuration = appointmentDuration;
    }
    @XmlCDATA
    public String getScheduleAppointment() {
        return scheduleAppointment;
    }
    @XmlCDATA
    public void setScheduleAppointment(String scheduleAppointment) {
        this.scheduleAppointment = scheduleAppointment;
    }
    @XmlCDATA
    public String getFirmAppointmentIndicator() {
        return firmAppointmentIndicator;
    }
    @XmlCDATA
    public void setFirmAppointmentIndicator(String firmAppointmentIndicator) {
        this.firmAppointmentIndicator = firmAppointmentIndicator;
    }
    @XmlCDATA
    public String getAssignedCarrierCode() {
        return assignedCarrierCode;
    }
    @XmlCDATA
    public void setAssignedCarrierCode(String assignedCarrierCode) {
        this.assignedCarrierCode = assignedCarrierCode;
    }
    @XmlCDATA
    public String getDriverName() {
        return driverName;
    }
    @XmlCDATA
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    @XmlCDATA
    public String getBillOfLadingNumber() {
        return billOfLadingNumber;
    }
    @XmlCDATA
    public void setBillOfLadingNumber(String billOfLadingNumber) {
        this.billOfLadingNumber = billOfLadingNumber;
    }
    @XmlCDATA
    public String getPRONumber() {
        return proNumber;
    }
    @XmlCDATA
    public void setPRONumber(String PRONumber) {
        this.proNumber = PRONumber;
    }
    @XmlCDATA
    public String getEquipmentCode() {
        return equipmentCode;
    }
    @XmlCDATA
    public void setEquipmentCode(String equipmentCode) {
        this.equipmentCode = equipmentCode;
    }
    @XmlCDATA
    public String getTractorCarrierCode() {
        return tractorCarrierCode;
    }
    @XmlCDATA
    public void setTractorCarrierCode(String tractorCarrierCode) {
        this.tractorCarrierCode = tractorCarrierCode;
    }
    @XmlCDATA
    public String getTractorNumber() {
        return tractorNumber;
    }
    @XmlCDATA
    public void setTractorNumber(String tractorNumber) {
        this.tractorNumber = tractorNumber;
    }
    @XmlCDATA
    public String getMode() {
        return mode;
    }
    @XmlCDATA
    public void setMode(String mode) {
        this.mode = mode;
    }
    @XmlCDATA
    public String getShippingCost() {
        return shippingCost;
    }
    @XmlCDATA
    public void setShippingCost(String shippingCost) {
        this.shippingCost = shippingCost;
    }
    @XmlCDATA
    public String getShippingCostCurrency() {
        return shippingCostCurrency;
    }
    @XmlCDATA
    public void setShippingCostCurrency(String shippingCostCurrency) {
        this.shippingCostCurrency = shippingCostCurrency;
    }
    @XmlCDATA
    public String getBuyerCode() {
        return buyerCode;
    }
    @XmlCDATA
    public void setBuyerCode(String buyerCode) {
        this.buyerCode = buyerCode;
    }
    @XmlCDATA
    public String getRepresentativeName() {
        return representativeName;
    }
    @XmlCDATA
    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }
    @XmlCDATA
    public String getContactAddress1() {
        return contactAddress1;
    }
    @XmlCDATA
    public void setContactAddress1(String contactAddress1) {
        this.contactAddress1 = contactAddress1;
    }
    @XmlCDATA
    public String getContactAddress2() {
        return contactAddress2;
    }
    @XmlCDATA
    public void setContactAddress2(String contactAddress2) {
        this.contactAddress2 = contactAddress2;
    }
    @XmlCDATA
    public String getContactAddress3() {
        return contactAddress3;
    }
    @XmlCDATA
    public void setContactAddress3(String contactAddress3) {
        this.contactAddress3 = contactAddress3;
    }
    @XmlCDATA
    public String getContactCity() {
        return contactCity;
    }
    @XmlCDATA
    public void setContactCity(String contactCity) {
        this.contactCity = contactCity;
    }
    @XmlCDATA
    public String getContactStateOrProvince() {
        return contactStateOrProvince;
    }
    @XmlCDATA
    public void setContactStateOrProvince(String contactStateOrProvince) {
        this.contactStateOrProvince = contactStateOrProvince;
    }
    @XmlCDATA
    public String getContactPostalCode() {
        return this.contactPostalCode;
    }
    @XmlCDATA
    public void setContactPostalCode(String contactPostalCode) {
        this.contactPostalCode = contactPostalCode;
    }
    @XmlCDATA
    public String getContactCounty() {
        return contactCounty;
    }
    @XmlCDATA
    public void setContactCounty(String contactCounty) {
        this.contactCounty = contactCounty;
    }
    @XmlCDATA
    public String getContactCountry() {
        return contactCountry;
    }
    @XmlCDATA
    public void setContactCountry(String contactCountry) {
        this.contactCountry = contactCountry;
    }
    @XmlCDATA
    public String getContactNumber() {
        return contactNumber;
    }
    @XmlCDATA
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    @XmlCDATA
    public String getRefField1() {
        return refField1;
    }
    @XmlCDATA
    public void setRefField1(String refField1) {
        this.refField1 = refField1;
    }
    @XmlCDATA
    public String getRefField2() {
        return refField2;
    }

    @XmlCDATA
    public void setRefField2(String refField2) {
        this.refField2 = refField2;
    }

    @XmlCDATA
    public String getRefField3() {
        return refField3;
    }
    @XmlCDATA
    public void setRefField3(String refField3) {
        this.refField3 = refField3;
    }
    @XmlCDATA
    public String getExternalSysCreationDTTM() {
        return externalSysCreationDTTM;
    }
    @XmlCDATA
    public void setExternalSysCreationDTTM(String externalSysCreationDTTM) {
        this.externalSysCreationDTTM = externalSysCreationDTTM;
    }
    @XmlCDATA
    public String getEquipmentType() {
        return equipmentType;
    }
    @XmlCDATA
    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }
    @XmlCDATA
    public String getOriginType() {
        return originType;
    }
    @XmlCDATA
    public void setOriginType(String originType) {
        this.originType = originType;
    }
    @XmlCDATA
    public String getDestinationType() {
        return destinationType;
    }
    @XmlCDATA
    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }
    @XmlCDATA
    public String getDCOrderNumber() {
        return dcOrderNumber;
    }
    @XmlCDATA
    public void setDCOrderNumber(String DCOrderNumber) {
        this.dcOrderNumber = DCOrderNumber;
    }
    @XmlCDATA
    public String getContractLocation() {
        return contractLocation;
    }
    @XmlCDATA
    public void setContractLocation(String contractLocation) {
        this.contractLocation = contractLocation;
    }
    @XmlCDATA
    public String getTransferFlag() {
        return transferFlag;
    }
    @XmlCDATA
    public void setTransferFlag(String transferFlag) {
        this.transferFlag = transferFlag;
    }
    @XmlCDATA
    public String getQualityCheckHoldUponReceipt() {
        return qualityCheckHoldUponReceipt;
    }
    @XmlCDATA
    public void setQualityCheckHoldUponReceipt(String qualityCheckHoldUponReceipt) {
        this.qualityCheckHoldUponReceipt = qualityCheckHoldUponReceipt;
    }
    @XmlCDATA
    public String getManifNbr() {
        return manifNbr;
    }
    @XmlCDATA
    public void setManifNbr(String manifNbr) {
        this.manifNbr = manifNbr;
    }
    @XmlCDATA
    public String getManifType() {
        return manifType;
    }
    @XmlCDATA
    public void setManifType(String manifType) {
        this.manifType = manifType;
    }
    @XmlCDATA
    public String getDeliveryStopSeq() {
        return deliveryStopSeq;
    }
    @XmlCDATA
    public void setDeliveryStopSeq(String deliveryStopSeq) {
        this.deliveryStopSeq = deliveryStopSeq;
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
    public String getIsCancelled() {
        return isCancelled;
    }
    @XmlCDATA
    public void setIsCancelled(String isCancelled) {
        this.isCancelled = isCancelled;
    }
    @XmlCDATA
    public String getIsClosed() {
        return isClosed;
    }
    @XmlCDATA
    public void setIsClosed(String isClosed) {
        this.isClosed = isClosed;
    }
    @XmlCDATA
    public String getTrailerNbr() {
        return trailerNbr;
    }
    @XmlCDATA
    public void setTrailerNbr(String trailerNbr) {
        this.trailerNbr = trailerNbr;
    }
    @XmlCDATA
    public String getShippedLPNCount() {
        return shippedLPNCount;
    }
    @XmlCDATA
    public void setShippedLPNCount(String shippedLPNCount) {
        this.shippedLPNCount = shippedLPNCount;
    }
    @XmlCDATA
    public String getFlowthruAllocMethod() {
        return flowthruAllocMethod;
    }
    @XmlCDATA
    public void setFlowthruAllocMethod(String flowthruAllocMethod) {
        this.flowthruAllocMethod = flowthruAllocMethod;
    }
    @XmlCDATA
    public String getExpectedReceiptDate() {
        return expectedReceiptDate;
    }
    @XmlCDATA
    public void setExpectedReceiptDate(String expectedReceiptDate) {
        this.expectedReceiptDate = expectedReceiptDate;
    }
    @XmlCDATA
    public String getWorkOrdNbr() {
        return workOrdNbr;
    }
    @XmlCDATA
    public void setWorkOrdNbr(String workOrdNbr) {
        this.workOrdNbr = workOrdNbr;
    }
    @XmlCDATA
    public String getTotalWeight() {
        return totalWeight;
    }
    @XmlCDATA
    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }
    @XmlCDATA
    public String getTotalWeightUOM() {
        return totalWeightUOM;
    }
    @XmlCDATA
    public void setTotalWeightUOM(String totalWeightUOM) {
        this.totalWeightUOM = totalWeightUOM;
    }
    @XmlCDATA
    public String getVolume() {
        return volume;
    }
    @XmlCDATA
    public void setVolume(String volume) {
        this.volume = volume;
    }
    @XmlCDATA
    public String getVolumeUOM() {
        return volumeUOM;
    }
    @XmlCDATA
    public void setVolumeUOM(String volumeUOM) {
        this.volumeUOM = volumeUOM;
    }
    @XmlCDATA
    public String getReceiptType() {
        return receiptType;
    }
    @XmlCDATA
    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }
    @XmlCDATA
    public String getReturnReferenceNumber() {
        return returnReferenceNumber;
    }
    @XmlCDATA
    public void setReturnReferenceNumber(String returnReferenceNumber) {
        this.returnReferenceNumber = returnReferenceNumber;
    }

    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public LPN getLpn() {
        return lpn;
    }

    public void setLpn(LPN lpn) {
        this.lpn = lpn;
    }


    @Override
    public String toString() {
        return "ASN{" +
                "asnId='" + asnId + '\'' +
                ", asnType='" + asnType + '\'' +
                ", shipmentId='" + shipmentId + '\'' +
                ", LastTransmittedDTTM='" + lastTransmittedDTTM + '\'' +
                ", ASNStatus='" + asnStatus + '\'' +
                ", ASNPriority='" + asnPriority + '\'' +
                ", BusinessPartnerCode='" + businessPartnerCode + '\'' +
                ", BusinessUnit='" + businessUnit + '\'' +
                ", OriginFacilityAliasID='" + originFacilityAliasID + '\'' +
                ", DestinationFacilityAliasID='" + destinationFacilityAliasID + '\'' +
                ", MfgPlant='" + mfgPlant + '\'' +
                ", PalletFootprint='" + palletFootprint + '\'' +
                ", PickupEndDTTM='" + pickupEndDTTM + '\'' +
                ", ActualShippedDTTM='" + actualShippedDTTM + '\'' +
                ", DeliveryStart='" + deliveryStart + '\'' +
                ", DeliveryEnd='" + deliveryEnd + '\'' +
                ", AppointmentID='" + appointmentId + '\'' +
                ", AppointmentDTTM='" + appointmentDTTM + '\'' +
                ", AppointmentDuration='" + appointmentDuration + '\'' +
                ", ScheduleAppointment='" + scheduleAppointment + '\'' +
                ", FirmAppointmentIndicator='" + firmAppointmentIndicator + '\'' +
                ", AssignedCarrierCode='" + assignedCarrierCode + '\'' +
                ", DriverName='" + driverName + '\'' +
                ", BillOfLadingNumber='" + billOfLadingNumber + '\'' +
                ", PRONumber='" + proNumber + '\'' +
                ", EquipmentCode='" + equipmentCode + '\'' +
                ", TractorCarrierCode='" + tractorCarrierCode + '\'' +
                ", TractorNumber='" + tractorNumber + '\'' +
                ", Mode='" + mode + '\'' +
                ", ShippingCost='" + shippingCost + '\'' +
                ", ShippingCostCurrency='" + shippingCostCurrency + '\'' +
                ", BuyerCode='" + buyerCode + '\'' +
                ", RepresentativeName='" + representativeName + '\'' +
                ", ContactAddress1='" + contactAddress1 + '\'' +
                ", ContactAddress2='" + contactAddress2 + '\'' +
                ", ContactAddress3='" + contactAddress3 + '\'' +
                ", ContactCity='" + contactCity + '\'' +
                ", ContactStateOrProvince='" + contactStateOrProvince + '\'' +
                ", ContactPostalCode='" + contactPostalCode + '\'' +
                ", ContactCounty='" + contactCounty + '\'' +
                ", ContactNumber='" + contactNumber + '\'' +
                ", RefField1='" + refField1 + '\'' +
                ", RefField2='" + refField2 + '\'' +
                ", RefField3='" + refField3 + '\'' +
                ", ExternalSysCreationDTTM='" + externalSysCreationDTTM + '\'' +
                ", EquipmentType='" + equipmentType + '\'' +
                ", OriginType='" + originType + '\'' +
                ", DestinationType='" + destinationType + '\'' +
                ", DCOrderNumber='" + dcOrderNumber + '\'' +
                ", ContractLocation='" + contractLocation + '\'' +
                ", TransferFlag='" + transferFlag + '\'' +
                ", QualityCheckHoldUponReceipt='" + qualityCheckHoldUponReceipt + '\'' +
                ", ManifNbr='" + manifNbr + '\'' +
                ", ManifType='" + manifType + '\'' +
                ", DeliveryStopSeq='" + deliveryStopSeq + '\'' +
                ", CutNbr='" + cutNbr + '\'' +
                ", IsCancelled='" + isCancelled + '\'' +
                ", IsClosed='" + isClosed + '\'' +
                ", TrailerNbr='" + trailerNbr + '\'' +
                ", ShippedLPNCount='" + shippedLPNCount + '\'' +
                ", FlowthruAllocMethod='" + flowthruAllocMethod + '\'' +
                ", ExpectedReceiptDate='" + expectedReceiptDate + '\'' +
                ", WorkOrdNbr='" + workOrdNbr + '\'' +
                ", TotalWeight='" + totalWeight + '\'' +
                ", TotalWeightUOM='" + totalWeightUOM + '\'' +
                ", Volume='" + volume + '\'' +
                ", VolumeUOM='" + volumeUOM + '\'' +
                ", ReceiptType='" + receiptType + '\'' +
                ", ReturnReferenceNumber='" + returnReferenceNumber + '\'' +
                ", customFieldList=" + customFieldList +
                ", lpn=" + lpn +
                '}';
    }
}
