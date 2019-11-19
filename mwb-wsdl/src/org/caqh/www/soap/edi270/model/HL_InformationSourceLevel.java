package org.caqh.www.soap.edi270.model;

/** Example Code - HL*1**20*1~  **/
public class HL_InformationSourceLevel {

	private String hierarchicalIDNumber = "1";
	private String hierarchicalLevelCode = "20";
	private String hierarchicalChildCode = "1";
	
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
		return "HL_InformationSourceLevel [hierarchicalIDNumber="
				+ hierarchicalIDNumber + ", hierarchicalLevelCode="
				+ hierarchicalLevelCode + ", hierarchicalChildCode="
				+ hierarchicalChildCode + "]";
		}
}
