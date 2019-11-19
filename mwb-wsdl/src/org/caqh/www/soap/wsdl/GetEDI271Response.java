package org.caqh.www.soap.wsdl;

import org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeResponse;

public class GetEDI271Response  extends EDIUtil{
	/**
	 * Method to get sample response file.
	 * @return COREEnvelopeRealTimeResponse
	 */
	public static COREEnvelopeRealTimeResponse getCOREEnvelopeRealTimeResponse() {
		COREEnvelopeRealTimeResponse realTimeResponse = new COREEnvelopeRealTimeResponse();
		try {
			realTimeResponse.setPayload(PAYLOAD_RESPONSE);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return realTimeResponse;
	}
}
