
/**
 * RtxStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
        package org.caqh.www.soap.wsdl;

import javax.xml.soap.SOAPHeader;

/*
        *  RtxStub java implementation
        */

        
        public class RtxStub extends org.apache.axis2.client.Stub
        {
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return Long.toString(System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("Rtx" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[8];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/", "GenericBatchReceiptConfirmationTransaction"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"CustomBinding_CORETransactions_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:UsernameToken sp:IncludeToken=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy/IncludeToken/AlwaysToRecipient\"><wsp:Policy><sp:WssUsernameToken10 /></wsp:Policy></sp:UsernameToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy /></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"CustomBinding_CORETransactions_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:UsernameToken sp:IncludeToken=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy/IncludeToken/AlwaysToRecipient\"><wsp:Policy><sp:WssUsernameToken10 /></wsp:Policy></sp:UsernameToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy /></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/", "BatchSubmitTransaction"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"CustomBinding_CORETransactions_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:UsernameToken sp:IncludeToken=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy/IncludeToken/AlwaysToRecipient\"><wsp:Policy><sp:WssUsernameToken10 /></wsp:Policy></sp:UsernameToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy /></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"CustomBinding_CORETransactions_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:UsernameToken sp:IncludeToken=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy/IncludeToken/AlwaysToRecipient\"><wsp:Policy><sp:WssUsernameToken10 /></wsp:Policy></sp:UsernameToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy /></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/", "BatchResultsRetrievalTransaction"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"CustomBinding_CORETransactions_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:UsernameToken sp:IncludeToken=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy/IncludeToken/AlwaysToRecipient\"><wsp:Policy><sp:WssUsernameToken10 /></wsp:Policy></sp:UsernameToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy /></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"CustomBinding_CORETransactions_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:UsernameToken sp:IncludeToken=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy/IncludeToken/AlwaysToRecipient\"><wsp:Policy><sp:WssUsernameToken10 /></wsp:Policy></sp:UsernameToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy /></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/", "RealTimeTransaction"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"CustomBinding_CORETransactions_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:UsernameToken sp:IncludeToken=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy/IncludeToken/AlwaysToRecipient\"><wsp:Policy><sp:WssUsernameToken10 /></wsp:Policy></sp:UsernameToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy /></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"CustomBinding_CORETransactions_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:UsernameToken sp:IncludeToken=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy/IncludeToken/AlwaysToRecipient\"><wsp:Policy><sp:WssUsernameToken10 /></wsp:Policy></sp:UsernameToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy /></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/", "BatchResultsAckSubmitTransaction"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"CustomBinding_CORETransactions_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:UsernameToken sp:IncludeToken=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy/IncludeToken/AlwaysToRecipient\"><wsp:Policy><sp:WssUsernameToken10 /></wsp:Policy></sp:UsernameToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy /></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"CustomBinding_CORETransactions_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:UsernameToken sp:IncludeToken=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy/IncludeToken/AlwaysToRecipient\"><wsp:Policy><sp:WssUsernameToken10 /></wsp:Policy></sp:UsernameToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy /></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/", "BatchSubmitAckRetrievalTransaction"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"CustomBinding_CORETransactions_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:UsernameToken sp:IncludeToken=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy/IncludeToken/AlwaysToRecipient\"><wsp:Policy><sp:WssUsernameToken10 /></wsp:Policy></sp:UsernameToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy /></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"CustomBinding_CORETransactions_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:UsernameToken sp:IncludeToken=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy/IncludeToken/AlwaysToRecipient\"><wsp:Policy><sp:WssUsernameToken10 /></wsp:Policy></sp:UsernameToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy /></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/", "GenericBatchRetrievalTransaction"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"CustomBinding_CORETransactions_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:UsernameToken sp:IncludeToken=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy/IncludeToken/AlwaysToRecipient\"><wsp:Policy><sp:WssUsernameToken10 /></wsp:Policy></sp:UsernameToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy /></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"CustomBinding_CORETransactions_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:UsernameToken sp:IncludeToken=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy/IncludeToken/AlwaysToRecipient\"><wsp:Policy><sp:WssUsernameToken10 /></wsp:Policy></sp:UsernameToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy /></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/", "GenericBatchSubmissionTransaction"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"CustomBinding_CORETransactions_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:UsernameToken sp:IncludeToken=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy/IncludeToken/AlwaysToRecipient\"><wsp:Policy><sp:WssUsernameToken10 /></wsp:Policy></sp:UsernameToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy /></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy wsu:Id=\"CustomBinding_CORETransactions_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:TransportToken><wsp:Policy><sp:HttpsToken RequireClientCertificate=\"false\" /></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy><sp:Strict /></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><sp:SignedSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:UsernameToken sp:IncludeToken=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy/IncludeToken/AlwaysToRecipient\"><wsp:Policy><sp:WssUsernameToken10 /></wsp:Policy></sp:UsernameToken></wsp:Policy></sp:SignedSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy /></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[7]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         


    }

    /**
      *Constructor that takes in a configContext
      */

    public RtxStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public RtxStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
        _service.applyPolicy();
        
	
        configurationContext = _serviceClient.getServiceContext().getConfigurationContext();

        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
            //Set the soap version
            _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
        
    
    }

    /**
     * Default Constructor
     */
    public RtxStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://wsd.officeally.com/TransactionService/rtx.svc" );
                
    }

    /**
     * Default Constructor
     */
    public RtxStub() throws org.apache.axis2.AxisFault {
        
                    this("https://wsd.officeally.com/TransactionService/rtx.svc" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public RtxStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.caqh.www.soap.wsdl.Rtx#GenericBatchReceiptConfirmationTransaction
                     * @param cOREEnvelopeBatchResultsAckSubmission6
                    
                     */

                    

                            public  org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse GenericBatchReceiptConfirmationTransaction(

                            org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmission cOREEnvelopeBatchResultsAckSubmission6)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("GenericBatchReceiptConfirmationTransaction");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cOREEnvelopeBatchResultsAckSubmission6,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/",
                                                    "GenericBatchReceiptConfirmationTransaction")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.caqh.www.soap.wsdl.Rtx#startGenericBatchReceiptConfirmationTransaction
                    * @param cOREEnvelopeBatchResultsAckSubmission6
                
                */
                public  void startGenericBatchReceiptConfirmationTransaction(

                 org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmission cOREEnvelopeBatchResultsAckSubmission6,

                  final org.caqh.www.soap.wsdl.RtxCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("GenericBatchReceiptConfirmationTransaction");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cOREEnvelopeBatchResultsAckSubmission6,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/",
                                                    "GenericBatchReceiptConfirmationTransaction")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultGenericBatchReceiptConfirmationTransaction(
                                        (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorGenericBatchReceiptConfirmationTransaction(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorGenericBatchReceiptConfirmationTransaction(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchReceiptConfirmationTransaction(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchReceiptConfirmationTransaction(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchReceiptConfirmationTransaction(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchReceiptConfirmationTransaction(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchReceiptConfirmationTransaction(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchReceiptConfirmationTransaction(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchReceiptConfirmationTransaction(f);
                                            }
									    } else {
										    callback.receiveErrorGenericBatchReceiptConfirmationTransaction(f);
									    }
									} else {
									    callback.receiveErrorGenericBatchReceiptConfirmationTransaction(f);
									}
								} else {
								    callback.receiveErrorGenericBatchReceiptConfirmationTransaction(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorGenericBatchReceiptConfirmationTransaction(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.caqh.www.soap.wsdl.Rtx#BatchSubmitTransaction
                     * @param cOREEnvelopeBatchSubmission8
                    
                     */

                    

                            public  org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse BatchSubmitTransaction(

                            org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmission cOREEnvelopeBatchSubmission8)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("BatchSubmitTransaction");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cOREEnvelopeBatchSubmission8,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/",
                                                    "BatchSubmitTransaction")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.caqh.www.soap.wsdl.Rtx#startBatchSubmitTransaction
                    * @param cOREEnvelopeBatchSubmission8
                
                */
                public  void startBatchSubmitTransaction(

                 org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmission cOREEnvelopeBatchSubmission8,

                  final org.caqh.www.soap.wsdl.RtxCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("BatchSubmitTransaction");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cOREEnvelopeBatchSubmission8,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/",
                                                    "BatchSubmitTransaction")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultBatchSubmitTransaction(
                                        (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorBatchSubmitTransaction(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorBatchSubmitTransaction(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchSubmitTransaction(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchSubmitTransaction(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchSubmitTransaction(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchSubmitTransaction(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchSubmitTransaction(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchSubmitTransaction(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchSubmitTransaction(f);
                                            }
									    } else {
										    callback.receiveErrorBatchSubmitTransaction(f);
									    }
									} else {
									    callback.receiveErrorBatchSubmitTransaction(f);
									}
								} else {
								    callback.receiveErrorBatchSubmitTransaction(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorBatchSubmitTransaction(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.caqh.www.soap.wsdl.Rtx#BatchResultsRetrievalTransaction
                     * @param cOREEnvelopeBatchResultsRetrievalRequest10
                    
                     */

                    

                            public  org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse BatchResultsRetrievalTransaction(

                            org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalRequest cOREEnvelopeBatchResultsRetrievalRequest10)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("BatchResultsRetrievalTransaction");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cOREEnvelopeBatchResultsRetrievalRequest10,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/",
                                                    "BatchResultsRetrievalTransaction")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.caqh.www.soap.wsdl.Rtx#startBatchResultsRetrievalTransaction
                    * @param cOREEnvelopeBatchResultsRetrievalRequest10
                
                */
                public  void startBatchResultsRetrievalTransaction(

                 org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalRequest cOREEnvelopeBatchResultsRetrievalRequest10,

                  final org.caqh.www.soap.wsdl.RtxCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
             _operationClient.getOptions().setAction("BatchResultsRetrievalTransaction");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cOREEnvelopeBatchResultsRetrievalRequest10,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/",
                                                    "BatchResultsRetrievalTransaction")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultBatchResultsRetrievalTransaction(
                                        (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorBatchResultsRetrievalTransaction(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorBatchResultsRetrievalTransaction(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchResultsRetrievalTransaction(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchResultsRetrievalTransaction(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchResultsRetrievalTransaction(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchResultsRetrievalTransaction(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchResultsRetrievalTransaction(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchResultsRetrievalTransaction(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchResultsRetrievalTransaction(f);
                                            }
									    } else {
										    callback.receiveErrorBatchResultsRetrievalTransaction(f);
									    }
									} else {
									    callback.receiveErrorBatchResultsRetrievalTransaction(f);
									}
								} else {
								    callback.receiveErrorBatchResultsRetrievalTransaction(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorBatchResultsRetrievalTransaction(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.caqh.www.soap.wsdl.Rtx#RealTimeTransaction
                     * @param cOREEnvelopeRealTimeRequest12
                    
                     */

                    

                            public  org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeResponse RealTimeTransaction(

                            org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeRequest cOREEnvelopeRealTimeRequest12)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("RealTimeTransaction");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

               
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

 
              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
			cOREEnvelopeRealTimeRequest12,
			optimizeContent(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/",
			"RealTimeTransaction")));
			
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);
        
        HeaderAdder.addSecurityToHeader(_messageContext.getEnvelope().getHeader());
        
        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
               
                
                System.out.println("REQUEST");
                System.out.println(env);
                
                System.out.println("RESPONSE");
                System.out.println(_returnEnv);
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.caqh.www.soap.wsdl.Rtx#startRealTimeTransaction
                    * @param cOREEnvelopeRealTimeRequest12
                
                */
                public  void startRealTimeTransaction(

                 org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeRequest cOREEnvelopeRealTimeRequest12,

                  final org.caqh.www.soap.wsdl.RtxCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
             _operationClient.getOptions().setAction("RealTimeTransaction");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cOREEnvelopeRealTimeRequest12,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/",
                                                    "RealTimeTransaction")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultRealTimeTransaction(
                                        (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorRealTimeTransaction(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorRealTimeTransaction(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorRealTimeTransaction(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorRealTimeTransaction(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorRealTimeTransaction(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorRealTimeTransaction(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorRealTimeTransaction(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorRealTimeTransaction(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorRealTimeTransaction(f);
                                            }
									    } else {
										    callback.receiveErrorRealTimeTransaction(f);
									    }
									} else {
									    callback.receiveErrorRealTimeTransaction(f);
									}
								} else {
								    callback.receiveErrorRealTimeTransaction(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorRealTimeTransaction(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.caqh.www.soap.wsdl.Rtx#BatchResultsAckSubmitTransaction
                     * @param cOREEnvelopeBatchResultsAckSubmission14
                    
                     */

                    

                            public  org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse BatchResultsAckSubmitTransaction(

                            org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmission cOREEnvelopeBatchResultsAckSubmission14)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("BatchResultsAckSubmitTransaction");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cOREEnvelopeBatchResultsAckSubmission14,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/",
                                                    "BatchResultsAckSubmitTransaction")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.caqh.www.soap.wsdl.Rtx#startBatchResultsAckSubmitTransaction
                    * @param cOREEnvelopeBatchResultsAckSubmission14
                
                */
                public  void startBatchResultsAckSubmitTransaction(

                 org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmission cOREEnvelopeBatchResultsAckSubmission14,

                  final org.caqh.www.soap.wsdl.RtxCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
             _operationClient.getOptions().setAction("BatchResultsAckSubmitTransaction");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cOREEnvelopeBatchResultsAckSubmission14,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/",
                                                    "BatchResultsAckSubmitTransaction")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultBatchResultsAckSubmitTransaction(
                                        (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorBatchResultsAckSubmitTransaction(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorBatchResultsAckSubmitTransaction(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchResultsAckSubmitTransaction(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchResultsAckSubmitTransaction(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchResultsAckSubmitTransaction(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchResultsAckSubmitTransaction(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchResultsAckSubmitTransaction(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchResultsAckSubmitTransaction(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchResultsAckSubmitTransaction(f);
                                            }
									    } else {
										    callback.receiveErrorBatchResultsAckSubmitTransaction(f);
									    }
									} else {
									    callback.receiveErrorBatchResultsAckSubmitTransaction(f);
									}
								} else {
								    callback.receiveErrorBatchResultsAckSubmitTransaction(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorBatchResultsAckSubmitTransaction(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.caqh.www.soap.wsdl.Rtx#BatchSubmitAckRetrievalTransaction
                     * @param cOREEnvelopeBatchSubmissionAckRetrievalRequest16
                    
                     */

                    

                            public  org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalResponse BatchSubmitAckRetrievalTransaction(

                            org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalRequest cOREEnvelopeBatchSubmissionAckRetrievalRequest16)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("BatchSubmitAckRetrievalTransaction");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cOREEnvelopeBatchSubmissionAckRetrievalRequest16,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/",
                                                    "BatchSubmitAckRetrievalTransaction")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.caqh.www.soap.wsdl.Rtx#startBatchSubmitAckRetrievalTransaction
                    * @param cOREEnvelopeBatchSubmissionAckRetrievalRequest16
                
                */
                public  void startBatchSubmitAckRetrievalTransaction(

                 org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalRequest cOREEnvelopeBatchSubmissionAckRetrievalRequest16,

                  final org.caqh.www.soap.wsdl.RtxCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
             _operationClient.getOptions().setAction("BatchSubmitAckRetrievalTransaction");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cOREEnvelopeBatchSubmissionAckRetrievalRequest16,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/",
                                                    "BatchSubmitAckRetrievalTransaction")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultBatchSubmitAckRetrievalTransaction(
                                        (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorBatchSubmitAckRetrievalTransaction(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorBatchSubmitAckRetrievalTransaction(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchSubmitAckRetrievalTransaction(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchSubmitAckRetrievalTransaction(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchSubmitAckRetrievalTransaction(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchSubmitAckRetrievalTransaction(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchSubmitAckRetrievalTransaction(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchSubmitAckRetrievalTransaction(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorBatchSubmitAckRetrievalTransaction(f);
                                            }
									    } else {
										    callback.receiveErrorBatchSubmitAckRetrievalTransaction(f);
									    }
									} else {
									    callback.receiveErrorBatchSubmitAckRetrievalTransaction(f);
									}
								} else {
								    callback.receiveErrorBatchSubmitAckRetrievalTransaction(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorBatchSubmitAckRetrievalTransaction(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.caqh.www.soap.wsdl.Rtx#GenericBatchRetrievalTransaction
                     * @param cOREEnvelopeBatchResultsRetrievalRequest18
                    
                     */

                    

                            public  org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse GenericBatchRetrievalTransaction(

                            org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalRequest cOREEnvelopeBatchResultsRetrievalRequest18)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("GenericBatchRetrievalTransaction");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cOREEnvelopeBatchResultsRetrievalRequest18,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/",
                                                    "GenericBatchRetrievalTransaction")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.caqh.www.soap.wsdl.Rtx#startGenericBatchRetrievalTransaction
                    * @param cOREEnvelopeBatchResultsRetrievalRequest18
                
                */
                public  void startGenericBatchRetrievalTransaction(

                 org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalRequest cOREEnvelopeBatchResultsRetrievalRequest18,

                  final org.caqh.www.soap.wsdl.RtxCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
             _operationClient.getOptions().setAction("GenericBatchRetrievalTransaction");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cOREEnvelopeBatchResultsRetrievalRequest18,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/",
                                                    "GenericBatchRetrievalTransaction")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultGenericBatchRetrievalTransaction(
                                        (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorGenericBatchRetrievalTransaction(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorGenericBatchRetrievalTransaction(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchRetrievalTransaction(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchRetrievalTransaction(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchRetrievalTransaction(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchRetrievalTransaction(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchRetrievalTransaction(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchRetrievalTransaction(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchRetrievalTransaction(f);
                                            }
									    } else {
										    callback.receiveErrorGenericBatchRetrievalTransaction(f);
									    }
									} else {
									    callback.receiveErrorGenericBatchRetrievalTransaction(f);
									}
								} else {
								    callback.receiveErrorGenericBatchRetrievalTransaction(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorGenericBatchRetrievalTransaction(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[6].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[6].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.caqh.www.soap.wsdl.Rtx#GenericBatchSubmissionTransaction
                     * @param cOREEnvelopeBatchSubmission20
                    
                     */

                    

                            public  org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse GenericBatchSubmissionTransaction(

                            org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmission cOREEnvelopeBatchSubmission20)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("GenericBatchSubmissionTransaction");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cOREEnvelopeBatchSubmission20,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/",
                                                    "GenericBatchSubmissionTransaction")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.caqh.www.soap.wsdl.Rtx#startGenericBatchSubmissionTransaction
                    * @param cOREEnvelopeBatchSubmission20
                
                */
                public  void startGenericBatchSubmissionTransaction(

                 org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmission cOREEnvelopeBatchSubmission20,

                  final org.caqh.www.soap.wsdl.RtxCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
             _operationClient.getOptions().setAction("GenericBatchSubmissionTransaction");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cOREEnvelopeBatchSubmission20,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.caqh.org/SOAP/WSDL/",
                                                    "GenericBatchSubmissionTransaction")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultGenericBatchSubmissionTransaction(
                                        (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorGenericBatchSubmissionTransaction(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorGenericBatchSubmissionTransaction(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchSubmissionTransaction(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchSubmissionTransaction(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchSubmissionTransaction(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchSubmissionTransaction(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchSubmissionTransaction(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchSubmissionTransaction(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGenericBatchSubmissionTransaction(f);
                                            }
									    } else {
										    callback.receiveErrorGenericBatchSubmissionTransaction(f);
									    }
									} else {
									    callback.receiveErrorGenericBatchSubmissionTransaction(f);
									}
								} else {
								    callback.receiveErrorGenericBatchSubmissionTransaction(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorGenericBatchSubmissionTransaction(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[7].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[7].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    ////////////////////////////////////////////////////////////////////////
    
    private static org.apache.neethi.Policy getPolicy (java.lang.String policyString) {
    	java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(policyString.getBytes());
    	return org.apache.neethi.PolicyEngine.getPolicy(bais);
    }
    
    /////////////////////////////////////////////////////////////////////////

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //https://wsd.officeally.com/TransactionService/rtx.svc
        public static class COREEnvelopeBatchSubmissionResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd",
                "COREEnvelopeBatchSubmissionResponse",
                "ns1");

            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for PayloadType
                        */

                        
                                    protected java.lang.String localPayloadType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadType(){
                               return localPayloadType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadType
                               */
                               public void setPayloadType(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTypeTracker = true;
                                       } else {
                                          localPayloadTypeTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadType=param;
                                    

                               }
                            

                        /**
                        * field for ProcessingMode
                        */

                        
                                    protected java.lang.String localProcessingMode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProcessingModeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProcessingMode(){
                               return localProcessingMode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProcessingMode
                               */
                               public void setProcessingMode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localProcessingModeTracker = true;
                                       } else {
                                          localProcessingModeTracker = false;
                                              
                                       }
                                   
                                            this.localProcessingMode=param;
                                    

                               }
                            

                        /**
                        * field for PayloadID
                        */

                        
                                    protected java.lang.String localPayloadID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadID(){
                               return localPayloadID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadID
                               */
                               public void setPayloadID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadIDTracker = true;
                                       } else {
                                          localPayloadIDTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadID=param;
                                    

                               }
                            

                        /**
                        * field for PayloadLength
                        */

                        
                                    protected int localPayloadLength ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadLengthTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPayloadLength(){
                               return localPayloadLength;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadLength
                               */
                               public void setPayloadLength(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPayloadLengthTracker = false;
                                              
                                       } else {
                                          localPayloadLengthTracker = true;
                                       }
                                   
                                            this.localPayloadLength=param;
                                    

                               }
                            

                        /**
                        * field for TimeStamp
                        */

                        
                                    protected java.lang.String localTimeStamp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTimeStampTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTimeStamp(){
                               return localTimeStamp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeStamp
                               */
                               public void setTimeStamp(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTimeStampTracker = true;
                                       } else {
                                          localTimeStampTracker = false;
                                              
                                       }
                                   
                                            this.localTimeStamp=param;
                                    

                               }
                            

                        /**
                        * field for SenderID
                        */

                        
                                    protected java.lang.String localSenderID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderID(){
                               return localSenderID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderID
                               */
                               public void setSenderID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSenderIDTracker = true;
                                       } else {
                                          localSenderIDTracker = false;
                                              
                                       }
                                   
                                            this.localSenderID=param;
                                    

                               }
                            

                        /**
                        * field for ReceiverID
                        */

                        
                                    protected java.lang.String localReceiverID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReceiverIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReceiverID(){
                               return localReceiverID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReceiverID
                               */
                               public void setReceiverID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localReceiverIDTracker = true;
                                       } else {
                                          localReceiverIDTracker = false;
                                              
                                       }
                                   
                                            this.localReceiverID=param;
                                    

                               }
                            

                        /**
                        * field for CORERuleVersion
                        */

                        
                                    protected java.lang.String localCORERuleVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCORERuleVersionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCORERuleVersion(){
                               return localCORERuleVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CORERuleVersion
                               */
                               public void setCORERuleVersion(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCORERuleVersionTracker = true;
                                       } else {
                                          localCORERuleVersionTracker = false;
                                              
                                       }
                                   
                                            this.localCORERuleVersion=param;
                                    

                               }
                            

                        /**
                        * field for CheckSum
                        */

                        
                                    protected java.lang.String localCheckSum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCheckSumTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCheckSum(){
                               return localCheckSum;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CheckSum
                               */
                               public void setCheckSum(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCheckSumTracker = true;
                                       } else {
                                          localCheckSumTracker = false;
                                              
                                       }
                                   
                                            this.localCheckSum=param;
                                    

                               }
                            

                        /**
                        * field for Payload
                        */

                        
                                    protected javax.activation.DataHandler localPayload ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getPayload(){
                               return localPayload;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Payload
                               */
                               public void setPayload(javax.activation.DataHandler param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTracker = true;
                                       } else {
                                          localPayloadTracker = false;
                                              
                                       }
                                   
                                            this.localPayload=param;
                                    

                               }
                            

                        /**
                        * field for ErrorCode
                        */

                        
                                    protected java.lang.String localErrorCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorCodeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getErrorCode(){
                               return localErrorCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorCode
                               */
                               public void setErrorCode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localErrorCodeTracker = true;
                                       } else {
                                          localErrorCodeTracker = false;
                                              
                                       }
                                   
                                            this.localErrorCode=param;
                                    

                               }
                            

                        /**
                        * field for ErrorMessage
                        */

                        
                                    protected java.lang.String localErrorMessage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorMessageTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getErrorMessage(){
                               return localErrorMessage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorMessage
                               */
                               public void setErrorMessage(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localErrorMessageTracker = true;
                                       } else {
                                          localErrorMessageTracker = false;
                                              
                                       }
                                   
                                            this.localErrorMessage=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       COREEnvelopeBatchSubmissionResponse.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":COREEnvelopeBatchSubmissionResponse",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "COREEnvelopeBatchSubmissionResponse",
                           xmlWriter);
                   }

               
                   }
                if (localPayloadTypeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadType", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadType");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadType");
                                    }
                                

                                          if (localPayloadType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProcessingModeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ProcessingMode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ProcessingMode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ProcessingMode");
                                    }
                                

                                          if (localProcessingMode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProcessingMode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadID");
                                    }
                                

                                          if (localPayloadID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadLengthTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadLength", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadLength");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadLength");
                                    }
                                
                                               if (localPayloadLength==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PayloadLength cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadLength));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTimeStampTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"TimeStamp", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TimeStamp");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TimeStamp");
                                    }
                                

                                          if (localTimeStamp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTimeStamp);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SenderID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SenderID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SenderID");
                                    }
                                

                                          if (localSenderID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReceiverIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ReceiverID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ReceiverID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ReceiverID");
                                    }
                                

                                          if (localReceiverID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReceiverID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCORERuleVersionTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CORERuleVersion", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CORERuleVersion");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CORERuleVersion");
                                    }
                                

                                          if (localCORERuleVersion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCORERuleVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCheckSumTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CheckSum", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CheckSum");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CheckSum");
                                    }
                                

                                          if (localCheckSum==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CheckSum cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCheckSum);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Payload", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Payload");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Payload");
                                    }
                                
                                        
                                    if (localPayload!=null)
                                    {
                                       xmlWriter.writeDataHandler(localPayload);
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             } if (localErrorCodeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ErrorCode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ErrorCode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ErrorCode");
                                    }
                                

                                          if (localErrorCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ErrorCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localErrorMessageTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ErrorMessage", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ErrorMessage");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ErrorMessage");
                                    }
                                

                                          if (localErrorMessage==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ErrorMessage cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorMessage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localPayloadTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadType"));
                                 
                                        if (localPayloadType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                        }
                                    } if (localProcessingModeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ProcessingMode"));
                                 
                                        if (localProcessingMode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProcessingMode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                        }
                                    } if (localPayloadIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadID"));
                                 
                                        if (localPayloadID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                        }
                                    } if (localPayloadLengthTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadLength"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadLength));
                            } if (localTimeStampTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "TimeStamp"));
                                 
                                        if (localTimeStamp != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                        }
                                    } if (localSenderIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "SenderID"));
                                 
                                        if (localSenderID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                        }
                                    } if (localReceiverIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ReceiverID"));
                                 
                                        if (localReceiverID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceiverID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                        }
                                    } if (localCORERuleVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CORERuleVersion"));
                                 
                                        if (localCORERuleVersion != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCORERuleVersion));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                        }
                                    } if (localCheckSumTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CheckSum"));
                                 
                                        if (localCheckSum != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckSum));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CheckSum cannot be null!!");
                                        }
                                    } if (localPayloadTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                        "Payload"));
                                
                            elementList.add(localPayload);
                        } if (localErrorCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ErrorCode"));
                                 
                                        if (localErrorCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ErrorCode cannot be null!!");
                                        }
                                    } if (localErrorMessageTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ErrorMessage"));
                                 
                                        if (localErrorMessage != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorMessage));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ErrorMessage cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static COREEnvelopeBatchSubmissionResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            COREEnvelopeBatchSubmissionResponse object =
                new COREEnvelopeBatchSubmissionResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"COREEnvelopeBatchSubmissionResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (COREEnvelopeBatchSubmissionResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadType").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ProcessingMode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProcessingMode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadLength").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadLength(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPayloadLength(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","TimeStamp").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeStamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","SenderID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ReceiverID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReceiverID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CORERuleVersion").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCORERuleVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CheckSum").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCheckSum(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","Payload").equals(reader.getName())){
                                reader.next();
                                    if (isReaderMTOMAware(reader)
                                            &&
                                            java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_BINARY)))
                                    {
                                        //MTOM aware reader - get the datahandler directly and put it in the object
                                        object.setPayload(
                                                (javax.activation.DataHandler) reader.getProperty(org.apache.axiom.om.OMConstants.DATA_HANDLER));
                                    } else {
                                        if (reader.getEventType() == javax.xml.stream.XMLStreamConstants.START_ELEMENT && reader.getName().equals(new javax.xml.namespace.QName(org.apache.axiom.om.impl.MTOMConstants.XOP_NAMESPACE_URI, org.apache.axiom.om.impl.MTOMConstants.XOP_INCLUDE)))
                                        {
                                            java.lang.String id = org.apache.axiom.om.util.ElementHelper.getContentID(reader, "UTF-8");
                                            object.setPayload(((org.apache.axiom.soap.impl.builder.MTOMStAXSOAPModelBuilder) ((org.apache.axiom.om.impl.llom.OMStAXWrapper) reader).getBuilder()).getDataHandler(id));
                                            reader.next();
                                            
                                                reader.next();
                                            
                                        } else if(reader.hasText()) {
                                            //Do the usual conversion
                                            java.lang.String content = reader.getText();
                                            object.setPayload(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBase64Binary(content));
                                            
                                                reader.next();
                                            
                                        }
                                    }

                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ErrorCode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ErrorMessage").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorMessage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          
        public static class COREEnvelopeBatchResultsAckSubmission
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd",
                "COREEnvelopeBatchResultsAckSubmission",
                "ns1");

            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for PayloadType
                        */

                        
                                    protected java.lang.String localPayloadType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadType(){
                               return localPayloadType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadType
                               */
                               public void setPayloadType(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTypeTracker = true;
                                       } else {
                                          localPayloadTypeTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadType=param;
                                    

                               }
                            

                        /**
                        * field for ProcessingMode
                        */

                        
                                    protected java.lang.String localProcessingMode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProcessingModeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProcessingMode(){
                               return localProcessingMode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProcessingMode
                               */
                               public void setProcessingMode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localProcessingModeTracker = true;
                                       } else {
                                          localProcessingModeTracker = false;
                                              
                                       }
                                   
                                            this.localProcessingMode=param;
                                    

                               }
                            

                        /**
                        * field for PayloadID
                        */

                        
                                    protected java.lang.String localPayloadID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadID(){
                               return localPayloadID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadID
                               */
                               public void setPayloadID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadIDTracker = true;
                                       } else {
                                          localPayloadIDTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadID=param;
                                    

                               }
                            

                        /**
                        * field for PayloadLength
                        */

                        
                                    protected int localPayloadLength ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadLengthTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPayloadLength(){
                               return localPayloadLength;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadLength
                               */
                               public void setPayloadLength(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPayloadLengthTracker = false;
                                              
                                       } else {
                                          localPayloadLengthTracker = true;
                                       }
                                   
                                            this.localPayloadLength=param;
                                    

                               }
                            

                        /**
                        * field for TimeStamp
                        */

                        
                                    protected java.lang.String localTimeStamp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTimeStampTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTimeStamp(){
                               return localTimeStamp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeStamp
                               */
                               public void setTimeStamp(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTimeStampTracker = true;
                                       } else {
                                          localTimeStampTracker = false;
                                              
                                       }
                                   
                                            this.localTimeStamp=param;
                                    

                               }
                            

                        /**
                        * field for SenderID
                        */

                        
                                    protected java.lang.String localSenderID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderID(){
                               return localSenderID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderID
                               */
                               public void setSenderID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSenderIDTracker = true;
                                       } else {
                                          localSenderIDTracker = false;
                                              
                                       }
                                   
                                            this.localSenderID=param;
                                    

                               }
                            

                        /**
                        * field for ReceiverID
                        */

                        
                                    protected java.lang.String localReceiverID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReceiverIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReceiverID(){
                               return localReceiverID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReceiverID
                               */
                               public void setReceiverID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localReceiverIDTracker = true;
                                       } else {
                                          localReceiverIDTracker = false;
                                              
                                       }
                                   
                                            this.localReceiverID=param;
                                    

                               }
                            

                        /**
                        * field for CORERuleVersion
                        */

                        
                                    protected java.lang.String localCORERuleVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCORERuleVersionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCORERuleVersion(){
                               return localCORERuleVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CORERuleVersion
                               */
                               public void setCORERuleVersion(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCORERuleVersionTracker = true;
                                       } else {
                                          localCORERuleVersionTracker = false;
                                              
                                       }
                                   
                                            this.localCORERuleVersion=param;
                                    

                               }
                            

                        /**
                        * field for CheckSum
                        */

                        
                                    protected java.lang.String localCheckSum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCheckSumTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCheckSum(){
                               return localCheckSum;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CheckSum
                               */
                               public void setCheckSum(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCheckSumTracker = true;
                                       } else {
                                          localCheckSumTracker = false;
                                              
                                       }
                                   
                                            this.localCheckSum=param;
                                    

                               }
                            

                        /**
                        * field for Payload
                        */

                        
                                    protected javax.activation.DataHandler localPayload ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getPayload(){
                               return localPayload;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Payload
                               */
                               public void setPayload(javax.activation.DataHandler param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTracker = true;
                                       } else {
                                          localPayloadTracker = false;
                                              
                                       }
                                   
                                            this.localPayload=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       COREEnvelopeBatchResultsAckSubmission.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":COREEnvelopeBatchResultsAckSubmission",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "COREEnvelopeBatchResultsAckSubmission",
                           xmlWriter);
                   }

               
                   }
                if (localPayloadTypeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadType", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadType");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadType");
                                    }
                                

                                          if (localPayloadType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProcessingModeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ProcessingMode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ProcessingMode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ProcessingMode");
                                    }
                                

                                          if (localProcessingMode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProcessingMode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadID");
                                    }
                                

                                          if (localPayloadID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadLengthTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadLength", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadLength");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadLength");
                                    }
                                
                                               if (localPayloadLength==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PayloadLength cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadLength));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTimeStampTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"TimeStamp", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TimeStamp");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TimeStamp");
                                    }
                                

                                          if (localTimeStamp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTimeStamp);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SenderID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SenderID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SenderID");
                                    }
                                

                                          if (localSenderID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReceiverIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ReceiverID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ReceiverID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ReceiverID");
                                    }
                                

                                          if (localReceiverID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReceiverID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCORERuleVersionTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CORERuleVersion", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CORERuleVersion");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CORERuleVersion");
                                    }
                                

                                          if (localCORERuleVersion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCORERuleVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCheckSumTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CheckSum", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CheckSum");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CheckSum");
                                    }
                                

                                          if (localCheckSum==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CheckSum cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCheckSum);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Payload", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Payload");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Payload");
                                    }
                                
                                        
                                    if (localPayload!=null)
                                    {
                                       xmlWriter.writeDataHandler(localPayload);
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localPayloadTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadType"));
                                 
                                        if (localPayloadType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                        }
                                    } if (localProcessingModeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ProcessingMode"));
                                 
                                        if (localProcessingMode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProcessingMode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                        }
                                    } if (localPayloadIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadID"));
                                 
                                        if (localPayloadID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                        }
                                    } if (localPayloadLengthTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadLength"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadLength));
                            } if (localTimeStampTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "TimeStamp"));
                                 
                                        if (localTimeStamp != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                        }
                                    } if (localSenderIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "SenderID"));
                                 
                                        if (localSenderID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                        }
                                    } if (localReceiverIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ReceiverID"));
                                 
                                        if (localReceiverID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceiverID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                        }
                                    } if (localCORERuleVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CORERuleVersion"));
                                 
                                        if (localCORERuleVersion != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCORERuleVersion));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                        }
                                    } if (localCheckSumTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CheckSum"));
                                 
                                        if (localCheckSum != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckSum));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CheckSum cannot be null!!");
                                        }
                                    } if (localPayloadTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                        "Payload"));
                                
                            elementList.add(localPayload);
                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static COREEnvelopeBatchResultsAckSubmission parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            COREEnvelopeBatchResultsAckSubmission object =
                new COREEnvelopeBatchResultsAckSubmission();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"COREEnvelopeBatchResultsAckSubmission".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (COREEnvelopeBatchResultsAckSubmission)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadType").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ProcessingMode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProcessingMode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadLength").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadLength(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPayloadLength(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","TimeStamp").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeStamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","SenderID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ReceiverID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReceiverID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CORERuleVersion").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCORERuleVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CheckSum").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCheckSum(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","Payload").equals(reader.getName())){
                                reader.next();
                                    if (isReaderMTOMAware(reader)
                                            &&
                                            java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_BINARY)))
                                    {
                                        //MTOM aware reader - get the datahandler directly and put it in the object
                                        object.setPayload(
                                                (javax.activation.DataHandler) reader.getProperty(org.apache.axiom.om.OMConstants.DATA_HANDLER));
                                    } else {
                                        if (reader.getEventType() == javax.xml.stream.XMLStreamConstants.START_ELEMENT && reader.getName().equals(new javax.xml.namespace.QName(org.apache.axiom.om.impl.MTOMConstants.XOP_NAMESPACE_URI, org.apache.axiom.om.impl.MTOMConstants.XOP_INCLUDE)))
                                        {
                                            java.lang.String id = org.apache.axiom.om.util.ElementHelper.getContentID(reader, "UTF-8");
                                            object.setPayload(((org.apache.axiom.soap.impl.builder.MTOMStAXSOAPModelBuilder) ((org.apache.axiom.om.impl.llom.OMStAXWrapper) reader).getBuilder()).getDataHandler(id));
                                            reader.next();
                                            
                                                reader.next();
                                            
                                        } else if(reader.hasText()) {
                                            //Do the usual conversion
                                            java.lang.String content = reader.getText();
                                            object.setPayload(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBase64Binary(content));
                                            
                                                reader.next();
                                            
                                        }
                                    }

                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          
        public static class COREEnvelopeBatchResultsRetrievalRequest
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd",
                "COREEnvelopeBatchResultsRetrievalRequest",
                "ns1");

            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for PayloadType
                        */

                        
                                    protected java.lang.String localPayloadType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadType(){
                               return localPayloadType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadType
                               */
                               public void setPayloadType(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTypeTracker = true;
                                       } else {
                                          localPayloadTypeTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadType=param;
                                    

                               }
                            

                        /**
                        * field for ProcessingMode
                        */

                        
                                    protected java.lang.String localProcessingMode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProcessingModeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProcessingMode(){
                               return localProcessingMode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProcessingMode
                               */
                               public void setProcessingMode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localProcessingModeTracker = true;
                                       } else {
                                          localProcessingModeTracker = false;
                                              
                                       }
                                   
                                            this.localProcessingMode=param;
                                    

                               }
                            

                        /**
                        * field for PayloadID
                        */

                        
                                    protected java.lang.String localPayloadID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadID(){
                               return localPayloadID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadID
                               */
                               public void setPayloadID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadIDTracker = true;
                                       } else {
                                          localPayloadIDTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadID=param;
                                    

                               }
                            

                        /**
                        * field for PayloadLength
                        */

                        
                                    protected int localPayloadLength ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadLengthTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPayloadLength(){
                               return localPayloadLength;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadLength
                               */
                               public void setPayloadLength(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPayloadLengthTracker = false;
                                              
                                       } else {
                                          localPayloadLengthTracker = true;
                                       }
                                   
                                            this.localPayloadLength=param;
                                    

                               }
                            

                        /**
                        * field for TimeStamp
                        */

                        
                                    protected java.lang.String localTimeStamp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTimeStampTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTimeStamp(){
                               return localTimeStamp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeStamp
                               */
                               public void setTimeStamp(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTimeStampTracker = true;
                                       } else {
                                          localTimeStampTracker = false;
                                              
                                       }
                                   
                                            this.localTimeStamp=param;
                                    

                               }
                            

                        /**
                        * field for SenderID
                        */

                        
                                    protected java.lang.String localSenderID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderID(){
                               return localSenderID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderID
                               */
                               public void setSenderID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSenderIDTracker = true;
                                       } else {
                                          localSenderIDTracker = false;
                                              
                                       }
                                   
                                            this.localSenderID=param;
                                    

                               }
                            

                        /**
                        * field for ReceiverID
                        */

                        
                                    protected java.lang.String localReceiverID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReceiverIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReceiverID(){
                               return localReceiverID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReceiverID
                               */
                               public void setReceiverID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localReceiverIDTracker = true;
                                       } else {
                                          localReceiverIDTracker = false;
                                              
                                       }
                                   
                                            this.localReceiverID=param;
                                    

                               }
                            

                        /**
                        * field for CORERuleVersion
                        */

                        
                                    protected java.lang.String localCORERuleVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCORERuleVersionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCORERuleVersion(){
                               return localCORERuleVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CORERuleVersion
                               */
                               public void setCORERuleVersion(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCORERuleVersionTracker = true;
                                       } else {
                                          localCORERuleVersionTracker = false;
                                              
                                       }
                                   
                                            this.localCORERuleVersion=param;
                                    

                               }
                            

                        /**
                        * field for CheckSum
                        */

                        
                                    protected java.lang.String localCheckSum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCheckSumTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCheckSum(){
                               return localCheckSum;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CheckSum
                               */
                               public void setCheckSum(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCheckSumTracker = true;
                                       } else {
                                          localCheckSumTracker = false;
                                              
                                       }
                                   
                                            this.localCheckSum=param;
                                    

                               }
                            

                        /**
                        * field for Payload
                        */

                        
                                    protected javax.activation.DataHandler localPayload ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getPayload(){
                               return localPayload;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Payload
                               */
                               public void setPayload(javax.activation.DataHandler param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTracker = true;
                                       } else {
                                          localPayloadTracker = false;
                                              
                                       }
                                   
                                            this.localPayload=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       COREEnvelopeBatchResultsRetrievalRequest.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":COREEnvelopeBatchResultsRetrievalRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "COREEnvelopeBatchResultsRetrievalRequest",
                           xmlWriter);
                   }

               
                   }
                if (localPayloadTypeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadType", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadType");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadType");
                                    }
                                

                                          if (localPayloadType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProcessingModeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ProcessingMode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ProcessingMode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ProcessingMode");
                                    }
                                

                                          if (localProcessingMode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProcessingMode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadID");
                                    }
                                

                                          if (localPayloadID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadLengthTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadLength", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadLength");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadLength");
                                    }
                                
                                               if (localPayloadLength==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PayloadLength cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadLength));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTimeStampTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"TimeStamp", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TimeStamp");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TimeStamp");
                                    }
                                

                                          if (localTimeStamp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTimeStamp);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SenderID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SenderID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SenderID");
                                    }
                                

                                          if (localSenderID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReceiverIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ReceiverID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ReceiverID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ReceiverID");
                                    }
                                

                                          if (localReceiverID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReceiverID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCORERuleVersionTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CORERuleVersion", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CORERuleVersion");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CORERuleVersion");
                                    }
                                

                                          if (localCORERuleVersion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCORERuleVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCheckSumTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CheckSum", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CheckSum");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CheckSum");
                                    }
                                

                                          if (localCheckSum==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CheckSum cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCheckSum);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Payload", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Payload");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Payload");
                                    }
                                
                                        
                                    if (localPayload!=null)
                                    {
                                       xmlWriter.writeDataHandler(localPayload);
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localPayloadTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadType"));
                                 
                                        if (localPayloadType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                        }
                                    } if (localProcessingModeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ProcessingMode"));
                                 
                                        if (localProcessingMode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProcessingMode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                        }
                                    } if (localPayloadIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadID"));
                                 
                                        if (localPayloadID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                        }
                                    } if (localPayloadLengthTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadLength"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadLength));
                            } if (localTimeStampTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "TimeStamp"));
                                 
                                        if (localTimeStamp != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                        }
                                    } if (localSenderIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "SenderID"));
                                 
                                        if (localSenderID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                        }
                                    } if (localReceiverIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ReceiverID"));
                                 
                                        if (localReceiverID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceiverID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                        }
                                    } if (localCORERuleVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CORERuleVersion"));
                                 
                                        if (localCORERuleVersion != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCORERuleVersion));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                        }
                                    } if (localCheckSumTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CheckSum"));
                                 
                                        if (localCheckSum != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckSum));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CheckSum cannot be null!!");
                                        }
                                    } if (localPayloadTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                        "Payload"));
                                
                            elementList.add(localPayload);
                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static COREEnvelopeBatchResultsRetrievalRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            COREEnvelopeBatchResultsRetrievalRequest object =
                new COREEnvelopeBatchResultsRetrievalRequest();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"COREEnvelopeBatchResultsRetrievalRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (COREEnvelopeBatchResultsRetrievalRequest)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadType").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ProcessingMode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProcessingMode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadLength").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadLength(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPayloadLength(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","TimeStamp").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeStamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","SenderID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ReceiverID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReceiverID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CORERuleVersion").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCORERuleVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CheckSum").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCheckSum(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","Payload").equals(reader.getName())){
                                reader.next();
                                    if (isReaderMTOMAware(reader)
                                            &&
                                            java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_BINARY)))
                                    {
                                        //MTOM aware reader - get the datahandler directly and put it in the object
                                        object.setPayload(
                                                (javax.activation.DataHandler) reader.getProperty(org.apache.axiom.om.OMConstants.DATA_HANDLER));
                                    } else {
                                        if (reader.getEventType() == javax.xml.stream.XMLStreamConstants.START_ELEMENT && reader.getName().equals(new javax.xml.namespace.QName(org.apache.axiom.om.impl.MTOMConstants.XOP_NAMESPACE_URI, org.apache.axiom.om.impl.MTOMConstants.XOP_INCLUDE)))
                                        {
                                            java.lang.String id = org.apache.axiom.om.util.ElementHelper.getContentID(reader, "UTF-8");
                                            object.setPayload(((org.apache.axiom.soap.impl.builder.MTOMStAXSOAPModelBuilder) ((org.apache.axiom.om.impl.llom.OMStAXWrapper) reader).getBuilder()).getDataHandler(id));
                                            reader.next();
                                            
                                                reader.next();
                                            
                                        } else if(reader.hasText()) {
                                            //Do the usual conversion
                                            java.lang.String content = reader.getText();
                                            object.setPayload(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBase64Binary(content));
                                            
                                                reader.next();
                                            
                                        }
                                    }

                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          
        public static class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
        public static class COREEnvelopeRealTimeRequest
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd",
                "COREEnvelopeRealTimeRequest",
                "ns1");

            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for PayloadType
                        */

                        
                                    protected java.lang.String localPayloadType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadType(){
                               return localPayloadType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadType
                               */
                               public void setPayloadType(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTypeTracker = true;
                                       } else {
                                          localPayloadTypeTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadType=param;
                                    

                               }
                            

                        /**
                        * field for ProcessingMode
                        */

                        
                                    protected java.lang.String localProcessingMode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProcessingModeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProcessingMode(){
                               return localProcessingMode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProcessingMode
                               */
                               public void setProcessingMode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localProcessingModeTracker = true;
                                       } else {
                                          localProcessingModeTracker = false;
                                              
                                       }
                                   
                                            this.localProcessingMode=param;
                                    

                               }
                            

                        /**
                        * field for PayloadID
                        */

                        
                                    protected java.lang.String localPayloadID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadID(){
                               return localPayloadID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadID
                               */
                               public void setPayloadID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadIDTracker = true;
                                       } else {
                                          localPayloadIDTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadID=param;
                                    

                               }
                            

                        /**
                        * field for TimeStamp
                        */

                        
                                    protected java.lang.String localTimeStamp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTimeStampTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTimeStamp(){
                               return localTimeStamp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeStamp
                               */
                               public void setTimeStamp(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTimeStampTracker = true;
                                       } else {
                                          localTimeStampTracker = false;
                                              
                                       }
                                   
                                            this.localTimeStamp=param;
                                    

                               }
                            

                        /**
                        * field for SenderID
                        */

                        
                                    protected java.lang.String localSenderID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderID(){
                               return localSenderID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderID
                               */
                               public void setSenderID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSenderIDTracker = true;
                                       } else {
                                          localSenderIDTracker = false;
                                              
                                       }
                                   
                                            this.localSenderID=param;
                                    

                               }
                            

                        /**
                        * field for ReceiverID
                        */

                        
                                    protected java.lang.String localReceiverID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReceiverIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReceiverID(){
                               return localReceiverID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReceiverID
                               */
                               public void setReceiverID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localReceiverIDTracker = true;
                                       } else {
                                          localReceiverIDTracker = false;
                                              
                                       }
                                   
                                            this.localReceiverID=param;
                                    

                               }
                            

                        /**
                        * field for CORERuleVersion
                        */

                        
                                    protected java.lang.String localCORERuleVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCORERuleVersionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCORERuleVersion(){
                               return localCORERuleVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CORERuleVersion
                               */
                               public void setCORERuleVersion(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCORERuleVersionTracker = true;
                                       } else {
                                          localCORERuleVersionTracker = false;
                                              
                                       }
                                   
                                            this.localCORERuleVersion=param;
                                    

                               }
                            

                        /**
                        * field for Payload
                        */

                        
                                    protected java.lang.String localPayload ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayload(){
                               return localPayload;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Payload
                               */
                               public void setPayload(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTracker = true;
                                       } else {
                                          localPayloadTracker = false;
                                              
                                       }
                                   
                                            this.localPayload=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       COREEnvelopeRealTimeRequest.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":COREEnvelopeRealTimeRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "COREEnvelopeRealTimeRequest",
                           xmlWriter);
                   }

               
                   }
                if (localPayloadTypeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadType", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadType");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadType");
                                    }
                                

                                          if (localPayloadType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProcessingModeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ProcessingMode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ProcessingMode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ProcessingMode");
                                    }
                                

                                          if (localProcessingMode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProcessingMode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadID");
                                    }
                                

                                          if (localPayloadID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTimeStampTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"TimeStamp", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TimeStamp");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TimeStamp");
                                    }
                                

                                          if (localTimeStamp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTimeStamp);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SenderID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SenderID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SenderID");
                                    }
                                

                                          if (localSenderID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReceiverIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ReceiverID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ReceiverID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ReceiverID");
                                    }
                                

                                          if (localReceiverID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReceiverID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCORERuleVersionTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CORERuleVersion", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CORERuleVersion");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CORERuleVersion");
                                    }
                                

                                          if (localCORERuleVersion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCORERuleVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Payload", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Payload");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Payload");
                                    }
                                

                                          if (localPayload==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Payload cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayload);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localPayloadTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadType"));
                                 
                                        if (localPayloadType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                        }
                                    } if (localProcessingModeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ProcessingMode"));
                                 
                                        if (localProcessingMode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProcessingMode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                        }
                                    } if (localPayloadIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadID"));
                                 
                                        if (localPayloadID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                        }
                                    } if (localTimeStampTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "TimeStamp"));
                                 
                                        if (localTimeStamp != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                        }
                                    } if (localSenderIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "SenderID"));
                                 
                                        if (localSenderID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                        }
                                    } if (localReceiverIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ReceiverID"));
                                 
                                        if (localReceiverID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceiverID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                        }
                                    } if (localCORERuleVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CORERuleVersion"));
                                 
                                        if (localCORERuleVersion != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCORERuleVersion));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                        }
                                    } if (localPayloadTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "Payload"));
                                 
                                        if (localPayload != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayload));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Payload cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static COREEnvelopeRealTimeRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            COREEnvelopeRealTimeRequest object =
                new COREEnvelopeRealTimeRequest();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"COREEnvelopeRealTimeRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (COREEnvelopeRealTimeRequest)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadType").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ProcessingMode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProcessingMode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","TimeStamp").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeStamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","SenderID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ReceiverID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReceiverID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CORERuleVersion").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCORERuleVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","Payload").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayload(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          
        public static class COREEnvelopeRealTimeResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd",
                "COREEnvelopeRealTimeResponse",
                "ns1");

            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for PayloadType
                        */

                        
                                    protected java.lang.String localPayloadType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadType(){
                               return localPayloadType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadType
                               */
                               public void setPayloadType(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTypeTracker = true;
                                       } else {
                                          localPayloadTypeTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadType=param;
                                    

                               }
                            

                        /**
                        * field for ProcessingMode
                        */

                        
                                    protected java.lang.String localProcessingMode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProcessingModeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProcessingMode(){
                               return localProcessingMode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProcessingMode
                               */
                               public void setProcessingMode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localProcessingModeTracker = true;
                                       } else {
                                          localProcessingModeTracker = false;
                                              
                                       }
                                   
                                            this.localProcessingMode=param;
                                    

                               }
                            

                        /**
                        * field for PayloadID
                        */

                        
                                    protected java.lang.String localPayloadID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadID(){
                               return localPayloadID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadID
                               */
                               public void setPayloadID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadIDTracker = true;
                                       } else {
                                          localPayloadIDTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadID=param;
                                    

                               }
                            

                        /**
                        * field for TimeStamp
                        */

                        
                                    protected java.lang.String localTimeStamp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTimeStampTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTimeStamp(){
                               return localTimeStamp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeStamp
                               */
                               public void setTimeStamp(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTimeStampTracker = true;
                                       } else {
                                          localTimeStampTracker = false;
                                              
                                       }
                                   
                                            this.localTimeStamp=param;
                                    

                               }
                            

                        /**
                        * field for SenderID
                        */

                        
                                    protected java.lang.String localSenderID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderID(){
                               return localSenderID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderID
                               */
                               public void setSenderID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSenderIDTracker = true;
                                       } else {
                                          localSenderIDTracker = false;
                                              
                                       }
                                   
                                            this.localSenderID=param;
                                    

                               }
                            

                        /**
                        * field for ReceiverID
                        */

                        
                                    protected java.lang.String localReceiverID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReceiverIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReceiverID(){
                               return localReceiverID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReceiverID
                               */
                               public void setReceiverID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localReceiverIDTracker = true;
                                       } else {
                                          localReceiverIDTracker = false;
                                              
                                       }
                                   
                                            this.localReceiverID=param;
                                    

                               }
                            

                        /**
                        * field for CORERuleVersion
                        */

                        
                                    protected java.lang.String localCORERuleVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCORERuleVersionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCORERuleVersion(){
                               return localCORERuleVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CORERuleVersion
                               */
                               public void setCORERuleVersion(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCORERuleVersionTracker = true;
                                       } else {
                                          localCORERuleVersionTracker = false;
                                              
                                       }
                                   
                                            this.localCORERuleVersion=param;
                                    

                               }
                            

                        /**
                        * field for Payload
                        */

                        
                                    protected java.lang.String localPayload ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayload(){
                               return localPayload;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Payload
                               */
                               public void setPayload(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTracker = true;
                                       } else {
                                          localPayloadTracker = false;
                                              
                                       }
                                   
                                            this.localPayload=param;
                                    

                               }
                            

                        /**
                        * field for ErrorCode
                        */

                        
                                    protected java.lang.String localErrorCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorCodeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getErrorCode(){
                               return localErrorCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorCode
                               */
                               public void setErrorCode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localErrorCodeTracker = true;
                                       } else {
                                          localErrorCodeTracker = false;
                                              
                                       }
                                   
                                            this.localErrorCode=param;
                                    

                               }
                            

                        /**
                        * field for ErrorMessage
                        */

                        
                                    protected java.lang.String localErrorMessage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorMessageTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getErrorMessage(){
                               return localErrorMessage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorMessage
                               */
                               public void setErrorMessage(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localErrorMessageTracker = true;
                                       } else {
                                          localErrorMessageTracker = false;
                                              
                                       }
                                   
                                            this.localErrorMessage=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       COREEnvelopeRealTimeResponse.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":COREEnvelopeRealTimeResponse",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "COREEnvelopeRealTimeResponse",
                           xmlWriter);
                   }

               
                   }
                if (localPayloadTypeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadType", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadType");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadType");
                                    }
                                

                                          if (localPayloadType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProcessingModeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ProcessingMode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ProcessingMode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ProcessingMode");
                                    }
                                

                                          if (localProcessingMode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProcessingMode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadID");
                                    }
                                

                                          if (localPayloadID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTimeStampTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"TimeStamp", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TimeStamp");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TimeStamp");
                                    }
                                

                                          if (localTimeStamp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTimeStamp);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SenderID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SenderID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SenderID");
                                    }
                                

                                          if (localSenderID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReceiverIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ReceiverID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ReceiverID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ReceiverID");
                                    }
                                

                                          if (localReceiverID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReceiverID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCORERuleVersionTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CORERuleVersion", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CORERuleVersion");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CORERuleVersion");
                                    }
                                

                                          if (localCORERuleVersion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCORERuleVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Payload", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Payload");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Payload");
                                    }
                                

                                          if (localPayload==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Payload cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayload);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localErrorCodeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ErrorCode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ErrorCode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ErrorCode");
                                    }
                                

                                          if (localErrorCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ErrorCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localErrorMessageTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ErrorMessage", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ErrorMessage");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ErrorMessage");
                                    }
                                

                                          if (localErrorMessage==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ErrorMessage cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorMessage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localPayloadTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadType"));
                                 
                                        if (localPayloadType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                        }
                                    } if (localProcessingModeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ProcessingMode"));
                                 
                                        if (localProcessingMode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProcessingMode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                        }
                                    } if (localPayloadIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadID"));
                                 
                                        if (localPayloadID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                        }
                                    } if (localTimeStampTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "TimeStamp"));
                                 
                                        if (localTimeStamp != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                        }
                                    } if (localSenderIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "SenderID"));
                                 
                                        if (localSenderID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                        }
                                    } if (localReceiverIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ReceiverID"));
                                 
                                        if (localReceiverID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceiverID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                        }
                                    } if (localCORERuleVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CORERuleVersion"));
                                 
                                        if (localCORERuleVersion != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCORERuleVersion));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                        }
                                    } if (localPayloadTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "Payload"));
                                 
                                        if (localPayload != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayload));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Payload cannot be null!!");
                                        }
                                    } if (localErrorCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ErrorCode"));
                                 
                                        if (localErrorCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ErrorCode cannot be null!!");
                                        }
                                    } if (localErrorMessageTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ErrorMessage"));
                                 
                                        if (localErrorMessage != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorMessage));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ErrorMessage cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static COREEnvelopeRealTimeResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            COREEnvelopeRealTimeResponse object =
                new COREEnvelopeRealTimeResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"COREEnvelopeRealTimeResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (COREEnvelopeRealTimeResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadType").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ProcessingMode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProcessingMode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","TimeStamp").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeStamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","SenderID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ReceiverID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReceiverID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CORERuleVersion").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCORERuleVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","Payload").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayload(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ErrorCode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ErrorMessage").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorMessage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          
        public static class COREEnvelopeBatchSubmissionAckRetrievalResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd",
                "COREEnvelopeBatchSubmissionAckRetrievalResponse",
                "ns1");

            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for PayloadType
                        */

                        
                                    protected java.lang.String localPayloadType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadType(){
                               return localPayloadType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadType
                               */
                               public void setPayloadType(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTypeTracker = true;
                                       } else {
                                          localPayloadTypeTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadType=param;
                                    

                               }
                            

                        /**
                        * field for ProcessingMode
                        */

                        
                                    protected java.lang.String localProcessingMode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProcessingModeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProcessingMode(){
                               return localProcessingMode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProcessingMode
                               */
                               public void setProcessingMode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localProcessingModeTracker = true;
                                       } else {
                                          localProcessingModeTracker = false;
                                              
                                       }
                                   
                                            this.localProcessingMode=param;
                                    

                               }
                            

                        /**
                        * field for PayloadID
                        */

                        
                                    protected java.lang.String localPayloadID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadID(){
                               return localPayloadID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadID
                               */
                               public void setPayloadID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadIDTracker = true;
                                       } else {
                                          localPayloadIDTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadID=param;
                                    

                               }
                            

                        /**
                        * field for PayloadLength
                        */

                        
                                    protected int localPayloadLength ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadLengthTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPayloadLength(){
                               return localPayloadLength;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadLength
                               */
                               public void setPayloadLength(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPayloadLengthTracker = false;
                                              
                                       } else {
                                          localPayloadLengthTracker = true;
                                       }
                                   
                                            this.localPayloadLength=param;
                                    

                               }
                            

                        /**
                        * field for TimeStamp
                        */

                        
                                    protected java.lang.String localTimeStamp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTimeStampTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTimeStamp(){
                               return localTimeStamp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeStamp
                               */
                               public void setTimeStamp(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTimeStampTracker = true;
                                       } else {
                                          localTimeStampTracker = false;
                                              
                                       }
                                   
                                            this.localTimeStamp=param;
                                    

                               }
                            

                        /**
                        * field for SenderID
                        */

                        
                                    protected java.lang.String localSenderID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderID(){
                               return localSenderID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderID
                               */
                               public void setSenderID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSenderIDTracker = true;
                                       } else {
                                          localSenderIDTracker = false;
                                              
                                       }
                                   
                                            this.localSenderID=param;
                                    

                               }
                            

                        /**
                        * field for ReceiverID
                        */

                        
                                    protected java.lang.String localReceiverID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReceiverIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReceiverID(){
                               return localReceiverID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReceiverID
                               */
                               public void setReceiverID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localReceiverIDTracker = true;
                                       } else {
                                          localReceiverIDTracker = false;
                                              
                                       }
                                   
                                            this.localReceiverID=param;
                                    

                               }
                            

                        /**
                        * field for CORERuleVersion
                        */

                        
                                    protected java.lang.String localCORERuleVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCORERuleVersionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCORERuleVersion(){
                               return localCORERuleVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CORERuleVersion
                               */
                               public void setCORERuleVersion(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCORERuleVersionTracker = true;
                                       } else {
                                          localCORERuleVersionTracker = false;
                                              
                                       }
                                   
                                            this.localCORERuleVersion=param;
                                    

                               }
                            

                        /**
                        * field for CheckSum
                        */

                        
                                    protected java.lang.String localCheckSum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCheckSumTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCheckSum(){
                               return localCheckSum;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CheckSum
                               */
                               public void setCheckSum(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCheckSumTracker = true;
                                       } else {
                                          localCheckSumTracker = false;
                                              
                                       }
                                   
                                            this.localCheckSum=param;
                                    

                               }
                            

                        /**
                        * field for Payload
                        */

                        
                                    protected javax.activation.DataHandler localPayload ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getPayload(){
                               return localPayload;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Payload
                               */
                               public void setPayload(javax.activation.DataHandler param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTracker = true;
                                       } else {
                                          localPayloadTracker = false;
                                              
                                       }
                                   
                                            this.localPayload=param;
                                    

                               }
                            

                        /**
                        * field for ErrorCode
                        */

                        
                                    protected java.lang.String localErrorCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorCodeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getErrorCode(){
                               return localErrorCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorCode
                               */
                               public void setErrorCode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localErrorCodeTracker = true;
                                       } else {
                                          localErrorCodeTracker = false;
                                              
                                       }
                                   
                                            this.localErrorCode=param;
                                    

                               }
                            

                        /**
                        * field for ErrorMessage
                        */

                        
                                    protected java.lang.String localErrorMessage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorMessageTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getErrorMessage(){
                               return localErrorMessage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorMessage
                               */
                               public void setErrorMessage(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localErrorMessageTracker = true;
                                       } else {
                                          localErrorMessageTracker = false;
                                              
                                       }
                                   
                                            this.localErrorMessage=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       COREEnvelopeBatchSubmissionAckRetrievalResponse.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":COREEnvelopeBatchSubmissionAckRetrievalResponse",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "COREEnvelopeBatchSubmissionAckRetrievalResponse",
                           xmlWriter);
                   }

               
                   }
                if (localPayloadTypeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadType", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadType");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadType");
                                    }
                                

                                          if (localPayloadType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProcessingModeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ProcessingMode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ProcessingMode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ProcessingMode");
                                    }
                                

                                          if (localProcessingMode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProcessingMode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadID");
                                    }
                                

                                          if (localPayloadID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadLengthTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadLength", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadLength");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadLength");
                                    }
                                
                                               if (localPayloadLength==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PayloadLength cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadLength));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTimeStampTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"TimeStamp", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TimeStamp");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TimeStamp");
                                    }
                                

                                          if (localTimeStamp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTimeStamp);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SenderID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SenderID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SenderID");
                                    }
                                

                                          if (localSenderID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReceiverIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ReceiverID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ReceiverID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ReceiverID");
                                    }
                                

                                          if (localReceiverID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReceiverID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCORERuleVersionTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CORERuleVersion", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CORERuleVersion");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CORERuleVersion");
                                    }
                                

                                          if (localCORERuleVersion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCORERuleVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCheckSumTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CheckSum", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CheckSum");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CheckSum");
                                    }
                                

                                          if (localCheckSum==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CheckSum cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCheckSum);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Payload", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Payload");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Payload");
                                    }
                                
                                        
                                    if (localPayload!=null)
                                    {
                                       xmlWriter.writeDataHandler(localPayload);
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             } if (localErrorCodeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ErrorCode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ErrorCode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ErrorCode");
                                    }
                                

                                          if (localErrorCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ErrorCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localErrorMessageTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ErrorMessage", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ErrorMessage");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ErrorMessage");
                                    }
                                

                                          if (localErrorMessage==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ErrorMessage cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorMessage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localPayloadTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadType"));
                                 
                                        if (localPayloadType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                        }
                                    } if (localProcessingModeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ProcessingMode"));
                                 
                                        if (localProcessingMode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProcessingMode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                        }
                                    } if (localPayloadIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadID"));
                                 
                                        if (localPayloadID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                        }
                                    } if (localPayloadLengthTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadLength"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadLength));
                            } if (localTimeStampTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "TimeStamp"));
                                 
                                        if (localTimeStamp != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                        }
                                    } if (localSenderIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "SenderID"));
                                 
                                        if (localSenderID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                        }
                                    } if (localReceiverIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ReceiverID"));
                                 
                                        if (localReceiverID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceiverID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                        }
                                    } if (localCORERuleVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CORERuleVersion"));
                                 
                                        if (localCORERuleVersion != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCORERuleVersion));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                        }
                                    } if (localCheckSumTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CheckSum"));
                                 
                                        if (localCheckSum != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckSum));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CheckSum cannot be null!!");
                                        }
                                    } if (localPayloadTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                        "Payload"));
                                
                            elementList.add(localPayload);
                        } if (localErrorCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ErrorCode"));
                                 
                                        if (localErrorCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ErrorCode cannot be null!!");
                                        }
                                    } if (localErrorMessageTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ErrorMessage"));
                                 
                                        if (localErrorMessage != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorMessage));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ErrorMessage cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static COREEnvelopeBatchSubmissionAckRetrievalResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            COREEnvelopeBatchSubmissionAckRetrievalResponse object =
                new COREEnvelopeBatchSubmissionAckRetrievalResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"COREEnvelopeBatchSubmissionAckRetrievalResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (COREEnvelopeBatchSubmissionAckRetrievalResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadType").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ProcessingMode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProcessingMode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadLength").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadLength(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPayloadLength(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","TimeStamp").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeStamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","SenderID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ReceiverID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReceiverID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CORERuleVersion").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCORERuleVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CheckSum").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCheckSum(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","Payload").equals(reader.getName())){
                                reader.next();
                                    if (isReaderMTOMAware(reader)
                                            &&
                                            java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_BINARY)))
                                    {
                                        //MTOM aware reader - get the datahandler directly and put it in the object
                                        object.setPayload(
                                                (javax.activation.DataHandler) reader.getProperty(org.apache.axiom.om.OMConstants.DATA_HANDLER));
                                    } else {
                                        if (reader.getEventType() == javax.xml.stream.XMLStreamConstants.START_ELEMENT && reader.getName().equals(new javax.xml.namespace.QName(org.apache.axiom.om.impl.MTOMConstants.XOP_NAMESPACE_URI, org.apache.axiom.om.impl.MTOMConstants.XOP_INCLUDE)))
                                        {
                                            java.lang.String id = org.apache.axiom.om.util.ElementHelper.getContentID(reader, "UTF-8");
                                            object.setPayload(((org.apache.axiom.soap.impl.builder.MTOMStAXSOAPModelBuilder) ((org.apache.axiom.om.impl.llom.OMStAXWrapper) reader).getBuilder()).getDataHandler(id));
                                            reader.next();
                                            
                                                reader.next();
                                            
                                        } else if(reader.hasText()) {
                                            //Do the usual conversion
                                            java.lang.String content = reader.getText();
                                            object.setPayload(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBase64Binary(content));
                                            
                                                reader.next();
                                            
                                        }
                                    }

                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ErrorCode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ErrorMessage").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorMessage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          
        public static class COREEnvelopeBatchSubmission
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd",
                "COREEnvelopeBatchSubmission",
                "ns1");

            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for PayloadType
                        */

                        
                                    protected java.lang.String localPayloadType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadType(){
                               return localPayloadType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadType
                               */
                               public void setPayloadType(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTypeTracker = true;
                                       } else {
                                          localPayloadTypeTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadType=param;
                                    

                               }
                            

                        /**
                        * field for ProcessingMode
                        */

                        
                                    protected java.lang.String localProcessingMode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProcessingModeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProcessingMode(){
                               return localProcessingMode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProcessingMode
                               */
                               public void setProcessingMode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localProcessingModeTracker = true;
                                       } else {
                                          localProcessingModeTracker = false;
                                              
                                       }
                                   
                                            this.localProcessingMode=param;
                                    

                               }
                            

                        /**
                        * field for PayloadID
                        */

                        
                                    protected java.lang.String localPayloadID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadID(){
                               return localPayloadID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadID
                               */
                               public void setPayloadID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadIDTracker = true;
                                       } else {
                                          localPayloadIDTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadID=param;
                                    

                               }
                            

                        /**
                        * field for PayloadLength
                        */

                        
                                    protected int localPayloadLength ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPayloadLength(){
                               return localPayloadLength;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadLength
                               */
                               public void setPayloadLength(int param){
                            
                                            this.localPayloadLength=param;
                                    

                               }
                            

                        /**
                        * field for TimeStamp
                        */

                        
                                    protected java.lang.String localTimeStamp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTimeStampTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTimeStamp(){
                               return localTimeStamp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeStamp
                               */
                               public void setTimeStamp(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTimeStampTracker = true;
                                       } else {
                                          localTimeStampTracker = false;
                                              
                                       }
                                   
                                            this.localTimeStamp=param;
                                    

                               }
                            

                        /**
                        * field for SenderID
                        */

                        
                                    protected java.lang.String localSenderID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderID(){
                               return localSenderID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderID
                               */
                               public void setSenderID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSenderIDTracker = true;
                                       } else {
                                          localSenderIDTracker = false;
                                              
                                       }
                                   
                                            this.localSenderID=param;
                                    

                               }
                            

                        /**
                        * field for ReceiverID
                        */

                        
                                    protected java.lang.String localReceiverID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReceiverIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReceiverID(){
                               return localReceiverID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReceiverID
                               */
                               public void setReceiverID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localReceiverIDTracker = true;
                                       } else {
                                          localReceiverIDTracker = false;
                                              
                                       }
                                   
                                            this.localReceiverID=param;
                                    

                               }
                            

                        /**
                        * field for CORERuleVersion
                        */

                        
                                    protected java.lang.String localCORERuleVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCORERuleVersionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCORERuleVersion(){
                               return localCORERuleVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CORERuleVersion
                               */
                               public void setCORERuleVersion(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCORERuleVersionTracker = true;
                                       } else {
                                          localCORERuleVersionTracker = false;
                                              
                                       }
                                   
                                            this.localCORERuleVersion=param;
                                    

                               }
                            

                        /**
                        * field for CheckSum
                        */

                        
                                    protected java.lang.String localCheckSum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCheckSumTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCheckSum(){
                               return localCheckSum;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CheckSum
                               */
                               public void setCheckSum(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCheckSumTracker = true;
                                       } else {
                                          localCheckSumTracker = false;
                                              
                                       }
                                   
                                            this.localCheckSum=param;
                                    

                               }
                            

                        /**
                        * field for Payload
                        */

                        
                                    protected javax.activation.DataHandler localPayload ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getPayload(){
                               return localPayload;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Payload
                               */
                               public void setPayload(javax.activation.DataHandler param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTracker = true;
                                       } else {
                                          localPayloadTracker = false;
                                              
                                       }
                                   
                                            this.localPayload=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       COREEnvelopeBatchSubmission.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":COREEnvelopeBatchSubmission",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "COREEnvelopeBatchSubmission",
                           xmlWriter);
                   }

               
                   }
                if (localPayloadTypeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadType", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadType");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadType");
                                    }
                                

                                          if (localPayloadType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProcessingModeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ProcessingMode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ProcessingMode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ProcessingMode");
                                    }
                                

                                          if (localProcessingMode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProcessingMode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadID");
                                    }
                                

                                          if (localPayloadID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadLength", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadLength");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadLength");
                                    }
                                
                                               if (localPayloadLength==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PayloadLength cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadLength));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localTimeStampTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"TimeStamp", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TimeStamp");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TimeStamp");
                                    }
                                

                                          if (localTimeStamp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTimeStamp);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SenderID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SenderID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SenderID");
                                    }
                                

                                          if (localSenderID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReceiverIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ReceiverID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ReceiverID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ReceiverID");
                                    }
                                

                                          if (localReceiverID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReceiverID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCORERuleVersionTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CORERuleVersion", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CORERuleVersion");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CORERuleVersion");
                                    }
                                

                                          if (localCORERuleVersion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCORERuleVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCheckSumTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CheckSum", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CheckSum");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CheckSum");
                                    }
                                

                                          if (localCheckSum==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CheckSum cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCheckSum);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Payload", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Payload");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Payload");
                                    }
                                
                                        
                                    if (localPayload!=null)
                                    {
                                       xmlWriter.writeDataHandler(localPayload);
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localPayloadTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadType"));
                                 
                                        if (localPayloadType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                        }
                                    } if (localProcessingModeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ProcessingMode"));
                                 
                                        if (localProcessingMode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProcessingMode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                        }
                                    } if (localPayloadIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadID"));
                                 
                                        if (localPayloadID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadLength"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadLength));
                             if (localTimeStampTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "TimeStamp"));
                                 
                                        if (localTimeStamp != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                        }
                                    } if (localSenderIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "SenderID"));
                                 
                                        if (localSenderID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                        }
                                    } if (localReceiverIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ReceiverID"));
                                 
                                        if (localReceiverID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceiverID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                        }
                                    } if (localCORERuleVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CORERuleVersion"));
                                 
                                        if (localCORERuleVersion != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCORERuleVersion));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                        }
                                    } if (localCheckSumTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CheckSum"));
                                 
                                        if (localCheckSum != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckSum));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CheckSum cannot be null!!");
                                        }
                                    } if (localPayloadTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                        "Payload"));
                                
                            elementList.add(localPayload);
                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static COREEnvelopeBatchSubmission parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            COREEnvelopeBatchSubmission object =
                new COREEnvelopeBatchSubmission();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"COREEnvelopeBatchSubmission".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (COREEnvelopeBatchSubmission)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadType").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ProcessingMode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProcessingMode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadLength").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadLength(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","TimeStamp").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeStamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","SenderID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ReceiverID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReceiverID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CORERuleVersion").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCORERuleVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CheckSum").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCheckSum(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","Payload").equals(reader.getName())){
                                reader.next();
                                    if (isReaderMTOMAware(reader)
                                            &&
                                            java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_BINARY)))
                                    {
                                        //MTOM aware reader - get the datahandler directly and put it in the object
                                        object.setPayload(
                                                (javax.activation.DataHandler) reader.getProperty(org.apache.axiom.om.OMConstants.DATA_HANDLER));
                                    } else {
                                        if (reader.getEventType() == javax.xml.stream.XMLStreamConstants.START_ELEMENT && reader.getName().equals(new javax.xml.namespace.QName(org.apache.axiom.om.impl.MTOMConstants.XOP_NAMESPACE_URI, org.apache.axiom.om.impl.MTOMConstants.XOP_INCLUDE)))
                                        {
                                            java.lang.String id = org.apache.axiom.om.util.ElementHelper.getContentID(reader, "UTF-8");
                                            object.setPayload(((org.apache.axiom.soap.impl.builder.MTOMStAXSOAPModelBuilder) ((org.apache.axiom.om.impl.llom.OMStAXWrapper) reader).getBuilder()).getDataHandler(id));
                                            reader.next();
                                            
                                                reader.next();
                                            
                                        } else if(reader.hasText()) {
                                            //Do the usual conversion
                                            java.lang.String content = reader.getText();
                                            object.setPayload(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBase64Binary(content));
                                            
                                                reader.next();
                                            
                                        }
                                    }

                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          
        public static class COREEnvelopeBatchSubmissionAckRetrievalRequest
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd",
                "COREEnvelopeBatchSubmissionAckRetrievalRequest",
                "ns1");

            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for PayloadType
                        */

                        
                                    protected java.lang.String localPayloadType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadType(){
                               return localPayloadType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadType
                               */
                               public void setPayloadType(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTypeTracker = true;
                                       } else {
                                          localPayloadTypeTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadType=param;
                                    

                               }
                            

                        /**
                        * field for ProcessingMode
                        */

                        
                                    protected java.lang.String localProcessingMode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProcessingModeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProcessingMode(){
                               return localProcessingMode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProcessingMode
                               */
                               public void setProcessingMode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localProcessingModeTracker = true;
                                       } else {
                                          localProcessingModeTracker = false;
                                              
                                       }
                                   
                                            this.localProcessingMode=param;
                                    

                               }
                            

                        /**
                        * field for PayloadID
                        */

                        
                                    protected java.lang.String localPayloadID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadID(){
                               return localPayloadID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadID
                               */
                               public void setPayloadID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadIDTracker = true;
                                       } else {
                                          localPayloadIDTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadID=param;
                                    

                               }
                            

                        /**
                        * field for PayloadLength
                        */

                        
                                    protected int localPayloadLength ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadLengthTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPayloadLength(){
                               return localPayloadLength;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadLength
                               */
                               public void setPayloadLength(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPayloadLengthTracker = false;
                                              
                                       } else {
                                          localPayloadLengthTracker = true;
                                       }
                                   
                                            this.localPayloadLength=param;
                                    

                               }
                            

                        /**
                        * field for TimeStamp
                        */

                        
                                    protected java.lang.String localTimeStamp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTimeStampTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTimeStamp(){
                               return localTimeStamp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeStamp
                               */
                               public void setTimeStamp(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTimeStampTracker = true;
                                       } else {
                                          localTimeStampTracker = false;
                                              
                                       }
                                   
                                            this.localTimeStamp=param;
                                    

                               }
                            

                        /**
                        * field for SenderID
                        */

                        
                                    protected java.lang.String localSenderID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderID(){
                               return localSenderID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderID
                               */
                               public void setSenderID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSenderIDTracker = true;
                                       } else {
                                          localSenderIDTracker = false;
                                              
                                       }
                                   
                                            this.localSenderID=param;
                                    

                               }
                            

                        /**
                        * field for ReceiverID
                        */

                        
                                    protected java.lang.String localReceiverID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReceiverIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReceiverID(){
                               return localReceiverID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReceiverID
                               */
                               public void setReceiverID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localReceiverIDTracker = true;
                                       } else {
                                          localReceiverIDTracker = false;
                                              
                                       }
                                   
                                            this.localReceiverID=param;
                                    

                               }
                            

                        /**
                        * field for CORERuleVersion
                        */

                        
                                    protected java.lang.String localCORERuleVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCORERuleVersionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCORERuleVersion(){
                               return localCORERuleVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CORERuleVersion
                               */
                               public void setCORERuleVersion(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCORERuleVersionTracker = true;
                                       } else {
                                          localCORERuleVersionTracker = false;
                                              
                                       }
                                   
                                            this.localCORERuleVersion=param;
                                    

                               }
                            

                        /**
                        * field for CheckSum
                        */

                        
                                    protected java.lang.String localCheckSum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCheckSumTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCheckSum(){
                               return localCheckSum;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CheckSum
                               */
                               public void setCheckSum(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCheckSumTracker = true;
                                       } else {
                                          localCheckSumTracker = false;
                                              
                                       }
                                   
                                            this.localCheckSum=param;
                                    

                               }
                            

                        /**
                        * field for Payload
                        */

                        
                                    protected javax.activation.DataHandler localPayload ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getPayload(){
                               return localPayload;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Payload
                               */
                               public void setPayload(javax.activation.DataHandler param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTracker = true;
                                       } else {
                                          localPayloadTracker = false;
                                              
                                       }
                                   
                                            this.localPayload=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       COREEnvelopeBatchSubmissionAckRetrievalRequest.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":COREEnvelopeBatchSubmissionAckRetrievalRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "COREEnvelopeBatchSubmissionAckRetrievalRequest",
                           xmlWriter);
                   }

               
                   }
                if (localPayloadTypeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadType", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadType");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadType");
                                    }
                                

                                          if (localPayloadType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProcessingModeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ProcessingMode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ProcessingMode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ProcessingMode");
                                    }
                                

                                          if (localProcessingMode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProcessingMode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadID");
                                    }
                                

                                          if (localPayloadID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadLengthTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadLength", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadLength");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadLength");
                                    }
                                
                                               if (localPayloadLength==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PayloadLength cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadLength));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTimeStampTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"TimeStamp", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TimeStamp");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TimeStamp");
                                    }
                                

                                          if (localTimeStamp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTimeStamp);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SenderID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SenderID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SenderID");
                                    }
                                

                                          if (localSenderID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReceiverIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ReceiverID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ReceiverID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ReceiverID");
                                    }
                                

                                          if (localReceiverID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReceiverID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCORERuleVersionTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CORERuleVersion", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CORERuleVersion");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CORERuleVersion");
                                    }
                                

                                          if (localCORERuleVersion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCORERuleVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCheckSumTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CheckSum", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CheckSum");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CheckSum");
                                    }
                                

                                          if (localCheckSum==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CheckSum cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCheckSum);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Payload", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Payload");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Payload");
                                    }
                                
                                        
                                    if (localPayload!=null)
                                    {
                                       xmlWriter.writeDataHandler(localPayload);
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localPayloadTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadType"));
                                 
                                        if (localPayloadType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                        }
                                    } if (localProcessingModeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ProcessingMode"));
                                 
                                        if (localProcessingMode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProcessingMode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                        }
                                    } if (localPayloadIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadID"));
                                 
                                        if (localPayloadID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                        }
                                    } if (localPayloadLengthTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadLength"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadLength));
                            } if (localTimeStampTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "TimeStamp"));
                                 
                                        if (localTimeStamp != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                        }
                                    } if (localSenderIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "SenderID"));
                                 
                                        if (localSenderID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                        }
                                    } if (localReceiverIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ReceiverID"));
                                 
                                        if (localReceiverID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceiverID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                        }
                                    } if (localCORERuleVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CORERuleVersion"));
                                 
                                        if (localCORERuleVersion != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCORERuleVersion));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                        }
                                    } if (localCheckSumTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CheckSum"));
                                 
                                        if (localCheckSum != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckSum));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CheckSum cannot be null!!");
                                        }
                                    } if (localPayloadTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                        "Payload"));
                                
                            elementList.add(localPayload);
                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static COREEnvelopeBatchSubmissionAckRetrievalRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            COREEnvelopeBatchSubmissionAckRetrievalRequest object =
                new COREEnvelopeBatchSubmissionAckRetrievalRequest();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"COREEnvelopeBatchSubmissionAckRetrievalRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (COREEnvelopeBatchSubmissionAckRetrievalRequest)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadType").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ProcessingMode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProcessingMode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadLength").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadLength(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPayloadLength(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","TimeStamp").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeStamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","SenderID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ReceiverID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReceiverID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CORERuleVersion").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCORERuleVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CheckSum").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCheckSum(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","Payload").equals(reader.getName())){
                                reader.next();
                                    if (isReaderMTOMAware(reader)
                                            &&
                                            java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_BINARY)))
                                    {
                                        //MTOM aware reader - get the datahandler directly and put it in the object
                                        object.setPayload(
                                                (javax.activation.DataHandler) reader.getProperty(org.apache.axiom.om.OMConstants.DATA_HANDLER));
                                    } else {
                                        if (reader.getEventType() == javax.xml.stream.XMLStreamConstants.START_ELEMENT && reader.getName().equals(new javax.xml.namespace.QName(org.apache.axiom.om.impl.MTOMConstants.XOP_NAMESPACE_URI, org.apache.axiom.om.impl.MTOMConstants.XOP_INCLUDE)))
                                        {
                                            java.lang.String id = org.apache.axiom.om.util.ElementHelper.getContentID(reader, "UTF-8");
                                            object.setPayload(((org.apache.axiom.soap.impl.builder.MTOMStAXSOAPModelBuilder) ((org.apache.axiom.om.impl.llom.OMStAXWrapper) reader).getBuilder()).getDataHandler(id));
                                            reader.next();
                                            
                                                reader.next();
                                            
                                        } else if(reader.hasText()) {
                                            //Do the usual conversion
                                            java.lang.String content = reader.getText();
                                            object.setPayload(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBase64Binary(content));
                                            
                                                reader.next();
                                            
                                        }
                                    }

                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          
        public static class COREEnvelopeBatchResultsRetrievalResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd",
                "COREEnvelopeBatchResultsRetrievalResponse",
                "ns1");

            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for PayloadType
                        */

                        
                                    protected java.lang.String localPayloadType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadType(){
                               return localPayloadType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadType
                               */
                               public void setPayloadType(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTypeTracker = true;
                                       } else {
                                          localPayloadTypeTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadType=param;
                                    

                               }
                            

                        /**
                        * field for ProcessingMode
                        */

                        
                                    protected java.lang.String localProcessingMode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProcessingModeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProcessingMode(){
                               return localProcessingMode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProcessingMode
                               */
                               public void setProcessingMode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localProcessingModeTracker = true;
                                       } else {
                                          localProcessingModeTracker = false;
                                              
                                       }
                                   
                                            this.localProcessingMode=param;
                                    

                               }
                            

                        /**
                        * field for PayloadID
                        */

                        
                                    protected java.lang.String localPayloadID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadID(){
                               return localPayloadID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadID
                               */
                               public void setPayloadID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadIDTracker = true;
                                       } else {
                                          localPayloadIDTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadID=param;
                                    

                               }
                            

                        /**
                        * field for PayloadLength
                        */

                        
                                    protected int localPayloadLength ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadLengthTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPayloadLength(){
                               return localPayloadLength;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadLength
                               */
                               public void setPayloadLength(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPayloadLengthTracker = false;
                                              
                                       } else {
                                          localPayloadLengthTracker = true;
                                       }
                                   
                                            this.localPayloadLength=param;
                                    

                               }
                            

                        /**
                        * field for TimeStamp
                        */

                        
                                    protected java.lang.String localTimeStamp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTimeStampTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTimeStamp(){
                               return localTimeStamp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeStamp
                               */
                               public void setTimeStamp(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTimeStampTracker = true;
                                       } else {
                                          localTimeStampTracker = false;
                                              
                                       }
                                   
                                            this.localTimeStamp=param;
                                    

                               }
                            

                        /**
                        * field for SenderID
                        */

                        
                                    protected java.lang.String localSenderID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderID(){
                               return localSenderID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderID
                               */
                               public void setSenderID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSenderIDTracker = true;
                                       } else {
                                          localSenderIDTracker = false;
                                              
                                       }
                                   
                                            this.localSenderID=param;
                                    

                               }
                            

                        /**
                        * field for ReceiverID
                        */

                        
                                    protected java.lang.String localReceiverID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReceiverIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReceiverID(){
                               return localReceiverID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReceiverID
                               */
                               public void setReceiverID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localReceiverIDTracker = true;
                                       } else {
                                          localReceiverIDTracker = false;
                                              
                                       }
                                   
                                            this.localReceiverID=param;
                                    

                               }
                            

                        /**
                        * field for CORERuleVersion
                        */

                        
                                    protected java.lang.String localCORERuleVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCORERuleVersionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCORERuleVersion(){
                               return localCORERuleVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CORERuleVersion
                               */
                               public void setCORERuleVersion(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCORERuleVersionTracker = true;
                                       } else {
                                          localCORERuleVersionTracker = false;
                                              
                                       }
                                   
                                            this.localCORERuleVersion=param;
                                    

                               }
                            

                        /**
                        * field for CheckSum
                        */

                        
                                    protected java.lang.String localCheckSum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCheckSumTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCheckSum(){
                               return localCheckSum;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CheckSum
                               */
                               public void setCheckSum(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCheckSumTracker = true;
                                       } else {
                                          localCheckSumTracker = false;
                                              
                                       }
                                   
                                            this.localCheckSum=param;
                                    

                               }
                            

                        /**
                        * field for Payload
                        */

                        
                                    protected javax.activation.DataHandler localPayload ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getPayload(){
                               return localPayload;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Payload
                               */
                               public void setPayload(javax.activation.DataHandler param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTracker = true;
                                       } else {
                                          localPayloadTracker = false;
                                              
                                       }
                                   
                                            this.localPayload=param;
                                    

                               }
                            

                        /**
                        * field for ErrorCode
                        */

                        
                                    protected java.lang.String localErrorCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorCodeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getErrorCode(){
                               return localErrorCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorCode
                               */
                               public void setErrorCode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localErrorCodeTracker = true;
                                       } else {
                                          localErrorCodeTracker = false;
                                              
                                       }
                                   
                                            this.localErrorCode=param;
                                    

                               }
                            

                        /**
                        * field for ErrorMessage
                        */

                        
                                    protected java.lang.String localErrorMessage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorMessageTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getErrorMessage(){
                               return localErrorMessage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorMessage
                               */
                               public void setErrorMessage(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localErrorMessageTracker = true;
                                       } else {
                                          localErrorMessageTracker = false;
                                              
                                       }
                                   
                                            this.localErrorMessage=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       COREEnvelopeBatchResultsRetrievalResponse.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":COREEnvelopeBatchResultsRetrievalResponse",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "COREEnvelopeBatchResultsRetrievalResponse",
                           xmlWriter);
                   }

               
                   }
                if (localPayloadTypeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadType", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadType");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadType");
                                    }
                                

                                          if (localPayloadType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProcessingModeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ProcessingMode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ProcessingMode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ProcessingMode");
                                    }
                                

                                          if (localProcessingMode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProcessingMode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadID");
                                    }
                                

                                          if (localPayloadID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadLengthTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadLength", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadLength");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadLength");
                                    }
                                
                                               if (localPayloadLength==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PayloadLength cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadLength));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTimeStampTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"TimeStamp", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TimeStamp");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TimeStamp");
                                    }
                                

                                          if (localTimeStamp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTimeStamp);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SenderID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SenderID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SenderID");
                                    }
                                

                                          if (localSenderID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReceiverIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ReceiverID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ReceiverID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ReceiverID");
                                    }
                                

                                          if (localReceiverID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReceiverID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCORERuleVersionTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CORERuleVersion", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CORERuleVersion");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CORERuleVersion");
                                    }
                                

                                          if (localCORERuleVersion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCORERuleVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCheckSumTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CheckSum", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CheckSum");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CheckSum");
                                    }
                                

                                          if (localCheckSum==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CheckSum cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCheckSum);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Payload", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Payload");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Payload");
                                    }
                                
                                        
                                    if (localPayload!=null)
                                    {
                                       xmlWriter.writeDataHandler(localPayload);
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             } if (localErrorCodeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ErrorCode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ErrorCode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ErrorCode");
                                    }
                                

                                          if (localErrorCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ErrorCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localErrorMessageTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ErrorMessage", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ErrorMessage");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ErrorMessage");
                                    }
                                

                                          if (localErrorMessage==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ErrorMessage cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorMessage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localPayloadTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadType"));
                                 
                                        if (localPayloadType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                        }
                                    } if (localProcessingModeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ProcessingMode"));
                                 
                                        if (localProcessingMode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProcessingMode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                        }
                                    } if (localPayloadIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadID"));
                                 
                                        if (localPayloadID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                        }
                                    } if (localPayloadLengthTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadLength"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadLength));
                            } if (localTimeStampTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "TimeStamp"));
                                 
                                        if (localTimeStamp != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                        }
                                    } if (localSenderIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "SenderID"));
                                 
                                        if (localSenderID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                        }
                                    } if (localReceiverIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ReceiverID"));
                                 
                                        if (localReceiverID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceiverID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                        }
                                    } if (localCORERuleVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CORERuleVersion"));
                                 
                                        if (localCORERuleVersion != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCORERuleVersion));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                        }
                                    } if (localCheckSumTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CheckSum"));
                                 
                                        if (localCheckSum != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckSum));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CheckSum cannot be null!!");
                                        }
                                    } if (localPayloadTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                        "Payload"));
                                
                            elementList.add(localPayload);
                        } if (localErrorCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ErrorCode"));
                                 
                                        if (localErrorCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ErrorCode cannot be null!!");
                                        }
                                    } if (localErrorMessageTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ErrorMessage"));
                                 
                                        if (localErrorMessage != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorMessage));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ErrorMessage cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static COREEnvelopeBatchResultsRetrievalResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            COREEnvelopeBatchResultsRetrievalResponse object =
                new COREEnvelopeBatchResultsRetrievalResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"COREEnvelopeBatchResultsRetrievalResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (COREEnvelopeBatchResultsRetrievalResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadType").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ProcessingMode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProcessingMode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadLength").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadLength(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPayloadLength(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","TimeStamp").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeStamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","SenderID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ReceiverID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReceiverID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CORERuleVersion").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCORERuleVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CheckSum").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCheckSum(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","Payload").equals(reader.getName())){
                                reader.next();
                                    if (isReaderMTOMAware(reader)
                                            &&
                                            java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_BINARY)))
                                    {
                                        //MTOM aware reader - get the datahandler directly and put it in the object
                                        object.setPayload(
                                                (javax.activation.DataHandler) reader.getProperty(org.apache.axiom.om.OMConstants.DATA_HANDLER));
                                    } else {
                                        if (reader.getEventType() == javax.xml.stream.XMLStreamConstants.START_ELEMENT && reader.getName().equals(new javax.xml.namespace.QName(org.apache.axiom.om.impl.MTOMConstants.XOP_NAMESPACE_URI, org.apache.axiom.om.impl.MTOMConstants.XOP_INCLUDE)))
                                        {
                                            java.lang.String id = org.apache.axiom.om.util.ElementHelper.getContentID(reader, "UTF-8");
                                            object.setPayload(((org.apache.axiom.soap.impl.builder.MTOMStAXSOAPModelBuilder) ((org.apache.axiom.om.impl.llom.OMStAXWrapper) reader).getBuilder()).getDataHandler(id));
                                            reader.next();
                                            
                                                reader.next();
                                            
                                        } else if(reader.hasText()) {
                                            //Do the usual conversion
                                            java.lang.String content = reader.getText();
                                            object.setPayload(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBase64Binary(content));
                                            
                                                reader.next();
                                            
                                        }
                                    }

                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ErrorCode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ErrorMessage").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorMessage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          
        public static class COREEnvelopeBatchResultsAckSubmissionResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd",
                "COREEnvelopeBatchResultsAckSubmissionResponse",
                "ns1");

            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for PayloadType
                        */

                        
                                    protected java.lang.String localPayloadType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadType(){
                               return localPayloadType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadType
                               */
                               public void setPayloadType(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTypeTracker = true;
                                       } else {
                                          localPayloadTypeTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadType=param;
                                    

                               }
                            

                        /**
                        * field for ProcessingMode
                        */

                        
                                    protected java.lang.String localProcessingMode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProcessingModeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProcessingMode(){
                               return localProcessingMode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProcessingMode
                               */
                               public void setProcessingMode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localProcessingModeTracker = true;
                                       } else {
                                          localProcessingModeTracker = false;
                                              
                                       }
                                   
                                            this.localProcessingMode=param;
                                    

                               }
                            

                        /**
                        * field for PayloadID
                        */

                        
                                    protected java.lang.String localPayloadID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPayloadID(){
                               return localPayloadID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadID
                               */
                               public void setPayloadID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadIDTracker = true;
                                       } else {
                                          localPayloadIDTracker = false;
                                              
                                       }
                                   
                                            this.localPayloadID=param;
                                    

                               }
                            

                        /**
                        * field for PayloadLength
                        */

                        
                                    protected int localPayloadLength ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadLengthTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPayloadLength(){
                               return localPayloadLength;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayloadLength
                               */
                               public void setPayloadLength(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPayloadLengthTracker = false;
                                              
                                       } else {
                                          localPayloadLengthTracker = true;
                                       }
                                   
                                            this.localPayloadLength=param;
                                    

                               }
                            

                        /**
                        * field for TimeStamp
                        */

                        
                                    protected java.lang.String localTimeStamp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTimeStampTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTimeStamp(){
                               return localTimeStamp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeStamp
                               */
                               public void setTimeStamp(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTimeStampTracker = true;
                                       } else {
                                          localTimeStampTracker = false;
                                              
                                       }
                                   
                                            this.localTimeStamp=param;
                                    

                               }
                            

                        /**
                        * field for SenderID
                        */

                        
                                    protected java.lang.String localSenderID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderID(){
                               return localSenderID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderID
                               */
                               public void setSenderID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSenderIDTracker = true;
                                       } else {
                                          localSenderIDTracker = false;
                                              
                                       }
                                   
                                            this.localSenderID=param;
                                    

                               }
                            

                        /**
                        * field for ReceiverID
                        */

                        
                                    protected java.lang.String localReceiverID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReceiverIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReceiverID(){
                               return localReceiverID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReceiverID
                               */
                               public void setReceiverID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localReceiverIDTracker = true;
                                       } else {
                                          localReceiverIDTracker = false;
                                              
                                       }
                                   
                                            this.localReceiverID=param;
                                    

                               }
                            

                        /**
                        * field for CORERuleVersion
                        */

                        
                                    protected java.lang.String localCORERuleVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCORERuleVersionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCORERuleVersion(){
                               return localCORERuleVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CORERuleVersion
                               */
                               public void setCORERuleVersion(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCORERuleVersionTracker = true;
                                       } else {
                                          localCORERuleVersionTracker = false;
                                              
                                       }
                                   
                                            this.localCORERuleVersion=param;
                                    

                               }
                            

                        /**
                        * field for CheckSum
                        */

                        
                                    protected java.lang.String localCheckSum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCheckSumTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCheckSum(){
                               return localCheckSum;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CheckSum
                               */
                               public void setCheckSum(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCheckSumTracker = true;
                                       } else {
                                          localCheckSumTracker = false;
                                              
                                       }
                                   
                                            this.localCheckSum=param;
                                    

                               }
                            

                        /**
                        * field for Payload
                        */

                        
                                    protected javax.activation.DataHandler localPayload ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayloadTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getPayload(){
                               return localPayload;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Payload
                               */
                               public void setPayload(javax.activation.DataHandler param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPayloadTracker = true;
                                       } else {
                                          localPayloadTracker = false;
                                              
                                       }
                                   
                                            this.localPayload=param;
                                    

                               }
                            

                        /**
                        * field for ErrorCode
                        */

                        
                                    protected java.lang.String localErrorCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorCodeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getErrorCode(){
                               return localErrorCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorCode
                               */
                               public void setErrorCode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localErrorCodeTracker = true;
                                       } else {
                                          localErrorCodeTracker = false;
                                              
                                       }
                                   
                                            this.localErrorCode=param;
                                    

                               }
                            

                        /**
                        * field for ErrorMessage
                        */

                        
                                    protected java.lang.String localErrorMessage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorMessageTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getErrorMessage(){
                               return localErrorMessage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorMessage
                               */
                               public void setErrorMessage(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localErrorMessageTracker = true;
                                       } else {
                                          localErrorMessageTracker = false;
                                              
                                       }
                                   
                                            this.localErrorMessage=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       COREEnvelopeBatchResultsAckSubmissionResponse.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.caqh.org/SOAP/WSDL/CORERule2.2.0.xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":COREEnvelopeBatchResultsAckSubmissionResponse",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "COREEnvelopeBatchResultsAckSubmissionResponse",
                           xmlWriter);
                   }

               
                   }
                if (localPayloadTypeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadType", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadType");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadType");
                                    }
                                

                                          if (localPayloadType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProcessingModeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ProcessingMode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ProcessingMode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ProcessingMode");
                                    }
                                

                                          if (localProcessingMode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProcessingMode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadID");
                                    }
                                

                                          if (localPayloadID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPayloadID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadLengthTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PayloadLength", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PayloadLength");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PayloadLength");
                                    }
                                
                                               if (localPayloadLength==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PayloadLength cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadLength));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTimeStampTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"TimeStamp", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TimeStamp");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TimeStamp");
                                    }
                                

                                          if (localTimeStamp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTimeStamp);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SenderID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SenderID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SenderID");
                                    }
                                

                                          if (localSenderID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReceiverIDTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ReceiverID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ReceiverID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ReceiverID");
                                    }
                                

                                          if (localReceiverID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReceiverID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCORERuleVersionTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CORERuleVersion", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CORERuleVersion");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CORERuleVersion");
                                    }
                                

                                          if (localCORERuleVersion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCORERuleVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCheckSumTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CheckSum", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CheckSum");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CheckSum");
                                    }
                                

                                          if (localCheckSum==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CheckSum cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCheckSum);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPayloadTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Payload", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Payload");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Payload");
                                    }
                                
                                        
                                    if (localPayload!=null)
                                    {
                                       xmlWriter.writeDataHandler(localPayload);
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             } if (localErrorCodeTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ErrorCode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ErrorCode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ErrorCode");
                                    }
                                

                                          if (localErrorCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ErrorCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localErrorMessageTracker){
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ErrorMessage", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ErrorMessage");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ErrorMessage");
                                    }
                                

                                          if (localErrorMessage==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ErrorMessage cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorMessage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localPayloadTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadType"));
                                 
                                        if (localPayloadType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadType cannot be null!!");
                                        }
                                    } if (localProcessingModeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ProcessingMode"));
                                 
                                        if (localProcessingMode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProcessingMode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ProcessingMode cannot be null!!");
                                        }
                                    } if (localPayloadIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadID"));
                                 
                                        if (localPayloadID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PayloadID cannot be null!!");
                                        }
                                    } if (localPayloadLengthTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "PayloadLength"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPayloadLength));
                            } if (localTimeStampTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "TimeStamp"));
                                 
                                        if (localTimeStamp != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                        }
                                    } if (localSenderIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "SenderID"));
                                 
                                        if (localSenderID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderID cannot be null!!");
                                        }
                                    } if (localReceiverIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ReceiverID"));
                                 
                                        if (localReceiverID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceiverID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReceiverID cannot be null!!");
                                        }
                                    } if (localCORERuleVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CORERuleVersion"));
                                 
                                        if (localCORERuleVersion != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCORERuleVersion));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CORERuleVersion cannot be null!!");
                                        }
                                    } if (localCheckSumTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "CheckSum"));
                                 
                                        if (localCheckSum != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckSum));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CheckSum cannot be null!!");
                                        }
                                    } if (localPayloadTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                        "Payload"));
                                
                            elementList.add(localPayload);
                        } if (localErrorCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ErrorCode"));
                                 
                                        if (localErrorCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ErrorCode cannot be null!!");
                                        }
                                    } if (localErrorMessageTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "ErrorMessage"));
                                 
                                        if (localErrorMessage != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorMessage));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ErrorMessage cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static COREEnvelopeBatchResultsAckSubmissionResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            COREEnvelopeBatchResultsAckSubmissionResponse object =
                new COREEnvelopeBatchResultsAckSubmissionResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"COREEnvelopeBatchResultsAckSubmissionResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (COREEnvelopeBatchResultsAckSubmissionResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadType").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ProcessingMode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProcessingMode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PayloadLength").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPayloadLength(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPayloadLength(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","TimeStamp").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeStamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","SenderID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ReceiverID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReceiverID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CORERuleVersion").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCORERuleVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CheckSum").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCheckSum(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","Payload").equals(reader.getName())){
                                reader.next();
                                    if (isReaderMTOMAware(reader)
                                            &&
                                            java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_BINARY)))
                                    {
                                        //MTOM aware reader - get the datahandler directly and put it in the object
                                        object.setPayload(
                                                (javax.activation.DataHandler) reader.getProperty(org.apache.axiom.om.OMConstants.DATA_HANDLER));
                                    } else {
                                        if (reader.getEventType() == javax.xml.stream.XMLStreamConstants.START_ELEMENT && reader.getName().equals(new javax.xml.namespace.QName(org.apache.axiom.om.impl.MTOMConstants.XOP_NAMESPACE_URI, org.apache.axiom.om.impl.MTOMConstants.XOP_INCLUDE)))
                                        {
                                            java.lang.String id = org.apache.axiom.om.util.ElementHelper.getContentID(reader, "UTF-8");
                                            object.setPayload(((org.apache.axiom.soap.impl.builder.MTOMStAXSOAPModelBuilder) ((org.apache.axiom.om.impl.llom.OMStAXWrapper) reader).getBuilder()).getDataHandler(id));
                                            reader.next();
                                            
                                                reader.next();
                                            
                                        } else if(reader.hasText()) {
                                            //Do the usual conversion
                                            java.lang.String content = reader.getText();
                                            object.setPayload(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBase64Binary(content));
                                            
                                                reader.next();
                                            
                                        }
                                    }

                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ErrorCode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ErrorMessage").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorMessage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          
            private  org.apache.axiom.om.OMElement  toOM(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmission param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmission.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmission param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmission.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmission param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmission.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmission param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmission.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            
                                                            
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalRequest param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmission.class.equals(type)){
                
                           return org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmission.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse.class.equals(type)){
                
                           return org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmission.class.equals(type)){
                
                           return org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmission.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse.class.equals(type)){
                
                           return org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalRequest.class.equals(type)){
                
                           return org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse.class.equals(type)){
                
                           return org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeRequest.class.equals(type)){
                
                           return org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeResponse.class.equals(type)){
                
                           return org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmission.class.equals(type)){
                
                           return org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmission.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse.class.equals(type)){
                
                           return org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalRequest.class.equals(type)){
                
                           return org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalResponse.class.equals(type)){
                
                           return org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalRequest.class.equals(type)){
                
                           return org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse.class.equals(type)){
                
                           return org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmission.class.equals(type)){
                
                           return org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmission.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse.class.equals(type)){
                
                           return org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   