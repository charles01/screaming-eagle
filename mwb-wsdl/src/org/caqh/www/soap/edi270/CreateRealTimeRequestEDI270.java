package org.caqh.www.soap.edi270;

import org.caqh.www.soap.edi270.model.EDI270Constants;
import org.caqh.www.soap.edi270.model.EDIRequest270;
import org.caqh.www.soap.edi270.model.ISA_InterchangeControlHeader;

public class CreateRealTimeRequestEDI270 extends EDI270Constants {

	 //* ISA*00*          *00*          *ZZ*111111         *ZZ*OFFALLY        *191104*1051*^*00501*003906526*0*P*:~

	
	/**
	 * Method to createRequest.
	 * @param ediRequest270.
	 * @return inputRequest.
	 */
	public String createRequest(EDIRequest270  ediRequest270){
			StringBuilder input =new StringBuilder();  
			try{
					writeISA_InterchangeControlHeader(input, ediRequest270.getIsa_InterchangeControlHeader());
			}catch(Exception e){
					e.printStackTrace();
			}
			return input.toString();
	}
	/**
	 * Method to writeISA_InterchangeControlHeader.
	 * @param inputRequest.
	 * @param isa_InterchangeControlHeader.
	 */
	private void writeISA_InterchangeControlHeader(StringBuilder input, ISA_InterchangeControlHeader isa_InterchangeControlHeader) {
		input.append(ISA_CODE+SEPARATOR);
		input.append(EOS);
		input.append(NEW_LINE);
	}
	
	
}
