package com.angelbroking.smartapi.http.exceptions;

/**
 * Represents user input errors such as missing and invalid parameters.
 * Default code is 400.
 */
public class InputException extends SmartAPIException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// initialize and call base exception constructor
    public InputException(String message, String code){
        super(message, code);
    }
}

