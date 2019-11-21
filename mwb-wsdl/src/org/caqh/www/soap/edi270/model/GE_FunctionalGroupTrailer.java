package org.caqh.www.soap.edi270.model;

/** Example Code - GE*1*1~ **/
public class GE_FunctionalGroupTrailer {

	private String NumberofTransactionSetsIncluded = "1";
	private String GroupControlNumber = "1";
	
	/**
	 * @return the numberofTransactionSetsIncluded
	 */
	public String getNumberofTransactionSetsIncluded() {
		return NumberofTransactionSetsIncluded;
	}
	/**
	 * @param numberofTransactionSetsIncluded the numberofTransactionSetsIncluded to set
	 */
	public void setNumberofTransactionSetsIncluded(
			String numberofTransactionSetsIncluded) {
		NumberofTransactionSetsIncluded = numberofTransactionSetsIncluded;
	}
	/**
	 * @return the groupControlNumber
	 */
	public String getGroupControlNumber() {
		return GroupControlNumber;
	}
	/**
	 * @param groupControlNumber the groupControlNumber to set
	 */
	public void setGroupControlNumber(String groupControlNumber) {
		GroupControlNumber = groupControlNumber;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GE_FunctionalGroupTrailer [NumberofTransactionSetsIncluded="
				+ NumberofTransactionSetsIncluded + ", GroupControlNumber="
				+ GroupControlNumber + "]";
	}
}
