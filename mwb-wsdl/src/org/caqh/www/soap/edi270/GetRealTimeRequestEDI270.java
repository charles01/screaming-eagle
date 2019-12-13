package org.caqh.www.soap.edi270;

import org.caqh.www.soap.edi270.model.*;

public class GetRealTimeRequestEDI270 {

	//sample
	public static String get270Request() {
			EDIRequest270 ediRequest270 = new EDIRequest270();
			ediRequest270.setIsa_InterchangeControlHeader(new ISA_InterchangeControlHeader());
			ediRequest270.setGs_FunctionalGroupHeader(new GS_FunctionalGroupHeader());
			ediRequest270.setSt_TransactionSetHeader(new ST_TransactionSetHeader());
			ediRequest270.setBht_BeginningOfHierarchicalTransaction(new BHT_BeginningOfHierarchicalTransaction());
			
			ediRequest270.setHl_InformationSourceLevel(new HL_InformationSourceLevel());
			ediRequest270.setNm1_InformationSourceName(new NM1_InformationSourceName());
			ediRequest270.getNm1_InformationSourceName().setNameLastorOrganizationName("Blue Shield of California");
			ediRequest270.getNm1_InformationSourceName().setIdentificationCode("940360524");
			
			ediRequest270.setHl_InformationReceiverLevel(new HL_InformationReceiverLevel());
			ediRequest270.setNm1_InformationReceiverName(new NM1_InformationReceiverName());
			ediRequest270.getNm1_InformationReceiverName().setNameLastorOrganizationName("ELHAM ELLE FARAJIAN DPM");
			
			ediRequest270.setHl_SubscriberLevel(new HL_SubscriberLevel());
			ediRequest270.setNm1_SubscriberName(new NM1_SubscriberName());
			ediRequest270.getNm1_SubscriberName().setNameLastorOrganizationName("Abujbara");
			ediRequest270.getNm1_SubscriberName().setNameFirst("Nabil");
			
			ediRequest270.setDmg_SubscriberDemographicInformation(new DMG_SubscriberDemographicInformation());
			ediRequest270.getDmg_SubscriberDemographicInformation().setDateTimePeriod("19570127");
			
			ediRequest270.setEq_SubscriberEligibilityOrBenefitEnquiry(new EQ_SubscriberEligibilityOrBenefitEnquiry());
			
			ediRequest270.setSe_TransactionSetTrailer(new SE_TransactionSetTrailer());
			ediRequest270.setGe_FunctionalGroupTrailer(new GE_FunctionalGroupTrailer());
			ediRequest270.setIea_InterchangeControlTrailer(new IEA_InterchangeControlTrailer());
			
			CreateRealTimeRequestEDI270 createRealTimeRequestEDI270 = new CreateRealTimeRequestEDI270();
			String inputRequest = createRealTimeRequestEDI270.createRequest(ediRequest270);
			return inputRequest;
	}
}
