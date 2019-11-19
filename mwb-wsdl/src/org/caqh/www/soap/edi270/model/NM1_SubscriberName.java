package org.caqh.www.soap.edi270.model;

/** Example Code - NM1*IL*1*Test*Test****MI*1111111111~ **/
public class NM1_SubscriberName {

	private String entityIdentifierCode;
	private String entityTypeQualifier;
	private String nameLastorOrganizationName;
	private String nameFirst;
	private String nameMiddle;
	private String nameSuffix;
	private String identificationCodeQualifier;
	private String identificationCode;
	
	/**
	 * @return the entityIdentifierCode
	 */
	public String getEntityIdentifierCode() {
		return entityIdentifierCode;
	}
	/**
	 * @param entityIdentifierCode the entityIdentifierCode to set
	 */
	public void setEntityIdentifierCode(String entityIdentifierCode) {
		this.entityIdentifierCode = entityIdentifierCode;
	}
	/**
	 * @return the entityTypeQualifier
	 */
	public String getEntityTypeQualifier() {
		return entityTypeQualifier;
	}
	/**
	 * @param entityTypeQualifier the entityTypeQualifier to set
	 */
	public void setEntityTypeQualifier(String entityTypeQualifier) {
		this.entityTypeQualifier = entityTypeQualifier;
	}
	/**
	 * @return the nameLastorOrganizationName
	 */
	public String getNameLastorOrganizationName() {
		return nameLastorOrganizationName;
	}
	/**
	 * @param nameLastorOrganizationName the nameLastorOrganizationName to set
	 */
	public void setNameLastorOrganizationName(String nameLastorOrganizationName) {
		this.nameLastorOrganizationName = nameLastorOrganizationName;
	}
	/**
	 * @return the nameFirst
	 */
	public String getNameFirst() {
		return nameFirst;
	}
	/**
	 * @param nameFirst the nameFirst to set
	 */
	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}
	/**
	 * @return the nameMiddle
	 */
	public String getNameMiddle() {
		return nameMiddle;
	}
	/**
	 * @param nameMiddle the nameMiddle to set
	 */
	public void setNameMiddle(String nameMiddle) {
		this.nameMiddle = nameMiddle;
	}
	/**
	 * @return the nameSuffix
	 */
	public String getNameSuffix() {
		return nameSuffix;
	}
	/**
	 * @param nameSuffix the nameSuffix to set
	 */
	public void setNameSuffix(String nameSuffix) {
		this.nameSuffix = nameSuffix;
	}
	/**
	 * @return the identificationCodeQualifier
	 */
	public String getIdentificationCodeQualifier() {
		return identificationCodeQualifier;
	}
	/**
	 * @param identificationCodeQualifier the identificationCodeQualifier to set
	 */
	public void setIdentificationCodeQualifier(String identificationCodeQualifier) {
		this.identificationCodeQualifier = identificationCodeQualifier;
	}
	/**
	 * @return the identificationCode
	 */
	public String getIdentificationCode() {
		return identificationCode;
	}
	/**
	 * @param identificationCode the identificationCode to set
	 */
	public void setIdentificationCode(String identificationCode) {
		this.identificationCode = identificationCode;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NM1_InformationSourceName [entityIdentifierCode="
				+ entityIdentifierCode + ", entityTypeQualifier="
				+ entityTypeQualifier + ", nameLastorOrganizationName="
				+ nameLastorOrganizationName + ", nameFirst=" + nameFirst
				+ ", nameMiddle=" + nameMiddle + ", nameSuffix="
				+ nameSuffix + ", identificationCodeQualifier="
				+ identificationCodeQualifier + ", identificationCode="
				+ identificationCode + "]";
	}
}
