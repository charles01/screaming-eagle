package org.caqh.www.soap.wsdl;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EDIUtil {

	//edi270-header 
	public static final String WSSE_URL = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
	public static final String WSSE = "wsse";
	public static final String WSU_URL = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
	public static final String WSU = "wsu";
	public static final String PASSWORD_URL = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText";
	public static final String USER_NAME = "esolhcinfo";
	public static final String PASSWORD = "1c7d37bf";
	
	//edi270
	public static final String END_POINT_URL 	= "https://wsd.officeally.com/TransactionService/rtx.svc";
	public static final String VERSION 			= "2.2.0";
	public static final String PAYLOAD_ID 		= "084c1bc7-c6f4-4bd0-ac7d-021e34a261d6";
	public static final String PAYLOAD_TYPE 	= "X12_270_Request_005010X279A1";
	public static final String MODE 			= "RealTime";
	public static final String RECIEVER_ID 		= "OFFALLY";
	public static final String SENDER_ID 		= "717009";
	public static final String DATE_FORMAT 		= "yyyy-MM-dd'T'HH:mm:ss'Z'";
	//ISA
	public static final String ISA_CODE = "ISA";
	public static final String SPACE_LENGTH_10 = "          ";
	public static final String SPACE_LENGTH_09 = "         ";
	public static final String SPACE_LENGTH_08 = "        ";
	
	public static final String GS_CODE = "GS";
	public static final String ST_CODE = "ST";
	public static final String BHT_CODE = "BHT";
	public static final String HL_CODE = "HL";
	public static final String NM1_CODE = "NM1";
	
	public static final String SEPARATOR = "*";
	public static final String EOS = "~";
	public static final String NEW_LINE = "\n";

	
	//edi 270 request
//	public static final String PAYLOAD_REQUEST 	=   "ISA*00*          *00*          *ZZ*717009         *ZZ*OFFALLY        *191031*1010*^*00501*000000001*0*T*:~\n" +
//													"GS*HS*717009*OFFALLY*20191031*1010*01*X*005010X279A1~\n" + 
//													"ST*270*0001~\n" + 
//													"BHT*0022*13*20191031*1010~\n" + 
//													"HL*2*1*21*1~\n" + 
//													"NM1*PR*2*WPS Health Insurance*****PI*10878~\n" + 
//													"HL*2*1*21*1~\n" + 
//													"NM1*1P*1*JONES*MARCUS***MD*34*111223333~\n" + 
//													"REF*EO*10878~\n" +
//													"N3*201 PARK AVENUE*SUITE 300~\n"+
//													"PRV*RF*PXC*207Q00000X~\n"+
//													"HL*3*2*22*0~\n" + 
//													"TRN*1*98175-012547**~\n"+
//													"NM1*IL*1*SMITH*JOHN*L***MI*444115555~" + 
//													"REF*1L*660415~\n"+
//													"N3*15197 BROADWAY AVENUE*APT 215~\n"+
//													"PRV*RF*EI*9991234567~\n"+
//													"DMG*D8*19430917*M~\n" + 
//													"INS*N*18***************3~\n"+
//													"HI*BK:8901*BF:87200*BF:5559~\n"+
//													"DTP*291*D8*20051015~\n"+
//													"EQ*30**FAM~\n"+
//													"AMT*R*37.5~\n"+
//													"AMT*PB*37.5~\n"+
//													"REF*9F*660415~\n"+
//													"DTP*291*D8*20051031~\n"+
//													"HL*3*2*22*1~\n"+
//													"TRN*1*109834652831*WXYZCLEARH*REALTIME~\n"+
//													"SE*41*0001~\n" + 
//													"GE*1*0001~\n" + 
//													"IEA*1*000000001~\n" ;
	
	
	public static final String PAYLOAD_REQUEST 	=   "ISA*00*          *00*          *ZZ*717009         *ZZ*OFFALLY        *191113*1051*^*00501*003906526*0*P*:~\n"+

													"GS*HS*717009*OFFALLY*20191113*1051*1*X*005010X279A1~\n"+
													
													"ST*270*0001*005010X279A1~\n"+
													
													"BHT*0022*13*20191104105106*20191113*105106~\n"+
													
													"HL*1**20*1~\n"+
													
													"NM1*PR*2*WPS Health Insurance*****PI*10878~\n"+
													
													"HL*2*1*21*1~\n"+
													
													"NM1*1P*1*JONES*MARCUS***MD*XX*111223333~\n"+
													
													"HL*3*2*22*0~\n"+
													
													"NM1*IL*1*Test*Test****MI*1111111111~\n"+
													
													"DMG*D8*19581212~\n"+
													
													"EQ*AG^AH^30^42^45^47~\n"+
													
													"SE*11*0001~\n"+
													
													"GE*1*1~\n"+
													
													"IEA*1*003906526~\n";
	
	
	//edi 270 response
	public static final String PAYLOAD_RESPONSE  = "ISA*00*          *00* *ZZ* OA-RTE0 *ZZ* OA-A270 *110318*1056*^*00501*000108307*0*P*^~\n"+
												"GS*HB*940360524*OFFICEALLYRT*20121203*1131300*58486*X*005010X279A1~\n"+
												"ST*271*584863044*005010X279A1~\n"+
												"BHT*0022*11*6B2BA26FF7DF482D8A1D291334ED96*20121203*1131300~\n"+
												"HL*1**20*1~\n"+
												"NM1*PR*2*BLUE SHIELD SOMEWHERE*****24*940360524~\n"+
												"PER*IC*CUSTOMER SERVICE*TE*8006762583~\n"+
												"HL*2*1*21*1~\n"+
												"NM1*1P*2*SOME COMMUNITY HOSPITAL*****XX*1166606569~\n"+
												"HL*3*2*22*1~\n"+
												"NM1*IL*1*LAST*FIRST****MI*UUE12345678U5~\n"+
												"HL*4*3*23*0~\n"+
												"TRN*2*6B2BA26FF7DF482D8A1D291334ED96*9OFFICALLY~\n"+
												"NM1*03*1*LAST*DEPENDANT~\n"+
												"REF*6P*000PH0001~\n"+
												"N3*801 WILDWOOD DR~\n"+
												"N4*LEMOORE*CA*93245~\n"+
												"DMG*D8*19770915*F~\n"+
												"DTP*291*D8*20121203~\n"+
												"DTP*356*D8*20070701~\n"+
												"DTP*357*D8*99991231~\n"+
												"EB*1**30*HM*CALPERS ACCESS+ HMO(SM)~\n"+
												"EB*U~\n"+
												"MSG*UNLESS OTHERWISE REQUIRED BY STATE LAW, THIS NOTICE IS NOT A GUARANTEE OF PAYMENT. BENEFITS\n" + 
												"ARE SUBJECT TO ALL CONTRACT LIMITS AND THE MEMBERS STATUS ON THE DATE OF SERVICE. ACCUMULATED\n" + 
												"AMOUNTS SUCH AS DEDUCTIBLE MAY CHANGE AS ADDITIONAL CLAIMS ARE PROCESSED.~\n"+
												"EB*U~\n"+
												"MSG*FOR MORE INFORMATION REGARDING THESE BENEFITS, PLEASE CONTACT BLUE SHIELD OF CALIFORNIA.~\n"+
												"EB*G*IND*30***23*1500*****Y~ MSG*CALPERS HMO NETWORK PROVIDER~\n"+
												"EB*G*FAM*30***23*3000*****Y~ MSG*CALPERS HMO NETWORK PROVIDER~\n"+
												"EB*C*IND*47***23*0*****Y~\n"+
												"MSG*HOSPITAL CARE, INPATIENT EXCLUDES MATERNITY, INPATIENT THIS APPLIES TO ALL SUBSEQUENT\n" + 
												"OCCURRENCES OF THIS SERVICE TYPE CODE UNTIL A NEW DESCRIPTION IS PROVIDED.~\n" + 
												"MSG*BLUE SHIELD COVERS ACUTE INPATIENT SERVICES PROVIDED BY A HOSPITAL. SERVICES INCLUDE\n" + 
												"GENERALNURSING CARE, SEMI PRIVATE ROOM AND BOARD, AND INTENSIVE CARE. SERVICES MUST BE MEDICALLY\n" + 
												"NECESSARY.~\n"+
												"EB*B*IND*47***7*0****Y*Y~\n"+
												"MSG*CALPERS HMO NETWORK PROVIDER~\n"+
												"MSG*PLEASE CONTACT THE PHONE NUMBER LISTED ON THE MEMBER S CARD FOR AUTHORIZATION REQUESTS.~\n"+
												"EB*C*IND*47***23*0*****Y~\n"+
												"MSG*CALPERS HMO NETWORK PROVIDER~\n"+
												"EB*B*IND*47***7*0****Y*Y~\n"+
												"MSG*CALPERS HMO NETWORK PROVIDER~\n"+
												"MSG*PLEASE CONTACT THE PHONE NUMBER LISTED ON THE MEMBER S CARD FOR AUTHORIZATION REQUESTS.~\n"+
												"SE*66*584863044~\n"+
												"GE*1*58486~\n"+
												"IEA*1*584863044~\n";
	
	public static final String DATE_PATTERN_YYMMDD = "yyMMdd";
	public static final String DATE_PATTERN_YYYYMMDD = "YYYYMMdd";
	public static final String DATE_PATTERN_YYYYMMDDHHMMSS = "YYYYMMddHHmmss";
	
	public static final String TIME_PATTERN_HHMM = "HHmm";
	public static final String TIME_PATTERN_HHMMSS = "HHmmss";


	/**
	 * Method to getDate in different forms.
	 * @param pattern
	 * @return date.
	 */
	public static String getDate(String pattern) {
		String date = null;
		if(pattern.equalsIgnoreCase(DATE_PATTERN_YYMMDD)) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			date = simpleDateFormat.format(new Date());
		}else if(pattern.equalsIgnoreCase(DATE_PATTERN_YYYYMMDD)) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			date = simpleDateFormat.format(new Date());
		}else if(pattern.equalsIgnoreCase(DATE_PATTERN_YYYYMMDDHHMMSS)) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			date = simpleDateFormat.format(new Date());
		}
		return date;
	}
	
	/**
	 * Method to getTime in different forms.
	 * @param pattern
	 * @return time.
	 */
	public static String getTime(String pattern) {
		String time = null;
		if(pattern.equalsIgnoreCase(TIME_PATTERN_HHMM)) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			time = simpleDateFormat.format(new Date());
		}else if(pattern.equalsIgnoreCase(TIME_PATTERN_HHMMSS)) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			time = simpleDateFormat.format(new Date());
		}
		return time;
	}
	
}
