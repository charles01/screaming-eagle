package org.caqh.www.soap.edi270.model;

/** Example Code - ST*270*0001*005010X279A1~ **/
public class ST_TransactionSetHeader {

	private String transactionSetIdentifierCode;
	private String transactionSetControlNumber;
	private String implementationConventionReference;
	
	/**
	 * @return the transactionSetIdentifierCode
	 */
	public String getTransactionSetIdentifierCode() {
		return transactionSetIdentifierCode;
	}
	/**
	 * @param transactionSetIdentifierCode the transactionSetIdentifierCode to set
	 */
	public void setTransactionSetIdentifierCode(String transactionSetIdentifierCode) {
		this.transactionSetIdentifierCode = transactionSetIdentifierCode;
	}
	/**
	 * @return the transactionSetControlNumber
	 */
	public String getTransactionSetControlNumber() {
		return transactionSetControlNumber;
	}
	/**
	 * @param transactionSetControlNumber the transactionSetControlNumber to set
	 */
	public void setTransactionSetControlNumber(String transactionSetControlNumber) {
		this.transactionSetControlNumber = transactionSetControlNumber;
	}
	/**
	 * @return the implementationConventionReference
	 */
	public String getImplementationConventionReference() {
		return implementationConventionReference;
	}
	/**
	 * @param implementationConventionReference the implementationConventionReference to set
	 */
	public void setImplementationConventionReference(
			String implementationConventionReference) {
		this.implementationConventionReference = implementationConventionReference;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ST_TransactionSetHeader [transactionSetIdentifierCode="
				+ transactionSetIdentifierCode
				+ ", transactionSetControlNumber="
				+ transactionSetControlNumber
				+ ", implementationConventionReference="
				+ implementationConventionReference + "]";
	}
}
