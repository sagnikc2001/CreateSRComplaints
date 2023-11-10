package com.dhdigital.api.model.backend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CreateSR_Output", namespace = "http://siebel.com/CustomUI")
@XmlType(name = "", propOrder = { "asynchOut", "errorCode", "errorMessage", "srNumber" })
public class CreateSR_OutputBackend {
	
	@XmlElement(name = "AsynchOut", namespace = "http://siebel.com/CustomUI")
	private String asynchOut;
	

    @XmlElement(name = "ErrorCode", namespace = "http://siebel.com/CustomUI")
    private String errorCode;
    
    @XmlElement(name = "ErrorMessage", namespace = "http://siebel.com/CustomUI")
    private String errorMessage;
    
    @XmlElement(name = "SRNumber", namespace = "http://siebel.com/CustomUI")
    private String srNumber;

	public String getAsynchOut() {
		return asynchOut;
	}

	public void setAsynchOut(String asynchOut) {
		this.asynchOut = asynchOut;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getSrNumber() {
		return srNumber;
	}

	public void setSrNumber(String srNumber) {
		this.srNumber = srNumber;
	}
    
}
