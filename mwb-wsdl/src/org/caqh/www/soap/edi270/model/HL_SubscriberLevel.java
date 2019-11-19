package org.caqh.www.soap.edi270.model;

/** Example Code - HL*3*2*22*0~  **/
public class HL_SubscriberLevel {

	private String hierarchicalIDNumber;
	private String hierarchicalParentIDNumber;
	private String hierarchicalLevelCode;
	private String hierarchicalChildCode;
	
	/**
	 * @return the hierarchicalIDNumber
	 */
	public String getHierarchicalIDNumber() {
		return hierarchicalIDNumber;
	}
	/**
	 * @param hierarchicalIDNumber the hierarchicalIDNumber to set
	 */
	public void setHierarchicalIDNumber(String hierarchicalIDNumber) {
		this.hierarchicalIDNumber = hierarchicalIDNumber;
	}
	/**
	 * @return the hierarchicalParentIDNumber
	 */
	public String getHierarchicalParentIDNumber() {
		return hierarchicalParentIDNumber;
	}
	/**
	 * @param hierarchicalParentIDNumber the hierarchicalParentIDNumber to set
	 */
	public void setHierarchicalParentIDNumber(String hierarchicalParentIDNumber) {
		this.hierarchicalParentIDNumber = hierarchicalParentIDNumber;
	}
	/**
	 * @return the hierarchicalLevelCode
	 */
	public String getHierarchicalLevelCode() {
		return hierarchicalLevelCode;
	}
	/**
	 * @param hierarchicalLevelCode the hierarchicalLevelCode to set
	 */
	public void setHierarchicalLevelCode(String hierarchicalLevelCode) {
		this.hierarchicalLevelCode = hierarchicalLevelCode;
	}
	/**
	 * @return the hierarchicalChildCode
	 */
	public String getHierarchicalChildCode() {
		return hierarchicalChildCode;
	}
	/**
	 * @param hierarchicalChildCode the hierarchicalChildCode to set
	 */
	public void setHierarchicalChildCode(String hierarchicalChildCode) {
		this.hierarchicalChildCode = hierarchicalChildCode;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HL_InformationReceiverLevel [hierarchicalIDNumber="
				+ hierarchicalIDNumber + ", hierarchicalParentIDNumber="
				+ hierarchicalParentIDNumber + ", hierarchicalLevelCode="
				+ hierarchicalLevelCode + ", hierarchicalChildCode="
				+ hierarchicalChildCode + "]";
	}
}
