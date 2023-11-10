package com.dhdigital.api.model.backend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfServiceRequestBackend", propOrder = { "serviceRequestBackend" })
public class ListOfServiceRequestBackend {
	
	@XmlElement(name = "ServiceRequest", required = true, namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private ServiceRequestBackend serviceRequestBackend;

	public ServiceRequestBackend getComplaintRequestBackend() {
		return serviceRequestBackend;
	}

	public void setComplaintRequestBackend(ServiceRequestBackend serviceRequestBackend) {
		this.serviceRequestBackend = serviceRequestBackend;
	}

}
