package org.caqh.www.soap.wsdl;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;

public class HeaderAdder extends EDIUtil{

	public static void addSecurityToHeader(org.apache.axiom.soap.SOAPHeader header) {
		try {
			OMFactory factory = OMAbstractFactory.getOMFactory();
			OMNamespace namespaceWSSE = factory.createOMNamespace(WSSE_URL, WSSE);
			
			//creating the security element.
			OMElement element = factory.createOMElement("Security", namespaceWSSE);
			OMAttribute attribute = factory.createOMAttribute("mustUnderstand", null, "1");
			element.addAttribute(attribute);
			header.addChild(element);
			
			//creating username token element.
			OMElement element2 = factory.createOMElement("UsernameToken", namespaceWSSE);
			OMNamespace namespaceWSU = factory.createOMNamespace(WSU_URL, WSU);
			attribute = factory.createOMAttribute("Id", namespaceWSU, "UsernameToken-1");
			element2.addAttribute(attribute);
			element.addChild(element2);
			
			//creating the username element.
			OMElement element3 = factory.createOMElement("Username", namespaceWSSE);
			element3.setText(USER_NAME);
			
			//creating password element.
			OMElement element4 = factory.createOMElement("Password", namespaceWSSE);
			attribute = factory.createOMAttribute("Type", null,PASSWORD_URL);
			element4.setText(PASSWORD);
			element2.addChild(element3);
			element2.addChild(element4);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
