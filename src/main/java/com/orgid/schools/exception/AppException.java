/**
 * 
 */
package com.orgid.schools.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Jawahar Dath Thangirala
 * Sep 9, 2019
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class AppException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = -7732798920848780497L;

	public AppException(String message) {
        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }
}