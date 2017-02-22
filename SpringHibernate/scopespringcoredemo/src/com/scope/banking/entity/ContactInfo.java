package com.scope.banking.entity;

public class ContactInfo {
	
	private String mobileNo;
	private String landline;
	private String emailId;
	
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getLandline() {
		return landline;
	}

	public void setLandline(String landline) {
		this.landline = landline;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "ContactInfo [mobileNo=" + mobileNo + ", landline=" + landline
				+ ", emailId=" + emailId + "]";
	}
}