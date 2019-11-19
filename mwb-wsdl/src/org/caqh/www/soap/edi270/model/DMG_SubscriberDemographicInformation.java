package org.caqh.www.soap.edi270.model;

/** Example Code - DMG*D8*19581212~ **/
public class DMG_SubscriberDemographicInformation {

	private String dateTimePeriodFormatQualifier;
	private String dateTimePeriod;
	private String genderCode;
	
	/**
	 * @return the dateTimePeriodFormatQualifier
	 */
	public String getDateTimePeriodFormatQualifier() {
		return dateTimePeriodFormatQualifier;
	}
	/**
	 * @param dateTimePeriodFormatQualifier the dateTimePeriodFormatQualifier to set
	 */
	public void setDateTimePeriodFormatQualifier(
			String dateTimePeriodFormatQualifier) {
		this.dateTimePeriodFormatQualifier = dateTimePeriodFormatQualifier;
	}
	/**
	 * @return the dateTimePeriod
	 */
	public String getDateTimePeriod() {
		return dateTimePeriod;
	}
	/**
	 * @param dateTimePeriod the dateTimePeriod to set
	 */
	public void setDateTimePeriod(String dateTimePeriod) {
		this.dateTimePeriod = dateTimePeriod;
	}
	/**
	 * @return the genderCode
	 */
	public String getGenderCode() {
		return genderCode;
	}
	/**
	 * @param genderCode the genderCode to set
	 */
	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DMG_SubscriberDemographicInformation [dateTimePeriodFormatQualifier="
				+ dateTimePeriodFormatQualifier
				+ ", dateTimePeriod="
				+ dateTimePeriod + ", genderCode=" + genderCode + "]";
	}
}
