package com.dhdigital.api.route;

import javax.xml.bind.JAXBContext;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.dhdigital.api.model.backend.CreateSR_InputBackend;
import com.dhdigital.api.model.backend.ListOfServiceRequestBackend;
import com.dhdigital.api.model.frontend.CreateComplaintRequest;
import com.dhdigital.api.model.frontend.CreateComplaintResponse;

@Component
public class CreateComplaintRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		restConfiguration()
		 .bindingMode(RestBindingMode.auto);
		
		rest("/api")
		
		.post("/v1/Complaint")
		 .type(CreateComplaintRequest.class)
		 .outType(CreateComplaintResponse.class)
		 .produces("application/json")
		 .consumes("application/json")
		 .to("direct:invoke-create-complaint");
		
//		Initializing JAXB for marshalling to XML
		
		JaxbDataFormat createSRInputBackendFormat = new JaxbDataFormat();
		JAXBContext jaxcon = JAXBContext.newInstance(CreateSR_InputBackend.class);
		createSRInputBackendFormat.setContext(jaxcon);
		
		from("direct:invoke-create-complaint")
		.to("bean:createComplaintService?method=setCreateComplaintRequest")
		.to("bean:createComplaintService?method=prepareServiceRequestToBackend")
		.marshal(createSRInputBackendFormat)
		.to("{{srComplaint.host}}"+"/Complaint?bridgeEndpoint=true") //https://6d166817-de75-4bf5-85ff-41436f138367.mock.pstmn.io/Complaint?bridgeEndpoint=true
		.to("bean:createComplaintService?method=setServiceRequestResponse")
		.setHeader("Content-Type", constant("application/json"));
		
	}

}
