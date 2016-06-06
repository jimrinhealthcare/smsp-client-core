package uk.co.inhealthcare.smsp.client.itk;

import java.util.UUID;

import uk.co.inhealthcare.smsp.client.Identity;

public class ITKHeaders {

	private String service;
	private Identity identity;
	private String trackingId;

	public ITKHeaders(String service, Identity identity) {
		this.service = service;
		this.identity = identity;
		this.trackingId = UUID.randomUUID().toString().toUpperCase();
	}

	public String getAuditIdentity() {
		return identity.getAuditIdentity();
	}

	public String getClientServiceUrl() {
		return identity.getClientServiceUrl();
	}

	public String getUsername() {
		return identity.getUsername();
	}

	public String getService() {
		return service;
	}

	public String getTrackingId() {
		return trackingId;
	}

	public String getServiceUrl() {
		return identity.getServiceUrl();
	}

}