package org.caqh.www.soap.wsdl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.caqh.www.soap.edi270.GetRealTimeRequestEDI270;
import org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeRequest;
import org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeResponse;

public class EDI270Client extends EDIUtil {
	public static void main(String[] args) {
		COREEnvelopeRealTimeResponse realTimeResponse = new COREEnvelopeRealTimeResponse();
		try {
			RtxStub stub = new RtxStub(END_POINT_URL);
			COREEnvelopeRealTimeRequest realTimeRequest = new COREEnvelopeRealTimeRequest();
			realTimeRequest.setCORERuleVersion(VERSION);
			String payload = GetRealTimeRequestEDI270.get270Request();
			realTimeRequest.setPayload(payload);
			realTimeRequest.setPayloadID(PAYLOAD_ID);
			realTimeRequest.setPayloadType(PAYLOAD_TYPE);
			realTimeRequest.setProcessingMode(MODE);
			realTimeRequest.setReceiverID(RECIEVER_ID);
			realTimeRequest.setSenderID(SENDER_ID);
			realTimeRequest.setTimeStamp(new SimpleDateFormat(DATE_FORMAT).format(new Date()));
			System.out.println("-------------- EDI 270 Request --------------");
			System.out.println(realTimeRequest.getPayload());
			realTimeResponse = stub.RealTimeTransaction(realTimeRequest);
			System.out.println("-------------- EDI 270 Response --------------");
			System.out.println(realTimeResponse.getPayload().replaceAll("~", "~\n"));
			
  		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
