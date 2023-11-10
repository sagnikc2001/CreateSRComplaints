package com.dhdigital.api.bean;

import org.springframework.stereotype.Component;

import com.dhdigital.api.model.backend.AttachmentBackend;
import com.dhdigital.api.model.backend.CreateSR_InputBackend;
import com.dhdigital.api.model.backend.ServiceRequestBackend;
import com.dhdigital.api.model.backend.ListOfServiceRequestBackend;
import com.dhdigital.api.model.backend.ListOfNotesBackend;
import com.dhdigital.api.model.backend.ListOfServiceRequestAttachmentBackend;
import com.dhdigital.api.model.backend.NotesBackend;
import com.dhdigital.api.model.frontend.Attachment;
import com.dhdigital.api.model.frontend.Complaint;
import com.dhdigital.api.model.frontend.ComplaintRequest;
import com.dhdigital.api.model.frontend.ComplaintResponse;
import com.dhdigital.api.model.frontend.CreateComplaintRequest;
import com.dhdigital.api.model.frontend.CreateComplaintResponse;
import com.dhdigital.api.model.frontend.ListOfNotes;
import com.dhdigital.api.model.frontend.Note;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.InputSource;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

@Component
public class CreateComplaintService {

	private CreateComplaintRequest oCreateComplaintRequest; // Creating object of CreateComplaintRequest frontend class
	
	private static DocumentBuilder oDocumentBuilder; // Creating object of DocumentBuilder to parse InputStream payload to Document
	
//	Constructor which initializes DocumentBuilder by using DocumentBuilderFactory
	
	public CreateComplaintService() throws IOException {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            oDocumentBuilder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            // Handle the exception here
        	throw new IOException("Failed to create settings document builder", e);
        }
    }

//	Getters and Setters of CreateComplaintRequest class
	
	public CreateComplaintRequest getoCreateComplaintRequest() {
		return oCreateComplaintRequest;
	}

	public void setoCreateComplaintRequest(CreateComplaintRequest oCreateComplaintRequest) {
		this.oCreateComplaintRequest = oCreateComplaintRequest;
	}

//	Saving the Request recieved from client which will be used for further processes
	
	public void setCreateComplaintRequest(Exchange exchange) throws Exception {

		Message oMessage = exchange.getIn();

		this.setoCreateComplaintRequest(oMessage.getBody(CreateComplaintRequest.class));
	}

	XPath xPath = XPathFactory.newInstance().newXPath(); // Initializing XPath using XPathFactory
	
	
