package org.abb_tech.lesson9.exception;

import org.abb_tech.lesson9.enums.ErrorCodeEnum;

public class NameNullException extends RuntimeException{
    private final String message;
    private final ErrorCodeEnum errorCode;

    public NameNullException(String message,ErrorCodeEnum errorCode,Throwable cause){
        super(cause);
        this.message = message;
        this.errorCode = errorCode;
    }

    public String getErrorMessage(){
        return message;
    }

    public ErrorCodeEnum getErrorEnum(){
        return errorCode;
    }
}
