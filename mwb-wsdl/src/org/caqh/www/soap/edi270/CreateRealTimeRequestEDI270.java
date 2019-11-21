package org.caqh.www.soap.edi270;

import org.caqh.www.soap.edi270.model.BHT_BeginningOfHierarchicalTransaction;
import org.caqh.www.soap.edi270.model.DMG_SubscriberDemographicInformation;
import org.caqh.www.soap.edi270.model.EDIRequest270;
import org.caqh.www.soap.edi270.model.EQ_SubscriberEligibilityOrBenefitEnquiry;
import org.caqh.www.soap.edi270.model.GE_FunctionalGroupTrailer;
import org.caqh.www.soap.edi270.model.GS_FunctionalGroupHeader;
import org.caqh.www.soap.edi270.model.HL_InformationReceiverLevel;
import org.caqh.www.soap.edi270.model.HL_InformationSourceLevel;
import org.caqh.www.soap.edi270.model.HL_SubscriberLevel;
import org.caqh.www.soap.edi270.model.IEA_InterchangeControlTrailer;
import org.caqh.www.soap.edi270.model.ISA_InterchangeControlHeader;
import org.caqh.www.soap.edi270.model.NM1_InformationReceiverName;
import org.caqh.www.soap.edi270.model.NM1_InformationSourceName;
import org.caqh.www.soap.edi270.model.NM1_SubscriberName;
import org.caqh.www.soap.edi270.model.SE_TransactionSetTrailer;
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
				write_HL_InformationReceiverLevel(input, ediRequest270.getHl_InformationReceiverLevel());
				write_NM1_InformationReceiverName(input, ediRequest270.getNm1_InformationReceiverName());
				write_HL_SubscriberLevel(input, ediRequest270.getHl_SubscriberLevel());
				write_NM1_SubscriberName(input, ediRequest270.getNm1_SubscriberName());
				write_DMG_SubscriberDemographicInformation(input, ediRequest270.getDmg_SubscriberDemographicInformation());
				write_EQ_SubscriberEligibilityOrBenefitEnquiry(input, ediRequest270.getEq_SubscriberEligibilityOrBenefitEnquiry());
				write_SE_TransactionSetTrailer(input, ediRequest270.getSe_TransactionSetTrailer());
				write_GE_FunctionalGroupTrailer(input, ediRequest270.getGe_FunctionalGroupTrailer());
				write_IEA_InterchangeControlTrailer(input, ediRequest270.getIea_InterchangeControlTrailer());
				
				
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

	/**
	 * Method to write HL_InformationReceiverLevel.
	 * @param inputRequest.
	 * @param hl_InformationReceiverLevel.
	 */
	private void write_HL_InformationReceiverLevel(StringBuilder input, HL_InformationReceiverLevel hl_InformationReceiverLevel) {
		input.append(HL_CODE + SEPARATOR);
		input.append(hl_InformationReceiverLevel.getHierarchicalIDNumber() + SEPARATOR);
		input.append(hl_InformationReceiverLevel.getHierarchicalParentIDNumber() + SEPARATOR);
		input.append(hl_InformationReceiverLevel.getHierarchicalLevelCode() + SEPARATOR);
		input.append(hl_InformationReceiverLevel.getHierarchicalChildCode() + SEPARATOR);
  		input.append(EOS);
		input.append(NEW_LINE);
	}
	
	/**
	 * Method to write NM1_InformationReceiverName.
	 * @param inputRequest.
	 * @param nm1_InformationReceiverName.
	 */
	private void write_NM1_InformationReceiverName(StringBuilder input, NM1_InformationReceiverName nm1_InformationReceiverName) {
		input.append(NM1_CODE + SEPARATOR);
		input.append(nm1_InformationReceiverName.getEntityIdentifierCode() + SEPARATOR);
		input.append(nm1_InformationReceiverName.getEntityTypeQualifier() + SEPARATOR);
		input.append(nm1_InformationReceiverName.getNameLastorOrganizationName() + SEPARATOR);
		input.append(nm1_InformationReceiverName.getNameFirst() + SEPARATOR);
		input.append(nm1_InformationReceiverName.getNameMiddle() + SEPARATOR);
		input.append(nm1_InformationReceiverName.getNameSuffix() + SEPARATOR + SEPARATOR);
		input.append(nm1_InformationReceiverName.getIdentificationCodeQualifier() + SEPARATOR);
		input.append(nm1_InformationReceiverName.getIdentificationCode() + SEPARATOR);
  		input.append(EOS);
		input.append(NEW_LINE);
	}
	
	/**
	 * Method to write hl_SubscriberLevel.
	 * @param inputRequest.
	 * @param hl_SubscriberLevel.
	 */
	private void write_HL_SubscriberLevel(StringBuilder input, HL_SubscriberLevel hl_SubscriberLevel) {
		input.append(HL_CODE + SEPARATOR);
		input.append(hl_SubscriberLevel.getHierarchicalIDNumber() + SEPARATOR);
		input.append(hl_SubscriberLevel.getHierarchicalParentIDNumber() + SEPARATOR);
		input.append(hl_SubscriberLevel.getHierarchicalLevelCode() + SEPARATOR);
		input.append(hl_SubscriberLevel.getHierarchicalChildCode() + SEPARATOR);
  		input.append(EOS);
		input.append(NEW_LINE);
	}
	
	/**
	 * Method to write NM1_SubscriberName.
	 * @param inputRequest.
	 * @param nm1_SubscriberName.
	 */
	private void write_NM1_SubscriberName(StringBuilder input, NM1_SubscriberName nm1_SubscriberName) {
		input.append(NM1_CODE + SEPARATOR);
		input.append(nm1_SubscriberName.getEntityIdentifierCode() + SEPARATOR);
		input.append(nm1_SubscriberName.getEntityTypeQualifier() + SEPARATOR);
		input.append(nm1_SubscriberName.getNameLastorOrganizationName() + SEPARATOR);
		input.append(nm1_SubscriberName.getNameFirst() + SEPARATOR);
		input.append(nm1_SubscriberName.getNameMiddle() + SEPARATOR);
		input.append(nm1_SubscriberName.getNameSuffix() + SEPARATOR + SEPARATOR);
		input.append(nm1_SubscriberName.getIdentificationCodeQualifier() + SEPARATOR);
		input.append(nm1_SubscriberName.getIdentificationCode() + SEPARATOR);
  		input.append(EOS);
		input.append(NEW_LINE);
	}
	
	/**
	 * Method to write DME_SubscriberDemographicInformation .
	 * @param inputRequest.
	 * @param dmg_SubscriberDemographicInformation.
	 */
	private void write_DMG_SubscriberDemographicInformation(StringBuilder input, DMG_SubscriberDemographicInformation dmg_SubscriberDemographicInformation) {
		input.append(DMG_CODE + SEPARATOR);
		input.append(dmg_SubscriberDemographicInformation.getDateTimePeriodFormatQualifier() + SEPARATOR);
		input.append(dmg_SubscriberDemographicInformation.getDateTimePeriod() + SEPARATOR);
		input.append(dmg_SubscriberDemographicInformation.getGenderCode() + SEPARATOR);
		input.append(EOS);
		input.append(NEW_LINE);
	}
	
	/**
	 * Method to write EQ_SubscriberEligibilityOrBenefitEnquiry .
	 * @param inputRequest.
	 * @param eq_SubscriberEligibilityOrBenefitEnquiry.
	 */
	private void write_EQ_SubscriberEligibilityOrBenefitEnquiry(StringBuilder input, EQ_SubscriberEligibilityOrBenefitEnquiry eq_SubscriberEligibilityOrBenefitEnquiry) {
		input.append(DMG_CODE + SEPARATOR);
		input.append(eq_SubscriberEligibilityOrBenefitEnquiry.getServiceTypeCode() + SEPARATOR);
		input.append(EOS);
		input.append(NEW_LINE);
	}
	
	/**
	 * Method to write SE_TransactionSetTrailer .
	 * @param inputRequest.
	 * @param se_TransactionSetTrailer.
	 */
	private void write_SE_TransactionSetTrailer(StringBuilder input, SE_TransactionSetTrailer se_TransactionSetTrailer) {
		input.append(SE_CODE + SEPARATOR);
		input.append(se_TransactionSetTrailer.getNumberofIncludedSegments() + SEPARATOR);
		input.append(se_TransactionSetTrailer.getTransactionSetControlNumber() + SEPARATOR);
		input.append(EOS);
		input.append(NEW_LINE);
	}
	
	/**
	 * Method to write GE_FunctionalGroupTrailer .
	 * @param inputRequest.
	 * @param ge_FunctionalGroupTrailer.
	 */
	private void write_GE_FunctionalGroupTrailer(StringBuilder input, GE_FunctionalGroupTrailer ge_FunctionalGroupTrailer) {
		input.append(GE_CODE + SEPARATOR);
		input.append(ge_FunctionalGroupTrailer.getNumberofTransactionSetsIncluded() + SEPARATOR);
		input.append(ge_FunctionalGroupTrailer.getGroupControlNumber() + SEPARATOR);
		input.append(EOS);
		input.append(NEW_LINE);
	}
	
	/**
	 * Method to write IEA_InterchangeControlTrailer .
	 * @param inputRequest.
	 * @param iea_InterchangeControlTrailer.
	 */
	private void write_IEA_InterchangeControlTrailer(StringBuilder input, IEA_InterchangeControlTrailer iea_InterchangeControlTrailer) {
		input.append(IEA_CODE + SEPARATOR);
		input.append(iea_InterchangeControlTrailer.getNumberofIncludedFunctionalGroups() + SEPARATOR);
		input.append(iea_InterchangeControlTrailer.getInterchangeControlNumber() + SEPARATOR);
		input.append(EOS);
		input.append(NEW_LINE);
	}
}
