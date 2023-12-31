
package com.dhdigital.api.model.frontend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ComplaintRequest"
})
public class CreateComplaintRequest {

    @JsonProperty("ComplaintRequest")
    private ComplaintRequest complaintRequest;

    @JsonProperty("ComplaintRequest")
    public ComplaintRequest getComplaintRequest() {
        return complaintRequest;
    }

    @JsonProperty("ComplaintRequest")
    public void setComplaintRequest(ComplaintRequest complaintRequest) {
        this.complaintRequest = complaintRequest;
    }

	@Override
	public String toString() {
		return "CreateComplaintRequest [complaintRequest=" + complaintRequest + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(complaintRequest);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreateComplaintRequest other = (CreateComplaintRequest) obj;
		return Objects.equals(complaintRequest, other.complaintRequest);
	}

	public CreateComplaintRequest() {
		super();
	}

	public CreateComplaintRequest(ComplaintRequest complaintRequest) {
		super();
		this.complaintRequest = complaintRequest;
	}
	
	
}
