package com.dhdigital.api.model.backend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ListOfServiceRequest")
@XmlType(name = "ListOfServiceRequest", propOrder = { "complaintRequestBackend" })
public class ListOfServiceRequest {
	
	@XmlElement(name = "ServiceRequest", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private ListOfServiceRequestBackend listOfServiceRequestBackend;

}
