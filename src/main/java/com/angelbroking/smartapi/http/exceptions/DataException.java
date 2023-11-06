package com.angelbroking.smartapi.http.exceptions;

/**
 * Exceptions raised when invalid data is returned from Smart API trade.
 */

@SuppressWarnings("serial")
public class DataException extends SmartAPIException {

    // initialize 2fa exception and call constructor of Base Exception
    public DataException(String message, String code){
        super(message, code);
    }
}

