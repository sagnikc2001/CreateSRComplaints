package com.dhdigital.api.model.backend;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequest", propOrder = { "type", "area", "subArea", "service", "dupFlg", "attrib1", "attrib2",
		"attrib3", "attrib4", "attrib5", "attrib6", "attrib7", "attrib8", "attrib9", "attrib10", "attrib11", "attrib12",
		"attrib13", "attrib14", "attrib15", "attrib16", "attrib17", "attrib18", "attrib19", "attrib20", "attrib21",
		"attrib22", "attrib23", "attrib24", "attrib25", "attrib26", "attrib27", "attrib28", "attrib29", "attrib30",
		"creditCardEnc", "creditCard", "cif", "source", "mobileNumber", "sRDescription", "atmCardEnc",
		"atmCard", "listOfNotesBackend", "listOfServiceRequestAttachmentBackend" })
public class ServiceRequestBackend {
	@XmlElement(name = "Type", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String type;

	@XmlElement(name = "Area", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String area;

	@XmlElement(name = "SubArea", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String subArea;

	@XmlElement(name = "Service", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String service;

	@XmlElement(name = "DupFlg", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String dupFlg;

	@XmlElement(name = "Attrib1", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib1;

	@XmlElement(name = "Attrib2", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib2;

	@XmlElement(name = "Attrib3", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib3;

	@XmlElement(name = "Attrib4", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib4;

	@XmlElement(name = "Attrib5", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib5;

	@XmlElement(name = "Attrib6", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib6;

	@XmlElement(name = "Attrib7", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib7;

	@XmlElement(name = "Attrib8", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib8;

	@XmlElement(name = "Attrib9", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib9;

	@XmlElement(name = "Attrib10", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib10;

	@XmlElement(name = "Attrib11", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib11;

	@XmlElement(name = "Attrib12", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib12;

	@XmlElement(name = "Attrib13", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib13;

	@XmlElement(name = "Attrib14", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib14;

	@XmlElement(name = "Attrib15", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib15;

	@XmlElement(name = "Attrib16", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib16;

	@XmlElement(name = "Attrib17", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib17;

	@XmlElement(name = "Attrib18", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib18;

	@XmlElement(name = "Attrib19", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib19;

	@XmlElement(name = "Attrib20", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib20;

	@XmlElement(name = "Attrib21", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib21;

	@XmlElement(name = "Attrib22", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib22;

	@XmlElement(name = "Attrib23", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib23;

	@XmlElement(name = "Attrib24", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib24;

	@XmlElement(name = "Attrib25", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib25;

	@XmlElement(name = "Attrib26", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib26;

	@XmlElement(name = "Attrib27", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib27;

	@XmlElement(name = "Attrib28", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib28;

	@XmlElement(name = "Attrib29", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib29;

	@XmlElement(name = "Attrib30", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String attrib30;

	@XmlElement(name = "CreditCardEnc", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String creditCardEnc;

	@XmlElement(name = "CreditCard", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String creditCard;

	@XmlElement(name = "CIF", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String cif;

	@XmlElement(name = "Source", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String source;

	@XmlElement(name = "MobileNumber", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String mobileNumber;

	@XmlElement(name = "SRDescription", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String sRDescription;

	@XmlElement(name = "AtmCardEnc", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String atmCardEnc;

	@XmlElement(name = "AtmCard", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private String atmCard;

	@XmlElement(name = "ListOfNotes", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private ListOfNotesBackend listOfNotesBackend;

	@XmlElement(name = "ListOfServiceRequestAttachment", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
	private ListOfServiceRequestAttachmentBackend listOfServiceRequestAttachmentBackend;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSubArea() {
		return subArea;
	}

	public void setSubArea(String subArea) {
		this.subArea = subArea;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getDupFlg() {
		return dupFlg;
	}

	public void setDupFlg(String dupFlg) {
		this.dupFlg = dupFlg;
	}

	public String getAttrib1() {
		return attrib1;
	}

	public void setAttrib1(String attrib1) {
		this.attrib1 = attrib1;
	}

	public String getAttrib2() {
		return attrib2;
	}

	public void setAttrib2(String attrib2) {
		this.attrib2 = attrib2;
	}

	public String getAttrib3() {
		return attrib3;
	}

	public void setAttrib3(String attrib3) {
		this.attrib3 = attrib3;
	}

	public String getAttrib4() {
		return attrib4;
	}

	public void setAttrib4(String attrib4) {
		this.attrib4 = attrib4;
	}

	public String getAttrib5() {
		return attrib5;
	}

	public void setAttrib5(String attrib5) {
		this.attrib5 = attrib5;
	}

	public String getAttrib6() {
		return attrib6;
	}

	public void setAttrib6(String attrib6) {
		this.attrib6 = attrib6;
	}

	public String getAttrib7() {
		return attrib7;
	}

	public void setAttrib7(String attrib7) {
		this.attrib7 = attrib7;
	}

	public String getAttrib8() {
		return attrib8;
	}

	public void setAttrib8(String attrib8) {
		this.attrib8 = attrib8;
	}

	public String getAttrib9() {
		return attrib9;
	}

	public void setAttrib9(String attrib9) {
		this.attrib9 = attrib9;
	}

	public String getAttrib10() {
		return attrib10;
	}

	public void setAttrib10(String attrib10) {
		this.attrib10 = attrib10;
	}

	public String getAttrib11() {
		return attrib11;
	}

	public void setAttrib11(String attrib11) {
		this.attrib11 = attrib11;
	}

	public String getAttrib12() {
		return attrib12;
	}

	public void setAttrib12(String attrib12) {
		this.attrib12 = attrib12;
	}

	public String getAttrib13() {
		return attrib13;
	}

	public void setAttrib13(String attrib13) {
		this.attrib13 = attrib13;
	}

	public String getAttrib14() {
		return attrib14;
	}

	public void setAttrib14(String attrib14) {
		this.attrib14 = attrib14;
	}

	public String getAttrib15() {
		return attrib15;
	}

	public void setAttrib15(String attrib15) {
		this.attrib15 = attrib15;
	}

	public String getAttrib16() {
		return attrib16;
	}

	public void setAttrib16(String attrib16) {
		this.attrib16 = attrib16;
	}

	public String getAttrib17() {
		return attrib17;
	}

	public void setAttrib17(String attrib17) {
		this.attrib17 = attrib17;
	}

	public String getAttrib18() {
		return attrib18;
	}

	public void setAttrib18(String attrib18) {
		this.attrib18 = attrib18;
	}

	public String getAttrib19() {
		return attrib19;
	}

	public void setAttrib19(String attrib19) {
		this.attrib19 = attrib19;
	}

	public String getAttrib20() {
		return attrib20;
	}

	public void setAttrib20(String attrib20) {
		this.attrib20 = attrib20;
	}

	public String getAttrib21() {
		return attrib21;
	}

	public void setAttrib21(String attrib21) {
		this.attrib21 = attrib21;
	}

	public String getAttrib22() {
		return attrib22;
	}

	public void setAttrib22(String attrib22) {
		this.attrib22 = attrib22;
	}

	public String getAttrib23() {
		return attrib23;
	}

	public void setAttrib23(String attrib23) {
		this.attrib23 = attrib23;
	}

	public String getAttrib24() {
		return attrib24;
	}

	public void setAttrib24(String attrib24) {
		this.attrib24 = attrib24;
	}

	public String getAttrib25() {
		return attrib25;
	}

	public void setAttrib25(String attrib25) {
		this.attrib25 = attrib25;
	}

	public String getAttrib26() {
		return attrib26;
	}

	public void setAttrib26(String attrib26) {
		this.attrib26 = attrib26;
	}

	public String getAttrib27() {
		return attrib27;
	}

	public void setAttrib27(String attrib27) {
		this.attrib27 = attrib27;
	}

	public String getAttrib28() {
		return attrib28;
	}

	public void setAttrib28(String attrib28) {
		this.attrib28 = attrib28;
	}

	public String getAttrib29() {
		return attrib29;
	}

	public void setAttrib29(String attrib29) {
		this.attrib29 = attrib29;
	}

	public String getAttrib30() {
		return attrib30;
	}

	public void setAttrib30(String attrib30) {
		this.attrib30 = attrib30;
	}

	public String getCreditCardEnc() {
		return creditCardEnc;
	}

	public void setCreditCardEnc(String creditCardEnc) {
		this.creditCardEnc = creditCardEnc;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getsRDescription() {
		return sRDescription;
	}

	public void setsRDescription(String sRDescription) {
		this.sRDescription = sRDescription;
	}

	public String getAtmCardEnc() {
		return atmCardEnc;
	}

	public void setAtmCardEnc(String atmCardEnc) {
		this.atmCardEnc = atmCardEnc;
	}

	public String getAtmCard() {
		return atmCard;
	}

	public void setAtmCard(String atmCard) {
		this.atmCard = atmCard;
	}

	public ListOfNotesBackend getListOfNotesBackend() {
		return listOfNotesBackend;
	}

	public void setListOfNotesBackend(ListOfNotesBackend listOfNotesBackend) {
		this.listOfNotesBackend = listOfNotesBackend;
	}

	public ListOfServiceRequestAttachmentBackend getListOfServiceRequestAttachmentBackend() {
		return listOfServiceRequestAttachmentBackend;
	}

	public void setListOfServiceRequestAttachmentBackend(
			ListOfServiceRequestAttachmentBackend listOfServiceRequestAttachmentBackend) {
		this.listOfServiceRequestAttachmentBackend = listOfServiceRequestAttachmentBackend;
	}
}