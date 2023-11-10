package com.dhdigital.api.model.backend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CreateSR_Input", namespace = "http://siebel.com/CustomUI")
@XmlType(name = "", propOrder = { "listOfServiceRequestBackend", "asynchOut" })
public class CreateSR_InputBackend {
	
	@XmlElement(name = "ListOfServiceRequest", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input", required = true)
	private ListOfServiceRequestBackend listOfServiceRequestBackend;
	
	@XmlElement(name = "AsynchOut", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String asynchOut;


	public ListOfServiceRequestBackend getListOfServiceRequestBackend() {
		return listOfServiceRequestBackend;
	}
	
	public void setListOfServiceRequestBackend(ListOfServiceRequestBackend listOfServiceRequestBackend) {
		this.listOfServiceRequestBackend = listOfServiceRequestBackend;
	}

	public String getAsynchOut() {
		return asynchOut;
	}

	public void setAsynchOut(String asynchOut) {
		this.asynchOut = asynchOut;
	}
	
	

}
