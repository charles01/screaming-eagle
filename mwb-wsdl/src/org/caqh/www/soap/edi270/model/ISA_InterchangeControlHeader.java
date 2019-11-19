package org.caqh.www.soap.edi270.model;

/** Example Code - ISA*00*          *00*          *ZZ*111111         *ZZ*OFFALLY        *191104*1051*^*00501*003906526*0*P*:~ **/
public class ISA_InterchangeControlHeader {
		
	private String authorizationInformationQualifier;
	private String authorizationInformation;
	private String securityInformationQualifier;
	private String securityInformation;
	private String interchangeIDQualifier1;
	private String interchangeSenderID;
	private String interchangeIDQualifier2;
	private String interchangeReceiverID;
	private String interchangeDate;
	private String interchangeTime;
	private String repetitionSeparator;
	private String interchangeControlVersionNumber;
	private String interchangeControlNumber;
	private String acknowledgmentRequested;
	private String interchangeUsageIndicator;
	private String componentElementSeparator;
	
	/**
	 * @return the authorizationInformationQualifier
	 */
	public String getAuthorizationInformationQualifier() {
		return authorizationInformationQualifier;
	}
	/**
	 * @param authorizationInformationQualifier the authorizationInformationQualifier to set
	 */
	public void setAuthorizationInformationQualifier(
			String authorizationInformationQualifier) {
		this.authorizationInformationQualifier = authorizationInformationQualifier;
	}
	/**
	 * @return the authorizationInformation
	 */
	public String getAuthorizationInformation() {
		return authorizationInformation;
	}
	/**
	 * @param authorizationInformation the authorizationInformation to set
	 */
	public void setAuthorizationInformation(String authorizationInformation) {
		this.authorizationInformation = authorizationInformation;
	}
	/**
	 * @return the securityInformationQualifier
	 */
	public String getSecurityInformationQualifier() {
		return securityInformationQualifier;
	}
	/**
	 * @param securityInformationQualifier the securityInformationQualifier to set
	 */
	public void setSecurityInformationQualifier(String securityInformationQualifier) {
		this.securityInformationQualifier = securityInformationQualifier;
	}
	/**
	 * @return the securityInformation
	 */
	public String getSecurityInformation() {
		return securityInformation;
	}
	/**
	 * @param securityInformation the securityInformation to set
	 */
	public void setSecurityInformation(String securityInformation) {
		this.securityInformation = securityInformation;
	}
	/**
	 * @return the interchangeIDQualifier1
	 */
	public String getInterchangeIDQualifier1() {
		return interchangeIDQualifier1;
	}
	/**
	 * @param interchangeIDQualifier1 the interchangeIDQualifier1 to set
	 */
	public void setInterchangeIDQualifier1(String interchangeIDQualifier1) {
		this.interchangeIDQualifier1 = interchangeIDQualifier1;
	}
	/**
	 * @return the interchangeSenderID
	 */
	public String getInterchangeSenderID() {
		return interchangeSenderID;
	}
	/**
	 * @param interchangeSenderID the interchangeSenderID to set
	 */
	public void setInterchangeSenderID(String interchangeSenderID) {
		this.interchangeSenderID = interchangeSenderID;
	}
	/**
	 * @return the interchangeIDQualifier2
	 */
	public String getInterchangeIDQualifier2() {
		return interchangeIDQualifier2;
	}
	/**
	 * @param interchangeIDQualifier2 the interchangeIDQualifier2 to set
	 */
	public void setInterchangeIDQualifier2(String interchangeIDQualifier2) {
		this.interchangeIDQualifier2 = interchangeIDQualifier2;
	}
	/**
	 * @return the interchangeReceiverID
	 */
	public String getInterchangeReceiverID() {
		return interchangeReceiverID;
	}
	/**
	 * @param interchangeReceiverID the interchangeReceiverID to set
	 */
	public void setInterchangeReceiverID(String interchangeReceiverID) {
		this.interchangeReceiverID = interchangeReceiverID;
	}
	/**
	 * @return the interchangeDate
	 */
	public String getInterchangeDate() {
		return interchangeDate;
	}
	/**
	 * @param interchangeDate the interchangeDate to set
	 */
	public void setInterchangeDate(String interchangeDate) {
		this.interchangeDate = interchangeDate;
	}
	/**
	 * @return the interchangeTime
	 */
	public String getInterchangeTime() {
		return interchangeTime;
	}
	/**
	 * @param interchangeTime the interchangeTime to set
	 */
	public void setInterchangeTime(String interchangeTime) {
		this.interchangeTime = interchangeTime;
	}
	/**
	 * @return the repetitionSeparator
	 */
	public String getRepetitionSeparator() {
		return repetitionSeparator;
	}
	/**
	 * @param repetitionSeparator the repetitionSeparator to set
	 */
	public void setRepetitionSeparator(String repetitionSeparator) {
		this.repetitionSeparator = repetitionSeparator;
	}
	/**
	 * @return the interchangeControlVersionNumber
	 */
	public String getInterchangeControlVersionNumber() {
		return interchangeControlVersionNumber;
	}
	/**
	 * @param interchangeControlVersionNumber the interchangeControlVersionNumber to set
	 */
	public void setInterchangeControlVersionNumber(
			String interchangeControlVersionNumber) {
		this.interchangeControlVersionNumber = interchangeControlVersionNumber;
	}
	/**
	 * @return the interchangeControlNumber
	 */
	public String getInterchangeControlNumber() {
		return interchangeControlNumber;
	}
	/**
	 * @param interchangeControlNumber the interchangeControlNumber to set
	 */
	public void setInterchangeControlNumber(String interchangeControlNumber) {
		this.interchangeControlNumber = interchangeControlNumber;
	}
	/**
	 * @return the acknowledgmentRequested
	 */
	public String getAcknowledgmentRequested() {
		return acknowledgmentRequested;
	}
	/**
	 * @param acknowledgmentRequested the acknowledgmentRequested to set
	 */
	public void setAcknowledgmentRequested(String acknowledgmentRequested) {
		this.acknowledgmentRequested = acknowledgmentRequested;
	}
	/**
	 * @return the interchangeUsageIndicator
	 */
	public String getInterchangeUsageIndicator() {
		return interchangeUsageIndicator;
	}
	/**
	 * @param interchangeUsageIndicator the interchangeUsageIndicator to set
	 */
	public void setInterchangeUsageIndicator(String interchangeUsageIndicator) {
		this.interchangeUsageIndicator = interchangeUsageIndicator;
	}
	/**
	 * @return the componentElementSeparator
	 */
	public String getComponentElementSeparator() {
		return componentElementSeparator;
	}
	/**
	 * @param componentElementSeparator the componentElementSeparator to set
	 */
	public void setComponentElementSeparator(String componentElementSeparator) {
		this.componentElementSeparator = componentElementSeparator;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ISA_InterchangeControlHeader [authorizationInformationQualifier="
				+ authorizationInformationQualifier
				+ ", authorizationInformation="
				+ authorizationInformation
				+ ", securityInformationQualifier="
				+ securityInformationQualifier
				+ ", securityInformation="
				+ securityInformation
				+ ", interchangeIDQualifier1="
				+ interchangeIDQualifier1
				+ ", interchangeSenderID="
				+ interchangeSenderID
				+ ", interchangeIDQualifier2="
				+ interchangeIDQualifier2
				+ ", interchangeReceiverID="
				+ interchangeReceiverID
				+ ", interchangeDate="
				+ interchangeDate
				+ ", interchangeTime="
				+ interchangeTime
				+ ", repetitionSeparator="
				+ repetitionSeparator
				+ ", interchangeControlVersionNumber="
				+ interchangeControlVersionNumber
				+ ", interchangeControlNumber="
				+ interchangeControlNumber
				+ ", acknowledgmentRequested="
				+ acknowledgmentRequested
				+ ", interchangeUsageIndicator="
				+ interchangeUsageIndicator
				+ ", componentElementSeparator="
				+ componentElementSeparator + "]";
	}
}
