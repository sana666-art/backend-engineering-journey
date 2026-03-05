package com.vinncorp.demo.soapcoursemanagement.soap.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CLIENT)
public class CourseNotFindException extends RuntimeException {

    private static final long serialVersionUID = 3518170101751491969L;

    public CourseNotFindException(String message) {
        super(message);
    }
}
