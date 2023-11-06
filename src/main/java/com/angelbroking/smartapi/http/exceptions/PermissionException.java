package com.angelbroking.smartapi.http.exceptions;

/**
 * Represents permission denied exceptions for certain calls.
 * Default code is 403
 */
public class PermissionException extends SmartAPIException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PermissionException(String message, String code){
        super(message, code);
    }
}
