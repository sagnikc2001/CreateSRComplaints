package com.dhdigital.api.model.backend;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequestAttachment", propOrder = { "attachmentComments", "attachmentFileExtension", "attachmentFileName", "attachmentFileBuffer" })
public class AttachmentBackend
{
    @XmlElement(name = "AttachmentComments", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
    protected String attachmentComments;
    @XmlElement(name = "AttachmentFileExtension", required = true, namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
    protected String attachmentFileExtension;
    @XmlElement(name = "AttachmentFileName", required = true, namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
    protected String attachmentFileName;
    @XmlElement(name = "AttachmentFileBuffer", required = true, namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
    protected String attachmentFileBuffer;
    
    public String getAttachmentComments() {
        return this.attachmentComments;
    }
    
    public void setAttachmentComments(final String attachmentComments) {
        this.attachmentComments = attachmentComments;
    }
    
    public String getAttachmentFileExtension() {
        return this.attachmentFileExtension;
    }
    
    public void setAttachmentFileExtension(final String attachmentFileExtension) {
        this.attachmentFileExtension = attachmentFileExtension;
    }
    
    public String getAttachmentFileName() {
        return this.attachmentFileName;
    }
    
    public void setAttachmentFileName(final String attachmentFileName) {
        this.attachmentFileName = attachmentFileName;
    }

	public String getAttachmentFileBuffer() {
		return attachmentFileBuffer;
	}

	public void setAttachmentFileBuffer(String attachmentFileBuffer) {
		this.attachmentFileBuffer = attachmentFileBuffer;
	}
    
    
}