package org.caqh.www.soap.edi270;

import org.caqh.www.soap.edi270.model.BHT_BeginningOfHierarchicalTransaction;
import org.caqh.www.soap.edi270.model.EDIRequest270;
import org.caqh.www.soap.edi270.model.GS_FunctionalGroupHeader;
import org.caqh.www.soap.edi270.model.HL_InformationSourceLevel;
import org.caqh.www.soap.edi270.model.ISA_InterchangeControlHeader;
import org.caqh.www.soap.edi270.model.NM1_InformationSourceName;
import org.caqh.www.soap.edi270.model.ST_TransactionSetHeader;
import org.caqh.www.soap.wsdl.EDIUtil;

public class CreateRealTimeRequestEDI270 extends EDIUtil {

	 //* ISA*00*          *00*          *ZZ*111111         *ZZ*OFFALLY        *191104*1051*^*00501*003906526*0*P*:~
	
	/**
	 * Method to createRequest.
	 * @param ediRequest270.
	 * @return inputRequest.
	 */
	public String createRequest(EDIRequest270  ediRequest270){
			StringBuilder input =new StringBuilder();  
			try{
				write_ISA_InterchangeControlHeader(input, ediRequest270.getIsa_InterchangeControlHeader());
				write_GS_FunctionalGroupHeader(input, ediRequest270.getGs_FunctionalGroupHeader());
				write_ST_TransactionSetHeader(input, ediRequest270.getSt_TransactionSetHeader());
				write_BHT_BeginningOfHierarchicalTransaction(input, ediRequest270.getBht_BeginningOfHierarchicalTransaction());
				write_HL_InformationSourceLevel(input, ediRequest270.getHl_InformationSourceLevel());
				write_NM1_InformationSourceLevel(input, ediRequest270.getNm1_InformationSourceName());
				
			}catch(Exception e){
				e.printStackTrace();
			}
			return input.toString();
	}



	/**
	 * Method to write ISA_InterchangeControlHeader.
	 * @param inputRequest.
	 * @param isa_InterchangeControlHeader.
	 */
	private void write_ISA_InterchangeControlHeader(StringBuilder input, ISA_InterchangeControlHeader isa_InterchangeControlHeader) {
		input.append(ISA_CODE + SEPARATOR);
		input.append(isa_InterchangeControlHeader.getAuthorizationInformationQualifier() + SEPARATOR); 
		input.append(isa_InterchangeControlHeader.getAuthorizationInformation() + SEPARATOR); 
		input.append(isa_InterchangeControlHeader.getSecurityInformationQualifier()+SEPARATOR);
		input.append(isa_InterchangeControlHeader.getSecurityInformation() + SEPARATOR);
		input.append(isa_InterchangeControlHeader.getInterchangeIDQualifier1() + SEPARATOR);
		input.append(isa_InterchangeControlHeader.getInterchangeSenderID() + SPACE_LENGTH_09 + SEPARATOR); 
		input.append(isa_InterchangeControlHeader.getInterchangeIDQualifier2() + SEPARATOR);
		input.append(isa_InterchangeControlHeader.getInterchangeReceiverID() + SPACE_LENGTH_08 + SEPARATOR);
		input.append(isa_InterchangeControlHeader.getInterchangeDate() + SEPARATOR);
		input.append(isa_InterchangeControlHeader.getInterchangeTime() + SEPARATOR);
		input.append(isa_InterchangeControlHeader.getRepetitionSeparator() + SEPARATOR);
		input.append(isa_InterchangeControlHeader.getInterchangeControlVersionNumber() + SEPARATOR);
		input.append(isa_InterchangeControlHeader.getInterchangeControlNumber() + SEPARATOR);
		input.append(isa_InterchangeControlHeader.getAcknowledgmentRequested() + SEPARATOR);
		input.append(isa_InterchangeControlHeader.getInterchangeUsageIndicator() + SEPARATOR);
		input.append(isa_InterchangeControlHeader.getComponentElementSeparator() + SEPARATOR);
		input.append(EOS);
		input.append(NEW_LINE);
	}
	
