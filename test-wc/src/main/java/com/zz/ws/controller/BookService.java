
package com.zz.ws.controller;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BookService", targetNamespace = "http://controller.ws.zz.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookService {


    /**
     * 
     * @param userName
     * @return
     *     returns java.util.List<com.zz.ws.controller.Book>
     */
    @WebMethod
    @WebResult(name = "returnVal", targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://controller.ws.zz.com/", className = "com.zz.ws.controller.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://controller.ws.zz.com/", className = "com.zz.ws.controller.SayHelloResponse")
    @Action(input = "http://controller.ws.zz.com/BookService/sayHelloRequest", output = "http://controller.ws.zz.com/BookService/sayHelloResponse")
    public List<Book> sayHello(
        @WebParam(name = "userName", targetNamespace = "")
        String userName);

}
