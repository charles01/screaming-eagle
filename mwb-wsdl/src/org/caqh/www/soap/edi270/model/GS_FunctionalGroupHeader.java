package org.caqh.www.soap.edi270.model;

/** Example Code - GS*HS*111111*OFFALLY*20191104*1051*1*X*005010X279A1~ **/
public class GS_FunctionalGroupHeader {

	private String functionalIdentifierCode;
	private String applicationSenderCode;
	private String applicationReceiverCode;
	private String date;
	private String time;
	private String groupControlNumber;
	private String responsibleAgencyCode;
	private String versionCode;
	
	/**
	 * @return the functionalIdentifierCode
	 */
	public String getFunctionalIdentifierCode() {
		return functionalIdentifierCode;
	}
	/**
	 * @param functionalIdentifierCode the functionalIdentifierCode to set
	 */
	public void setFunctionalIdentifierCode(String functionalIdentifierCode) {
		this.functionalIdentifierCode = functionalIdentifierCode;
	}
	/**
	 * @return the applicationSenderCode
	 */
	public String getApplicationSenderCode() {
		return applicationSenderCode;
	}
	/**
	 * @param applicationSenderCode the applicationSenderCode to set
	 */
	public void setApplicationSenderCode(String applicationSenderCode) {
		this.applicationSenderCode = applicationSenderCode;
	}
	/**
	 * @return the applicationReceiverCode
	 */
	public String getApplicationReceiverCode() {
		return applicationReceiverCode;
	}
	/**
	 * @param applicationReceiverCode the applicationReceiverCode to set
	 */
	public void setApplicationReceiverCode(String applicationReceiverCode) {
		this.applicationReceiverCode = applicationReceiverCode;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return the groupControlNumber
	 */
	public String getGroupControlNumber() {
		return groupControlNumber;
	}
	/**
	 * @param groupControlNumber the groupControlNumber to set
	 */
	public void setGroupControlNumber(String groupControlNumber) {
		this.groupControlNumber = groupControlNumber;
	}
	/**
	 * @return the responsibleAgencyCode
	 */
	public String getResponsibleAgencyCode() {
		return responsibleAgencyCode;
	}
	/**
	 * @param responsibleAgencyCode the responsibleAgencyCode to set
	 */
	public void setResponsibleAgencyCode(String responsibleAgencyCode) {
		this.responsibleAgencyCode = responsibleAgencyCode;
	}
	/**
	 * @return the versionCode
	 */
	public String getVersionCode() {
		return versionCode;
	}
	/**
	 * @param versionCode the versionCode to set
	 */
	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GS_FunctionalGroupHeader [functionalIdentifierCode="
				+ functionalIdentifierCode + ", applicationSenderCode="
				+ applicationSenderCode + ", applicationReceiverCode="
				+ applicationReceiverCode + ", date=" + date + ", time="
				+ time + ", groupControlNumber=" + groupControlNumber
				+ ", responsibleAgencyCode=" + responsibleAgencyCode
				+ ", versionCode=" + versionCode + "]";
	}
}
