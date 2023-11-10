package com.dhdigital.api.model.backend;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfServiceRequestAttachment", propOrder = {
    "attachment"
})
public class ListOfServiceRequestAttachmentBackend {
	
	@XmlElement(name = "ServiceRequestAttachment", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private List<AttachmentBackend> attachment;

	public List<AttachmentBackend> getAttachment() {
		return attachment;
	}

	public void setAttachment(List<AttachmentBackend> attachment) {
		this.attachment = attachment;
	}
	
}
