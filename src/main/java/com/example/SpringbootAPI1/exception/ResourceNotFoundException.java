package com.example.SpringbootAPI1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    // we creating these class because if data or resource not present int database. which it throw
    // exception or message to client.


    private String resourcename;
    private String fieldname;
    private Object fieldvalue;

    public ResourceNotFoundException(String resourcename,String fieldname,Object fieldvalue) {
        //super(String.format("%s not found with %s :'%s'",resourcename,fieldname,fieldvalue));
        this.resourcename = resourcename;
        this.fieldname = fieldname;
        this.fieldvalue = fieldvalue;
    }
    public String getResourcename() {
        return resourcename;
    }
    public String getFieldname() {
        return fieldname;
    }
    public Object getFieldvalue() {
        return fieldvalue;
    }
}
