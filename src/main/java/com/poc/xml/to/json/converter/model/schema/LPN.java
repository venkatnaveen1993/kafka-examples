package com.poc.xml.to.json.converter.model.schema;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "LPN")
@XmlAccessorType(XmlAccessType.FIELD)
public class LPN implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "LPNID")
    private String lpnID;

    @XmlElement(name = "BusinessUnit")
    private String businessUnit;

    @XmlElement(name = "LPNType")
    private String lpnType;

    @XmlElement(name = "LPNLabelType")
    private String lpnLabelType;

    @XmlElement(name = "LPNSizeType")
    private String lpnSizeType;

    @XmlElement(name = "LPNStatus")
    private String lpnStatus;

    @XmlElement(name = "LPNStatusDate")
    private String lpnStatusDate;

    @XmlElement(name = "LPNFacilityStatus")
    private String lpnFacilityStatus;

    @XmlElement(name = "InboundOutboundIndicator")
    private String inboundOutboundIndicator;

    @XmlElement(name = "SingleItemCase")
    private String singleItemCase;

    @XmlElement(name = "Height")
    private String height;

    @XmlElement(name = "Width")
    private String width;

    @XmlElement(name = "Length")
    private String length;

    @XmlElement(name = "OriginFacilityAliasID")
    private String originFacilityAliasID;

    @XmlElement(name = "CurrentFacilityAliasID")
    private String currentFacilityAliasID;

    @XmlElement(name = "DestinationFacilityAliasID")
    private String destinationFacilityAliasID;

    @XmlElement(name = "FinalDestinationFacilityAliasID")
    private String finalDestinationFacilityAliasID;

    @XmlElement(name = "ManufacturingFacilityAliasID")
    private String manufacturingFacilityAliasID;

    @XmlElement(name = "ProcessImmdNeeds")
    private String processImmdNeeds;

    @XmlElement(name = "PutawayType")
    private String putawayType;

    @XmlElement(name = "ShipVia")
    private String shipVia;

    @XmlElement(name = "Carrier")
    private String carrier;

    @XmlElement(name = "Mode")
    private String mode;

    @XmlElement(name = "ServiceLevel")
    private String serviceLevel;

    @XmlElement(name = "TrackingNbr")
    private String trackingNbr;

    @XmlElement(name = "ReturnTrackingNumber")
    private String returnTrackingNumber;

    @XmlElement(name = "ReturnReferenceNumber")
    private String returnReferenceNumber;

    @XmlElement(name = "ConsumeSeq")
    private String consumeSeq;

    @XmlElement(name = "PalletID")
    private String palletID;

    @XmlElement(name = "Conveyable")
    private String conveyable;

    @XmlElement(name = "ManufacturedDTTM")
    private String manufacturedDTTM;

    @XmlElement(name = "WorkOrdNbr")
    private String workOrdNbr;

    @XmlElement(name = "ShipByDate")
    private String shipByDate;

    @XmlElement(name = "BusinessPartnerId")
    private String businessPartnerId;

    @XmlElement(name = "ExpireDate")
    private String expireDate;

    @XmlElement(name = "LocationID")
    private String locationID;

    @XmlElement(name = "PurchaseOrderID")
    private String purchaseOrderID;

    @XmlElement(name = "DistributionOrderID")
    private String distributionOrderID;

    @XmlElement(name = "OriginalShipmentNbr")
    private String originalShipmentNbr;

    @XmlElement(name = "ConsumeCasePriority")
    private String consumeCasePriority;

    @XmlElement(name = "ConsumePriorityDate")
    private String consumePriorityDate;

    @XmlElement(name = "ManifNbr")
    private String manifNbr;

    @XmlElement(name = "OutofZoneIndicator")
    private String outofZoneIndicator;

    @XmlElement(name = "PhysicalEntityCode")
    private String physicalEntityCode;

    @XmlElement(name = "VendorContainerNbr")
    private String vendorContainerNbr;

    @XmlElement(name = "IncubationDate")
    private String incubationDate;

    @XmlElement(name = "InstructionCode1")
    private String instructionCode1;

    @XmlElement(name = "InstructionCode2")
    private String instructionCode2;

    @XmlElement(name = "InstructionCode3")
    private String instructionCode3;

    @XmlElement(name = "InstructionCode4")
    private String instructionCode4;

    @XmlElement(name = "InstructionCode5")
    private String instructionCode5;

    @XmlElement(name = "EstimatedWeight")
    private String estimatedWeight;

    @XmlElement(name = "ActualWeight")
    private String actualWeight;

    @XmlElement(name = "WeightUOM")
    private String weightUOM;

    @XmlElement(name = "EstimatedVolume")
    private String estimatedVolume;

    @XmlElement(name = "ActualVolume")
    private String actualVolume;

    @XmlElement(name = "VolumeUOM")
    private String volumeUOM;

    @XmlElement(name = "PackageType")
    private String packageType;

    @XmlElement(name = "IsCancelled")
    private String isCancelled;

    @XmlElement(name = "ReceiptType")
    private String receiptType;

    @XmlElement(name = "CrossdockOrderId")
    private String crossdockOrderId;

    @XmlElement(name = "ContainsDryIce")
    private String containsDryIce;

    @XmlElement(name = "Location")
    private Location location;

    @XmlElement(name = "CustomFieldList")
    private CustomFieldList customFieldList;

    @XmlElement(name = "LPNMovement")
    private LPNMovement lpnMovement;

    @XmlElement(name = "LPNDetail")
    private LPNDetail lpnDetail;

    public LPN() {
    }

    public LPN(String lpnID, String businessUnit, String lpnType, String lpnLabelType, String lpnSizeType, String lpnStatus, String lpnStatusDate, String lpnFacilityStatus, String inboundOutboundIndicator, String singleItemCase, String height, String width, String length, String originFacilityAliasID, String currentFacilityAliasID, String destinationFacilityAliasID, String finalDestinationFacilityAliasID, String manufacturingFacilityAliasID, String processImmdNeeds, String putawayType, String shipVia, String carrier, String mode, String serviceLevel, String trackingNbr, String returnTrackingNumber, String returnReferenceNumber, String consumeSeq, String palletID, String conveyable, String manufacturedDTTM, String workOrdNbr, String shipByDate, String businessPartnerId, String expireDate, String locationID, String purchaseOrderID, String distributionOrderID, String originalShipmentNbr, String consumeCasePriority, String consumePriorityDate, String manifNbr, String outofZoneIndicator, String physicalEntityCode, String vendorContainerNbr, String incubationDate, String instructionCode1, String instructionCode2, String instructionCode3, String instructionCode4, String instructionCode5, String estimatedWeight, String actualWeight, String weightUOM, String estimatedVolume, String actualVolume, String volumeUOM, String packageType, String isCancelled, String receiptType, String crossdockOrderId, String containsDryIce, Location location, CustomFieldList customFieldList, LPNMovement lpnMovement, LPNDetail lpnDetail) {
        this.lpnID = lpnID;
        this.businessUnit = businessUnit;
        this.lpnType = lpnType;
        this.lpnLabelType = lpnLabelType;
        this.lpnSizeType = lpnSizeType;
        this.lpnStatus = lpnStatus;
        this.lpnStatusDate = lpnStatusDate;
        this.lpnFacilityStatus = lpnFacilityStatus;
        this.inboundOutboundIndicator = inboundOutboundIndicator;
        this.singleItemCase = singleItemCase;
        this.height = height;
        this.width = width;
        this.length = length;
        this.originFacilityAliasID = originFacilityAliasID;
        this.currentFacilityAliasID = currentFacilityAliasID;
        this.destinationFacilityAliasID = destinationFacilityAliasID;
        this.finalDestinationFacilityAliasID = finalDestinationFacilityAliasID;
        this.manufacturingFacilityAliasID = manufacturingFacilityAliasID;
        this.processImmdNeeds = processImmdNeeds;
        this.putawayType = putawayType;
        this.shipVia = shipVia;
        this.carrier = carrier;
        this.mode = mode;
        this.serviceLevel = serviceLevel;
        this.trackingNbr = trackingNbr;
        this.returnTrackingNumber = returnTrackingNumber;
        this.returnReferenceNumber = returnReferenceNumber;
        this.consumeSeq = consumeSeq;
        this.palletID = palletID;
        this.conveyable = conveyable;
        this.manufacturedDTTM = manufacturedDTTM;
        this.workOrdNbr = workOrdNbr;
        this.shipByDate = shipByDate;
        this.businessPartnerId = businessPartnerId;
        this.expireDate = expireDate;
        this.locationID = locationID;
        this.purchaseOrderID = purchaseOrderID;
        this.distributionOrderID = distributionOrderID;
        this.originalShipmentNbr = originalShipmentNbr;
        this.consumeCasePriority = consumeCasePriority;
        this.consumePriorityDate = consumePriorityDate;
        this.manifNbr = manifNbr;
        this.outofZoneIndicator = outofZoneIndicator;
        this.physicalEntityCode = physicalEntityCode;
        this.vendorContainerNbr = vendorContainerNbr;
        this.incubationDate = incubationDate;
        this.instructionCode1 = instructionCode1;
        this.instructionCode2 = instructionCode2;
        this.instructionCode3 = instructionCode3;
        this.instructionCode4 = instructionCode4;
        this.instructionCode5 = instructionCode5;
        this.estimatedWeight = estimatedWeight;
        this.actualWeight = actualWeight;
        this.weightUOM = weightUOM;
        this.estimatedVolume = estimatedVolume;
        this.actualVolume = actualVolume;
        this.volumeUOM = volumeUOM;
        this.packageType = packageType;
        this.isCancelled = isCancelled;
        this.receiptType = receiptType;
        this.crossdockOrderId = crossdockOrderId;
        this.containsDryIce = containsDryIce;
        this.location = location;
        this.customFieldList = customFieldList;
        this.lpnMovement = lpnMovement;
        this.lpnDetail = lpnDetail;
    }

    @XmlCDATA
    public String getLpnID() {
        return lpnID;
    }
    @XmlCDATA
    public void setLpnID(String lpnID) {
        this.lpnID = lpnID;
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
    public String getLpnType() {
        return lpnType;
    }
    @XmlCDATA
    public void setLpnType(String lpnType) {
        this.lpnType = lpnType;
    }
    @XmlCDATA
    public String getLpnLabelType() {
        return lpnLabelType;
    }
    @XmlCDATA
    public void setLpnLabelType(String lpnLabelType) {
        this.lpnLabelType = lpnLabelType;
    }
    @XmlCDATA
    public String getLpnSizeType() {
        return lpnSizeType;
    }
    @XmlCDATA
    public void setLpnSizeType(String lpnSizeType) {
        this.lpnSizeType = lpnSizeType;
    }
    @XmlCDATA
    public String getLpnStatus() {
        return lpnStatus;
    }
    @XmlCDATA
    public void setLpnStatus(String lpnStatus) {
        this.lpnStatus = lpnStatus;
    }
    @XmlCDATA
    public String getLpnStatusDate() {
        return lpnStatusDate;
    }
    @XmlCDATA
    public void setLpnStatusDate(String lpnStatusDate) {
        this.lpnStatusDate = lpnStatusDate;
    }
    @XmlCDATA
    public String getLpnFacilityStatus() {
        return lpnFacilityStatus;
    }
    @XmlCDATA
    public void setLpnFacilityStatus(String lpnFacilityStatus) {
        this.lpnFacilityStatus = lpnFacilityStatus;
    }
    @XmlCDATA
    public String getInboundOutboundIndicator() {
        return inboundOutboundIndicator;
    }
    @XmlCDATA
    public void setInboundOutboundIndicator(String inboundOutboundIndicator) {
        this.inboundOutboundIndicator = inboundOutboundIndicator;
    }
    @XmlCDATA
    public String getSingleItemCase() {
        return singleItemCase;
    }
    @XmlCDATA
    public void setSingleItemCase(String singleItemCase) {
        this.singleItemCase = singleItemCase;
    }
    @XmlCDATA
    public String getHeight() {
        return height;
    }
    @XmlCDATA
    public void setHeight(String height) {
        this.height = height;
    }
    @XmlCDATA
    public String getWidth() {
        return width;
    }
    @XmlCDATA
    public void setWidth(String width) {
        this.width = width;
    }
    @XmlCDATA
    public String getLength() {
        return length;
    }
    @XmlCDATA
    public void setLength(String length) {
        this.length = length;
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
    public String getCurrentFacilityAliasID() {
        return currentFacilityAliasID;
    }
    @XmlCDATA
    public void setCurrentFacilityAliasID(String currentFacilityAliasID) {
        this.currentFacilityAliasID = currentFacilityAliasID;
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
    public String getFinalDestinationFacilityAliasID() {
        return finalDestinationFacilityAliasID;
    }
    @XmlCDATA
    public void setFinalDestinationFacilityAliasID(String finalDestinationFacilityAliasID) {
        this.finalDestinationFacilityAliasID = finalDestinationFacilityAliasID;
    }
    @XmlCDATA
    public String getManufacturingFacilityAliasID() {
        return manufacturingFacilityAliasID;
    }
    @XmlCDATA
    public void setManufacturingFacilityAliasID(String manufacturingFacilityAliasID) {
        this.manufacturingFacilityAliasID = manufacturingFacilityAliasID;
    }
    @XmlCDATA
    public String getProcessImmdNeeds() {
        return processImmdNeeds;
    }
    @XmlCDATA
    public void setProcessImmdNeeds(String processImmdNeeds) {
        this.processImmdNeeds = processImmdNeeds;
    }
    @XmlCDATA
    public String getPutawayType() {
        return putawayType;
    }
    @XmlCDATA
    public void setPutawayType(String putawayType) {
        this.putawayType = putawayType;
    }
    @XmlCDATA
    public String getShipVia() {
        return shipVia;
    }
    @XmlCDATA
    public void setShipVia(String shipVia) {
        this.shipVia = shipVia;
    }
    @XmlCDATA
    public String getCarrier() {
        return carrier;
    }
    @XmlCDATA
    public void setCarrier(String carrier) {
        this.carrier = carrier;
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
    public String getServiceLevel() {
        return serviceLevel;
    }
    @XmlCDATA
    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }
    @XmlCDATA
    public String getTrackingNbr() {
        return trackingNbr;
    }
    @XmlCDATA
    public void setTrackingNbr(String trackingNbr) {
        this.trackingNbr = trackingNbr;
    }
    @XmlCDATA
    public String getReturnTrackingNumber() {
        return returnTrackingNumber;
    }
    @XmlCDATA
    public void setReturnTrackingNumber(String returnTrackingNumber) {
        this.returnTrackingNumber = returnTrackingNumber;
    }
    @XmlCDATA
    public String getReturnReferenceNumber() {
        return returnReferenceNumber;
    }
    @XmlCDATA
    public void setReturnReferenceNumber(String returnReferenceNumber) {
        this.returnReferenceNumber = returnReferenceNumber;
    }
    @XmlCDATA
    public String getConsumeSeq() {
        return consumeSeq;
    }
    @XmlCDATA
    public void setConsumeSeq(String consumeSeq) {
        this.consumeSeq = consumeSeq;
    }
    @XmlCDATA
    public String getPalletID() {
        return palletID;
    }
    @XmlCDATA
    public void setPalletID(String palletID) {
        this.palletID = palletID;
    }
    @XmlCDATA
    public String getConveyable() {
        return conveyable;
    }
    @XmlCDATA
    public void setConveyable(String conveyable) {
        this.conveyable = conveyable;
    }
    @XmlCDATA
    public String getManufacturedDTTM() {
        return manufacturedDTTM;
    }
    @XmlCDATA
    public void setManufacturedDTTM(String manufacturedDTTM) {
        this.manufacturedDTTM = manufacturedDTTM;
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
    public String getShipByDate() {
        return shipByDate;
    }
    @XmlCDATA
    public void setShipByDate(String shipByDate) {
        this.shipByDate = shipByDate;
    }
    @XmlCDATA
    public String getBusinessPartnerId() {
        return businessPartnerId;
    }
    @XmlCDATA
    public void setBusinessPartnerId(String businessPartnerId) {
        this.businessPartnerId = businessPartnerId;
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
    public String getLocationID() {
        return locationID;
    }
    @XmlCDATA
    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }
    @XmlCDATA
    public String getPurchaseOrderID() {
        return purchaseOrderID;
    }
    @XmlCDATA
    public void setPurchaseOrderID(String purchaseOrderID) {
        this.purchaseOrderID = purchaseOrderID;
    }
    @XmlCDATA
    public String getDistributionOrderID() {
        return distributionOrderID;
    }
    @XmlCDATA
    public void setDistributionOrderID(String distributionOrderID) {
        this.distributionOrderID = distributionOrderID;
    }
    @XmlCDATA
    public String getOriginalShipmentNbr() {
        return originalShipmentNbr;
    }
    @XmlCDATA
    public void setOriginalShipmentNbr(String originalShipmentNbr) {
        this.originalShipmentNbr = originalShipmentNbr;
    }
    @XmlCDATA
    public String getConsumeCasePriority() {
        return consumeCasePriority;
    }
    @XmlCDATA
    public void setConsumeCasePriority(String consumeCasePriority) {
        this.consumeCasePriority = consumeCasePriority;
    }
    @XmlCDATA
    public String getConsumePriorityDate() {
        return consumePriorityDate;
    }
    @XmlCDATA
    public void setConsumePriorityDate(String consumePriorityDate) {
        this.consumePriorityDate = consumePriorityDate;
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
    public String getOutofZoneIndicator() {
        return outofZoneIndicator;
    }
    @XmlCDATA
    public void setOutofZoneIndicator(String outofZoneIndicator) {
        this.outofZoneIndicator = outofZoneIndicator;
    }
    @XmlCDATA
    public String getPhysicalEntityCode() {
        return physicalEntityCode;
    }
    @XmlCDATA
    public void setPhysicalEntityCode(String physicalEntityCode) {
        this.physicalEntityCode = physicalEntityCode;
    }
    @XmlCDATA
    public String getVendorContainerNbr() {
        return vendorContainerNbr;
    }
    @XmlCDATA
    public void setVendorContainerNbr(String vendorContainerNbr) {
        this.vendorContainerNbr = vendorContainerNbr;
    }
    @XmlCDATA
    public String getIncubationDate() {
        return incubationDate;
    }
    @XmlCDATA
    public void setIncubationDate(String incubationDate) {
        this.incubationDate = incubationDate;
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
    public String getEstimatedWeight() {
        return estimatedWeight;
    }
    @XmlCDATA
    public void setEstimatedWeight(String estimatedWeight) {
        this.estimatedWeight = estimatedWeight;
    }
    @XmlCDATA
    public String getActualWeight() {
        return actualWeight;
    }
    @XmlCDATA
    public void setActualWeight(String actualWeight) {
        this.actualWeight = actualWeight;
    }
    @XmlCDATA
    public String getWeightUOM() {
        return weightUOM;
    }
    @XmlCDATA
    public void setWeightUOM(String weightUOM) {
        this.weightUOM = weightUOM;
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
    public String getActualVolume() {
        return actualVolume;
    }
    @XmlCDATA
    public void setActualVolume(String actualVolume) {
        this.actualVolume = actualVolume;
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
    public String getPackageType() {
        return packageType;
    }
    @XmlCDATA
    public void setPackageType(String packageType) {
        this.packageType = packageType;
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
    public String getReceiptType() {
        return receiptType;
    }
    @XmlCDATA
    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }
    @XmlCDATA
    public String getCrossdockOrderId() {
        return crossdockOrderId;
    }
    @XmlCDATA
    public void setCrossdockOrderId(String crossdockOrderId) {
        this.crossdockOrderId = crossdockOrderId;
    }
    @XmlCDATA
    public String getContainsDryIce() {
        return containsDryIce;
    }
    @XmlCDATA
    public void setContainsDryIce(String containsDryIce) {
        this.containsDryIce = containsDryIce;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public LPNMovement getLpnMovement() {
        return lpnMovement;
    }

    public void setLpnMovement(LPNMovement lpnMovement) {
        this.lpnMovement = lpnMovement;
    }

    public LPNDetail getLpnDetail() {
        return lpnDetail;
    }

    public void setLpnDetail(LPNDetail lpnDetail) {
        this.lpnDetail = lpnDetail;
    }

    @Override
    public String toString() {
        return "LPN{" +
                "lpnID='" + lpnID + '\'' +
                ", businessUnit='" + businessUnit + '\'' +
                ", lpnType='" + lpnType + '\'' +
                ", lpnLabelType='" + lpnLabelType + '\'' +
                ", lpnSizeType='" + lpnSizeType + '\'' +
                ", lpnStatus='" + lpnStatus + '\'' +
                ", lpnStatusDate='" + lpnStatusDate + '\'' +
                ", lpnFacilityStatus='" + lpnFacilityStatus + '\'' +
                ", inboundOutboundIndicator='" + inboundOutboundIndicator + '\'' +
                ", singleItemCase='" + singleItemCase + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                ", length='" + length + '\'' +
                ", originFacilityAliasID='" + originFacilityAliasID + '\'' +
                ", currentFacilityAliasID='" + currentFacilityAliasID + '\'' +
                ", destinationFacilityAliasID='" + destinationFacilityAliasID + '\'' +
                ", finalDestinationFacilityAliasID='" + finalDestinationFacilityAliasID + '\'' +
                ", manufacturingFacilityAliasID='" + manufacturingFacilityAliasID + '\'' +
                ", processImmdNeeds='" + processImmdNeeds + '\'' +
                ", putawayType='" + putawayType + '\'' +
                ", shipVia='" + shipVia + '\'' +
                ", carrier='" + carrier + '\'' +
                ", mode='" + mode + '\'' +
                ", serviceLevel='" + serviceLevel + '\'' +
                ", trackingNbr='" + trackingNbr + '\'' +
                ", returnTrackingNumber='" + returnTrackingNumber + '\'' +
                ", returnReferenceNumber='" + returnReferenceNumber + '\'' +
                ", consumeSeq='" + consumeSeq + '\'' +
                ", palletID='" + palletID + '\'' +
                ", conveyable='" + conveyable + '\'' +
                ", manufacturedDTTM='" + manufacturedDTTM + '\'' +
                ", workOrdNbr='" + workOrdNbr + '\'' +
                ", shipByDate='" + shipByDate + '\'' +
                ", businessPartnerId='" + businessPartnerId + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", locationID='" + locationID + '\'' +
                ", purchaseOrderID='" + purchaseOrderID + '\'' +
                ", distributionOrderID='" + distributionOrderID + '\'' +
                ", originalShipmentNbr='" + originalShipmentNbr + '\'' +
                ", consumeCasePriority='" + consumeCasePriority + '\'' +
                ", consumePriorityDate='" + consumePriorityDate + '\'' +
                ", manifNbr='" + manifNbr + '\'' +
                ", outofZoneIndicator='" + outofZoneIndicator + '\'' +
                ", physicalEntityCode='" + physicalEntityCode + '\'' +
                ", vendorContainerNbr='" + vendorContainerNbr + '\'' +
                ", incubationDate='" + incubationDate + '\'' +
                ", instructionCode1='" + instructionCode1 + '\'' +
                ", instructionCode2='" + instructionCode2 + '\'' +
                ", instructionCode3='" + instructionCode3 + '\'' +
                ", instructionCode4='" + instructionCode4 + '\'' +
                ", instructionCode5='" + instructionCode5 + '\'' +
                ", estimatedWeight='" + estimatedWeight + '\'' +
                ", actualWeight='" + actualWeight + '\'' +
                ", weightUOM='" + weightUOM + '\'' +
                ", estimatedVolume='" + estimatedVolume + '\'' +
                ", actualVolume='" + actualVolume + '\'' +
                ", volumeUOM='" + volumeUOM + '\'' +
                ", packageType='" + packageType + '\'' +
                ", isCancelled='" + isCancelled + '\'' +
                ", receiptType='" + receiptType + '\'' +
                ", crossdockOrderId='" + crossdockOrderId + '\'' +
                ", containsDryIce='" + containsDryIce + '\'' +
                ", location=" + location +
                ", customFieldList=" + customFieldList +
                ", lpnMovement=" + lpnMovement +
                ", lpnDetail=" + lpnDetail +
                '}';
    }
}

