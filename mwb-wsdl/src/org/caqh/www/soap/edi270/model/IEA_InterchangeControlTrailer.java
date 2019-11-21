package org.caqh.www.soap.edi270.model;

/** Example Code - IEA*1*003906526~ **/
public class IEA_InterchangeControlTrailer {
	
	private String NumberofIncludedFunctionalGroups ="1";
	private String InterchangeControlNumber = "003906526";
	
	/**
	 * @return the numberofIncludedFunctionalGroups
	 */
	public String getNumberofIncludedFunctionalGroups() {
		return NumberofIncludedFunctionalGroups;
	}
	/**
	 * @param numberofIncludedFunctionalGroups the numberofIncludedFunctionalGroups to set
	 */
	public void setNumberofIncludedFunctionalGroups(
			String numberofIncludedFunctionalGroups) {
		NumberofIncludedFunctionalGroups = numberofIncludedFunctionalGroups;
	}
	/**
	 * @return the interchangeControlNumber
	 */
	public String getInterchangeControlNumber() {
		return InterchangeControlNumber;
	}
	/**
	 * @param interchangeControlNumber the interchangeControlNumber to set
	 */
	public void setInterchangeControlNumber(String interchangeControlNumber) {
		InterchangeControlNumber = interchangeControlNumber;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IEA_InterchangeControlTrailer [NumberofIncludedFunctionalGroups="
				+ NumberofIncludedFunctionalGroups
				+ ", InterchangeControlNumber="
				+ InterchangeControlNumber
				+ "]";
	}
}
