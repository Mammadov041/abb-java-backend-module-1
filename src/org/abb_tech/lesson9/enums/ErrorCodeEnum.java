package org.abb_tech.lesson9.enums;

public enum ErrorCodeEnum {
    NAME_NULL("001 Error"),NAME_EMPTY("002 Error"),NAME_TOO_LONG("003 Error");
    private final String errorCode;
    ErrorCodeEnum(String errorCode){
        this.errorCode = errorCode;
    }

    public String getErrorCode(){
        return  errorCode;
    }
}
