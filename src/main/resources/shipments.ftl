{

    "ShipFromLocationId": "${shipment.shipmentId}",
    	"FulfillmentAddress": [
    	{
    		"Address": {
    			"FirstName": "${shipment.representativeName !" "}",
    			"Address1": "${shipment.contactAddress1 !" "}",
    			"Address2": "${shipment.contactAddress2 !" "}",
    			"PostalCode": "${shipment.contactPostalCode !" "}",
    			"City": "${shipment.contactCity !" "}",
    			"State": "${shipment.contactStateOrProvince !" "}",
    			"County": "${shipment.contactCounty !" "}",
    			"Country": "${shipment.contactCountry !" "}"
    		},
    		"AddressTypeId": {
    			"AddressTypeId": "SHIPPING"
    		},
    		"FulfillmentAddressId": " "
    	}
    	],
    	"PickupExpiryDate": "${shipment.pickupEndDTTM !" "}",
        "WeightUOM": "${shipment.totalWeightUOM !" "}",
        "Packages": [
        {
        		"PackageId": "${shipment.lpn.lpnID !" " }",
        		"ShipFromLocationId": "${shipment.lpn.locationID !" "}",
        		"CurrentLocationId": "3217",
        		"ShipViaId": "${shipment.lpn.shipVia !" "}",
        		"TrackingNumber": "${shipment.lpn.trackingNbr !" "}",
        		"FulfillmentId": "23441222",
        		"PackageTypeId": "${shipment.lpn.packageType !" "}",
        		"ItemId": "${shipment.lpn.originalShipmentNbr !" "}",
        		"PackageStatus": {
        			"PackageStatusId": "${shipment.lpn.lpnStatus !" "}"
        		},
        		"PackageDetail": [
        		{
        			"PackageDetailId":  " ",
        			"ItemId":  " ",
        			"FulfillmentId": " ",
        			"Quantity": {
        				"Qty": " ",
        				"UOM": {
        					"name": " ",
        					"Code": " "
        				}
        			},
        			"FulfillmentLineId": " "
        		}
        		],
        		"ReceiptType": " ",
        		"DeliveryType": " ",
        		"ShipToLocationId": " "
        	}
        	],
        	"FulfillmentId": " ",
            	"ShippingDueDate": "${shipment.pickupEndDTTM !" "}",
            	"DeliveryMethodId": "${shipment.dcOrderNumber !" "}",
            	"MaxStatusId": "${shipment.asnStatus !" "}",
            	"MinStatusId": "${shipment.asnStatus !" "}",
            	"FulfillmentLine": [{
            		"ItemUnitWeight": " ",
            		"ItemId": " ",
            		"FulfillmentLineId": " ",
            		"FulfillmentLineStatusId": " ",
            		"ShippedQty": " ",
            		"QuantityUOM": " "
            	}]
}