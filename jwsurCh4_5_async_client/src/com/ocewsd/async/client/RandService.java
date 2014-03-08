
package com.ocewsd.async.client;

import java.util.List;
import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RandService", targetNamespace = "http://ocewsd.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RandService {


    /**
     * 
     * @param arg0
     * @return
     *     returns javax.xml.ws.Response<com.ocewsd.async.client.NextNResponse>
     */
    @WebMethod(operationName = "nextN")
    @RequestWrapper(localName = "nextN", targetNamespace = "http://ocewsd.com/", className = "com.ocewsd.async.client.NextN")
    @ResponseWrapper(localName = "nextNResponse", targetNamespace = "http://ocewsd.com/", className = "com.ocewsd.async.client.NextNResponse")
    public Response<NextNResponse> nextNAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "nextN")
    @RequestWrapper(localName = "nextN", targetNamespace = "http://ocewsd.com/", className = "com.ocewsd.async.client.NextN")
    @ResponseWrapper(localName = "nextNResponse", targetNamespace = "http://ocewsd.com/", className = "com.ocewsd.async.client.NextNResponse")
    public Future<?> nextNAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<NextNResponse> asyncHandler);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "nextN", targetNamespace = "http://ocewsd.com/", className = "com.ocewsd.async.client.NextN")
    @ResponseWrapper(localName = "nextNResponse", targetNamespace = "http://ocewsd.com/", className = "com.ocewsd.async.client.NextNResponse")
    @Action(input = "http://ocewsd.com/RandService/nextNRequest", output = "http://ocewsd.com/RandService/nextNResponse")
    public List<Integer> nextN(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns javax.xml.ws.Response<com.ocewsd.async.client.Next1Response>
     */
    @WebMethod(operationName = "next1")
    @RequestWrapper(localName = "next1", targetNamespace = "http://ocewsd.com/", className = "com.ocewsd.async.client.Next1")
    @ResponseWrapper(localName = "next1Response", targetNamespace = "http://ocewsd.com/", className = "com.ocewsd.async.client.Next1Response")
    public Response<Next1Response> next1Async();

    /**
     * 
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "next1")
    @RequestWrapper(localName = "next1", targetNamespace = "http://ocewsd.com/", className = "com.ocewsd.async.client.Next1")
    @ResponseWrapper(localName = "next1Response", targetNamespace = "http://ocewsd.com/", className = "com.ocewsd.async.client.Next1Response")
    public Future<?> next1Async(
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<Next1Response> asyncHandler);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "next1", targetNamespace = "http://ocewsd.com/", className = "com.ocewsd.async.client.Next1")
    @ResponseWrapper(localName = "next1Response", targetNamespace = "http://ocewsd.com/", className = "com.ocewsd.async.client.Next1Response")
    @Action(input = "http://ocewsd.com/RandService/next1Request", output = "http://ocewsd.com/RandService/next1Response")
    public int next1();

}
