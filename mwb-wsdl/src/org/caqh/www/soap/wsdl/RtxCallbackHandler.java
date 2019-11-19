
/**
 * RtxCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */

    package org.caqh.www.soap.wsdl;

    /**
     *  RtxCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class RtxCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public RtxCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public RtxCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for GenericBatchReceiptConfirmationTransaction method
            * override this method for handling normal response from GenericBatchReceiptConfirmationTransaction operation
            */
           public void receiveResultGenericBatchReceiptConfirmationTransaction(
                    org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GenericBatchReceiptConfirmationTransaction operation
           */
            public void receiveErrorGenericBatchReceiptConfirmationTransaction(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for BatchSubmitTransaction method
            * override this method for handling normal response from BatchSubmitTransaction operation
            */
           public void receiveResultBatchSubmitTransaction(
                    org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from BatchSubmitTransaction operation
           */
            public void receiveErrorBatchSubmitTransaction(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for BatchResultsRetrievalTransaction method
            * override this method for handling normal response from BatchResultsRetrievalTransaction operation
            */
           public void receiveResultBatchResultsRetrievalTransaction(
                    org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from BatchResultsRetrievalTransaction operation
           */
            public void receiveErrorBatchResultsRetrievalTransaction(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for RealTimeTransaction method
            * override this method for handling normal response from RealTimeTransaction operation
            */
           public void receiveResultRealTimeTransaction(
                    org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeRealTimeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RealTimeTransaction operation
           */
            public void receiveErrorRealTimeTransaction(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for BatchResultsAckSubmitTransaction method
            * override this method for handling normal response from BatchResultsAckSubmitTransaction operation
            */
           public void receiveResultBatchResultsAckSubmitTransaction(
                    org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsAckSubmissionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from BatchResultsAckSubmitTransaction operation
           */
            public void receiveErrorBatchResultsAckSubmitTransaction(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for BatchSubmitAckRetrievalTransaction method
            * override this method for handling normal response from BatchSubmitAckRetrievalTransaction operation
            */
           public void receiveResultBatchSubmitAckRetrievalTransaction(
                    org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionAckRetrievalResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from BatchSubmitAckRetrievalTransaction operation
           */
            public void receiveErrorBatchSubmitAckRetrievalTransaction(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GenericBatchRetrievalTransaction method
            * override this method for handling normal response from GenericBatchRetrievalTransaction operation
            */
           public void receiveResultGenericBatchRetrievalTransaction(
                    org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchResultsRetrievalResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GenericBatchRetrievalTransaction operation
           */
            public void receiveErrorGenericBatchRetrievalTransaction(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GenericBatchSubmissionTransaction method
            * override this method for handling normal response from GenericBatchSubmissionTransaction operation
            */
           public void receiveResultGenericBatchSubmissionTransaction(
                    org.caqh.www.soap.wsdl.RtxStub.COREEnvelopeBatchSubmissionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GenericBatchSubmissionTransaction operation
           */
            public void receiveErrorGenericBatchSubmissionTransaction(java.lang.Exception e) {
            }
                


    }
    