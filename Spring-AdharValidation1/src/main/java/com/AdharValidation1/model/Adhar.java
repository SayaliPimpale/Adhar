package com.AdharValidation1.model;

public class Adhar {
	private  String transID;
	private int docType;
	private String docNumber;
	public Adhar(String transID, int docType, String docNumber) {
		super();
		this.transID = transID;
		this.docType = docType;
		this.docNumber = docNumber;
	}
	public Adhar() {
		super();
	}
	public String getTransID() {
		return transID;
	}
	public void setTransID(String transID) {
		this.transID = transID;
	}
	public int getDocType() {
		return docType;
	}
	public void setDocType(int docType) {
		this.docType = docType;
	}
	public String getDocNumber() {
		return docNumber;
	}
	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}
	@Override
	public String toString() {
		return "Adhar [transID=" + transID + ", docType=" + docType + ", docNumber=" + docNumber + "]";
	}
	
	
}
