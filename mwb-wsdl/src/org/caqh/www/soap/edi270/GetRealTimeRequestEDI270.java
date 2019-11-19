package org.caqh.www.soap.edi270;

import org.caqh.www.soap.edi270.model.*;

public class GetRealTimeRequestEDI270 {

	public static void main(String[] args) {
			EDIRequest270 ediRequest270 = new EDIRequest270();
			ediRequest270.setIsa_InterchangeControlHeader(getISA_InterchangeControlHeader());
//			ediRequest270.setGs_FunctionalGroupHeader(new GS_FunctionalGroupHeader());
//			ediRequest270.setSt_TransactionSetHeader(new ST_TransactionSetHeader());
//			ediRequest270.setBht_BeginningOfHierarchicalTransaction(new BHT_BeginningOfHierarchicalTransaction());
//			ediRequest270.setHl_InformationSourceLevel(new HL_InformationSourceLevel());
//			ediRequest270.setNm1_InformationSourceName(new NM1_InformationSourceName());
			
			CreateRealTimeRequestEDI270 createRealTimeRequestEDI270 = new CreateRealTimeRequestEDI270();
			String inputRequest = createRealTimeRequestEDI270.createRequest(ediRequest270);
			System.out.println(inputRequest);
	}
	
	/**
	 * Method to getISA_InterchangeControlHeader.
	 * @param request.
	 * @return isa_InterchangeControlHeader.
	 */
	private static ISA_InterchangeControlHeader getISA_InterchangeControlHeader() {
			ISA_InterchangeControlHeader isa_InterchangeControlHeader = new ISA_InterchangeControlHeader();
			try{
					isa_InterchangeControlHeader.setAuthorizationInformationQualifier("");
					isa_InterchangeControlHeader.setAuthorizationInformation("");
					isa_InterchangeControlHeader.setSecurityInformationQualifier("");
					isa_InterchangeControlHeader.setSecurityInformation("");
					isa_InterchangeControlHeader.setInterchangeIDQualifier1("");
					isa_InterchangeControlHeader.setInterchangeSenderID("");
					isa_InterchangeControlHeader.setInterchangeIDQualifier2("");
					isa_InterchangeControlHeader.setInterchangeReceiverID("");
					isa_InterchangeControlHeader.setInterchangeDate("");
					isa_InterchangeControlHeader.setInterchangeTime("");
					isa_InterchangeControlHeader.setRepetitionSeparator("");
					isa_InterchangeControlHeader.setInterchangeControlVersionNumber("");
					isa_InterchangeControlHeader.setInterchangeControlNumber("");
					isa_InterchangeControlHeader.setAcknowledgmentRequested("");
					isa_InterchangeControlHeader.setInterchangeUsageIndicator("");
					isa_InterchangeControlHeader.setComponentElementSeparator("");
			}catch(Exception e){
					e.printStackTrace();
			}
			return isa_InterchangeControlHeader;
	}

}