//	Converting from CreateComplaintRequest frontend class to CreateSR_InputBackend backend class
	
	public void prepareServiceRequestToBackend(Exchange exchange) throws Exception {
		
		Message oMessage = exchange.getIn();

		CreateComplaintRequest createComplaintRequest = this.getoCreateComplaintRequest(); // Setting value of CreateComplaintRequest frontend object to the saved one

		ComplaintRequest oComplaintRequest = createComplaintRequest.getComplaintRequest(); // Getting ComplaintRequest frontend object from CreateComplaintRequest frontend object
		
		CreateSR_InputBackend createSR_InputBackend = new CreateSR_InputBackend(); // Initiliazing CreateSR_InputBackend backend class
		
		ListOfServiceRequestBackend oListOfServiceRequestBackend = new ListOfServiceRequestBackend(); // Initiliazing ListOfServiceRequestBackend backend class

		ServiceRequestBackend oServiceRequestBackend = new ServiceRequestBackend(); // Initiliazing ServiceRequestBackend backend class

//		Setting values from ComplaintRequest frontend object to ServiceRequestBackend backend object
		
		oServiceRequestBackend.setType(oComplaintRequest.getType());
		oServiceRequestBackend.setArea(oComplaintRequest.getArea());
		oServiceRequestBackend.setSubArea(oComplaintRequest.getSubArea());
		oServiceRequestBackend.setService(oComplaintRequest.getSRService());
		oServiceRequestBackend.setDupFlg(oComplaintRequest.getDupFlg());
		oServiceRequestBackend.setAttrib1(oComplaintRequest.getAttrib1());
		oServiceRequestBackend.setAttrib2(oComplaintRequest.getAttrib2());
		oServiceRequestBackend.setAttrib3(oComplaintRequest.getAttrib3());
		oServiceRequestBackend.setAttrib4(oComplaintRequest.getAttrib4());
		oServiceRequestBackend.setAttrib5(oComplaintRequest.getAttrib5());
		oServiceRequestBackend.setAttrib6(oComplaintRequest.getAttrib6());
		oServiceRequestBackend.setAttrib7(oComplaintRequest.getAttrib7());
		oServiceRequestBackend.setAttrib8(oComplaintRequest.getAttrib8());
		oServiceRequestBackend.setAttrib9(oComplaintRequest.getAttrib9());
		oServiceRequestBackend.setAttrib10(oComplaintRequest.getAttrib10());
		oServiceRequestBackend.setAttrib11(oComplaintRequest.getAttrib11());
		oServiceRequestBackend.setAttrib12(oComplaintRequest.getAttrib12());
		oServiceRequestBackend.setAttrib13(oComplaintRequest.getAttrib13());
		oServiceRequestBackend.setAttrib14(oComplaintRequest.getAttrib14());
		oServiceRequestBackend.setAttrib15(oComplaintRequest.getAttrib15());
		oServiceRequestBackend.setAttrib16(oComplaintRequest.getAttrib16());
		oServiceRequestBackend.setAttrib17(oComplaintRequest.getAttrib17());
		oServiceRequestBackend.setAttrib18(oComplaintRequest.getAttrib18());
		oServiceRequestBackend.setAttrib19(oComplaintRequest.getAttrib19());
		oServiceRequestBackend.setAttrib20(oComplaintRequest.getAttrib20());
		oServiceRequestBackend.setAttrib21(oComplaintRequest.getAttrib21());
		oServiceRequestBackend.setAttrib22(oComplaintRequest.getAttrib22());
		oServiceRequestBackend.setAttrib23(oComplaintRequest.getAttrib23());
		oServiceRequestBackend.setAttrib24(oComplaintRequest.getAttrib24());
		oServiceRequestBackend.setAttrib25(oComplaintRequest.getAttrib25());
		oServiceRequestBackend.setAttrib26(oComplaintRequest.getAttrib26());
		oServiceRequestBackend.setAttrib27(oComplaintRequest.getAttrib27());
		oServiceRequestBackend.setAttrib28(oComplaintRequest.getAttrib28());
		oServiceRequestBackend.setAttrib29(oComplaintRequest.getAttrib29());
		oServiceRequestBackend.setAttrib30(oComplaintRequest.getAttrib30());
		oServiceRequestBackend.setCreditCardEnc("null");
		oServiceRequestBackend.setCreditCard(oComplaintRequest.getCreditCard());
		oServiceRequestBackend.setCif(oComplaintRequest.getCif());
		oServiceRequestBackend.setSource(oComplaintRequest.getSource());
		oServiceRequestBackend.setMobileNumber(oComplaintRequest.getMobileNumber());
		oServiceRequestBackend.setsRDescription(oComplaintRequest.getSRDescription());
		oServiceRequestBackend.setAtmCardEnc("null");
		oServiceRequestBackend.setAtmCard(oComplaintRequest.getAtmCardNumber());
		
		List<Attachment> oAttachments = oComplaintRequest.getAttachment(); // Getting List of Attachment object from ComplaintRequest frontend object
		
		ListOfServiceRequestAttachmentBackend oListOfServiceRequestAttachmentBackend = new ListOfServiceRequestAttachmentBackend(); // Initializing ListOfServiceRequestAttachmentBackend backend class

		List<AttachmentBackend> oBackendAttachments = new ArrayList<AttachmentBackend>(); // Initializing List of AttachmentBackend backend object

//		Mapping array of objects of oAttachments frontend object to oBackendAttachments backend object
		
		for (Attachment attachment : oAttachments) {

			AttachmentBackend oAttachmentBackend = new AttachmentBackend();
			oAttachmentBackend.setAttachmentComments(attachment.getAttachmentComments());
			oAttachmentBackend.setAttachmentFileBuffer(attachment.getAttachmentFileBuffer());
			oAttachmentBackend.setAttachmentFileExtension(attachment.getAttachmentFileExtension());
			oAttachmentBackend.setAttachmentFileName(attachment.getAttachmentFileName());

			oBackendAttachments.add(oAttachmentBackend);
		}
		
		oListOfServiceRequestAttachmentBackend.setAttachment(oBackendAttachments); // Setting resultant oBackendAttachments object to oListOfServiceRequestAttachmentBackend object

		oServiceRequestBackend.setListOfServiceRequestAttachmentBackend(oListOfServiceRequestAttachmentBackend); // Setting resultant oListOfServiceRequestAttachmentBackend object to oServiceRequestBackend object
		
//		Getting ListOfNotes object from oComplaintRequest object and setting List Of Notes object from oListOfNotes object
		
		ListOfNotes oListOfNotes = oComplaintRequest.getListOfNotes();
		List<Note> oNotes = oListOfNotes.getNotes();
		
//		Initializing ListOfNotesBackend equivalent backend classes
		
		ListOfNotesBackend oListOfNotesBackend = new ListOfNotesBackend();
		List<NotesBackend> oNotesBackendList = new ArrayList<NotesBackend>();
		
//		Mapping array of objects of oNotes frontend object to oNotesBackendList backend object
		
		for(Note oNote: oNotes) {
			
			NotesBackend oNotesbackend = new NotesBackend();
			oNotesbackend.setNote(oNote.getNote());
			oNotesbackend.setNoteType(oNote.getNoteType());
			
			oNotesBackendList.add(oNotesbackend);
		}
		
		oListOfNotesBackend.setNotes(oNotesBackendList); // Setting resultant oNotesBackendList object to oListOfNotesBackend object
		
		oServiceRequestBackend.setListOfNotesBackend(oListOfNotesBackend); // Setting resultant oListOfNotesBackend object to oServiceRequestBackend object
		
		oListOfServiceRequestBackend.setComplaintRequestBackend(oServiceRequestBackend); // Setting resultant oServiceRequestBackend object to oListOfServiceRequestBackend object
		
		createSR_InputBackend.setListOfServiceRequestBackend(oListOfServiceRequestBackend); // Setting resultant oListOfServiceRequestBackend object to createSR_InputBackend object
		createSR_InputBackend.setAsynchOut("null"); // Setting setAsyncOut value in createSR_InputBackend as null as no data available
		
		oMessage.setBody(createSR_InputBackend); // Setting createSR_InputBackend object to route body
	}
	
	public void setServiceRequestResponse(Exchange exchange) throws Exception{
		
		Message oMessage = exchange.getIn();
		
		Document oDocument = getDomObject((InputStream) oMessage.getBody(InputStream.class)); // Getting the body in getDomObject method which converts InputStream payload to Document
		
		NodeList CreateSR_OutputNode = (NodeList) xPath.compile("/CreateSR_Output").evaluate(oDocument, // Getting the NodeList of CreateSR_Output element in XML
				XPathConstants.NODE);
		
//		Initializing Frontend response classes
		
		CreateComplaintResponse oCreateComplaintResponse = new CreateComplaintResponse();
		ComplaintResponse oComplaintResponse = new ComplaintResponse();
		Complaint oComplaint = new Complaint();
		
//		Setting the values in frontend response objects from the values of CreateSR_OutputNode NodeList
		
		oComplaint.setSRNumber((String) xPath.evaluate("SRNumber", CreateSR_OutputNode, XPathConstants.STRING));
		oComplaint.setStatus((String) xPath.evaluate("Status", CreateSR_OutputNode, XPathConstants.STRING));
		oComplaint.setStatusMessage((String) xPath.evaluate("StatusMessage", CreateSR_OutputNode, XPathConstants.STRING));
		
//		Setting the objects in parent objects
		
		oComplaintResponse.setComplaint(oComplaint);
		oCreateComplaintResponse.setComplaintResponse(oComplaintResponse);
		
		oMessage.setBody(oCreateComplaintResponse); // Setting the oCreateComplaintResponse frontend object in route body
	}
	
//	Converting InputStream payload from route body to Document format
	
	public synchronized Document getDomObject(InputStream payload)
			throws SAXException, IOException, XPathExpressionException 
			{
		Document oDocument = oDocumentBuilder.parse(payload);
		return oDocument;
	}

}
