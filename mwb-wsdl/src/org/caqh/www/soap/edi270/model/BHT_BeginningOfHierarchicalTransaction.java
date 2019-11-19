package org.caqh.www.soap.edi270.model;

import org.caqh.www.soap.wsdl.EDIUtil;

/** Example Code - BHT*0022*13*20191104105106*20191104*105106~ **/
public class BHT_BeginningOfHierarchicalTransaction extends EDIUtil {

	private String hierarchicalStructureCode = "0022";
	private String transactionSetPurposeCode = "13";
	private String referenceIdentification = getDate(DATE_PATTERN_YYYYMMDDHHMMSS);
	private String date = getDate(DATE_PATTERN_YYYYMMDD);
	private String time = getTime(TIME_PATTERN_HHMMSS);
	private String transactionTypeCode;
	
	/**
	 * @return the hierarchicalStructureCode
	 */
	public String getHierarchicalStructureCode() {
		return hierarchicalStructureCode;
	}
	/**
	 * @param hierarchicalStructureCode the hierarchicalStructureCode to set
	 */
	public void setHierarchicalStructureCode(String hierarchicalStructureCode) {
		this.hierarchicalStructureCode = hierarchicalStructureCode;
	}
	/**
	 * @return the transactionSetPurposeCode
	 */
	public String getTransactionSetPurposeCode() {
		return transactionSetPurposeCode;
	}
	/**
	 * @param transactionSetPurposeCode the transactionSetPurposeCode to set
	 */
	public void setTransactionSetPurposeCode(String transactionSetPurposeCode) {
		this.transactionSetPurposeCode = transactionSetPurposeCode;
	}
	/**
	 * @return the referenceIdentification
	 */
	public String getReferenceIdentification() {
		return referenceIdentification;
	}
	/**
	 * @param referenceIdentification the referenceIdentification to set
	 */
	public void setReferenceIdentification(String referenceIdentification) {
		this.referenceIdentification = referenceIdentification;
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
	 * @return the transactionTypeCode
	 */
	public String getTransactionTypeCode() {
		return transactionTypeCode;
	}
	/**
	 * @param transactionTypeCode the transactionTypeCode to set
	 */
	public void setTransactionTypeCode(String transactionTypeCode) {
		this.transactionTypeCode = transactionTypeCode;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BHT_BeginningOfHierarchicalTransaction [hierarchicalStructureCode="
				+ hierarchicalStructureCode
				+ ", transactionSetPurposeCode="
				+ transactionSetPurposeCode
				+ ", referenceIdentification="
				+ referenceIdentification
				+ ", date="
				+ date
				+ ", time="
				+ time
				+ ", transactionTypeCode="
				+ transactionTypeCode
				+ "]";
	}
}
