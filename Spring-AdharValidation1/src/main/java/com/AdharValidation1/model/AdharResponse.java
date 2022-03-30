package com.AdharValidation1.model;

public class AdharResponse {

	
	private String requestData;

	public AdharResponse(String requestData) {
		super();
		this.requestData = requestData;
	}

	public AdharResponse() {
	}

	public String getRequestData() {
		return requestData;
	}

	public void setRequestData(String requestData) {
		this.requestData = requestData;
	}

	@Override
	public String toString() {
		return "AdharResponse [requestData=" + requestData + "]";
	}
	
	
	
}
