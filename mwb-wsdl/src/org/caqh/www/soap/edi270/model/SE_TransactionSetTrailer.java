package org.caqh.www.soap.edi270.model;

/** Example Code - SE*11*0001~ **/
public class SE_TransactionSetTrailer {

	private String NumberofIncludedSegments;
	private String TransactionSetControlNumber;
	
	/**
	 * @return the numberofIncludedSegments
	 */
	public String getNumberofIncludedSegments() {
		return NumberofIncludedSegments;
	}
	/**
	 * @param numberofIncludedSegments the numberofIncludedSegments to set
	 */
	public void setNumberofIncludedSegments(String numberofIncludedSegments) {
		NumberofIncludedSegments = numberofIncludedSegments;
	}
	/**
	 * @return the transactionSetControlNumber
	 */
	public String getTransactionSetControlNumber() {
		return TransactionSetControlNumber;
	}
	/**
	 * @param transactionSetControlNumber the transactionSetControlNumber to set
	 */
	public void setTransactionSetControlNumber(String transactionSetControlNumber) {
		TransactionSetControlNumber = transactionSetControlNumber;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SE_TransactionSetTrailer [NumberofIncludedSegments="
				+ NumberofIncludedSegments + ", TransactionSetControlNumber="
				+ TransactionSetControlNumber + "]";
	}
}