	/**
	 * Method to write GS_FunctionalGroupHeader.
	 * @param input
	 * @param gs_FunctionalGroupHeader
	 */
	private void write_GS_FunctionalGroupHeader(StringBuilder input, GS_FunctionalGroupHeader gs_FunctionalGroupHeader) {
		input.append(GS_CODE + SEPARATOR);
		input.append(gs_FunctionalGroupHeader.getFunctionalIdentifierCode() + SEPARATOR);
		input.append(gs_FunctionalGroupHeader.getApplicationSenderCode() + SEPARATOR);
		input.append(gs_FunctionalGroupHeader.getApplicationReceiverCode() + SEPARATOR);
		input.append(gs_FunctionalGroupHeader.getDate() + SEPARATOR);
		input.append(gs_FunctionalGroupHeader.getTime() + SEPARATOR);
		input.append(gs_FunctionalGroupHeader.getGroupControlNumber() + SEPARATOR);
		input.append(gs_FunctionalGroupHeader.getResponsibleAgencyCode() + SEPARATOR);
		input.append(gs_FunctionalGroupHeader.getVersionCode() + SEPARATOR);
		input.append(EOS);
		input.append(NEW_LINE);
 	}
	
	/**
	 * Method to write ST_TransactionSetHeader.
	 * @param input
	 * @param st_TransactionSetHeader
	 */
	private void write_ST_TransactionSetHeader(StringBuilder input, ST_TransactionSetHeader st_TransactionSetHeader) {
		input.append(ST_CODE + SEPARATOR);
		input.append(st_TransactionSetHeader.getTransactionSetIdentifierCode() + SEPARATOR);
		input.append(st_TransactionSetHeader.getTransactionSetControlNumber() + SEPARATOR);
		input.append(st_TransactionSetHeader.getImplementationConventionReference() + SEPARATOR);
		input.append(EOS);
		input.append(NEW_LINE);
		
	}
	
	/**
	 * Method to write bht_BeginningOfHierarchicalTransaction.
	 * @param input
	 * @param bht_BeginningOfHierarchicalTransaction
	 */
	private void write_BHT_BeginningOfHierarchicalTransaction(StringBuilder input,BHT_BeginningOfHierarchicalTransaction bht_BeginningOfHierarchicalTransaction) {
		input.append(ST_CODE + SEPARATOR);
		input.append(bht_BeginningOfHierarchicalTransaction.getHierarchicalStructureCode() + SEPARATOR);
		input.append(bht_BeginningOfHierarchicalTransaction.getTransactionSetPurposeCode() + SEPARATOR);
		input.append(bht_BeginningOfHierarchicalTransaction.getReferenceIdentification() + SEPARATOR);
		input.append(bht_BeginningOfHierarchicalTransaction.getDate() + SEPARATOR);
		input.append(bht_BeginningOfHierarchicalTransaction.getTime() + SEPARATOR);
		input.append(EOS);
		input.append(NEW_LINE);
	}

	/**
	 * Method to write HL_InformationSourceLevel.
	 * @param inputRequest.
	 * @param hl_InformationSourceLevel.
	 */
	private void write_HL_InformationSourceLevel(StringBuilder input, HL_InformationSourceLevel hl_InformationSourceLevel) {
		input.append(HL_CODE + SEPARATOR);
		input.append(hl_InformationSourceLevel.getHierarchicalIDNumber() + SEPARATOR + SEPARATOR);
		input.append(hl_InformationSourceLevel.getHierarchicalLevelCode() + SEPARATOR);
		input.append(hl_InformationSourceLevel.getHierarchicalChildCode() + SEPARATOR);
  		input.append(EOS);
		input.append(NEW_LINE);
	}
	
	/**
	 * Method to write NM1_InformationSourceName.
	 * @param inputRequest.
	 * @param nm1_InformationSourceName.
	 */
	private void write_NM1_InformationSourceLevel(StringBuilder input, NM1_InformationSourceName nm1_InformationSourceName) {
		input.append(NM1_CODE + SEPARATOR);
		input.append(nm1_InformationSourceName.getEntityIdentifierCode() + SEPARATOR);
		input.append(nm1_InformationSourceName.getEntityTypeQualifier() + SEPARATOR);
		input.append(nm1_InformationSourceName.getNameLastorOrganizationName() + SEPARATOR);
		input.append(nm1_InformationSourceName.getNameFirst() + SEPARATOR);
		input.append(nm1_InformationSourceName.getNameMiddle() + SEPARATOR);
		input.append(nm1_InformationSourceName.getNameSuffix() + SEPARATOR + SEPARATOR);
		input.append(nm1_InformationSourceName.getIdentificationCodeQualifier() + SEPARATOR);
		input.append(nm1_InformationSourceName.getIdentificationCode() + SEPARATOR);
  		input.append(EOS);
		input.append(NEW_LINE);
	}
	
}
