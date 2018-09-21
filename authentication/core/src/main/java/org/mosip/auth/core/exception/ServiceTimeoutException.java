package org.mosip.auth.core.exception;

import org.mosip.auth.core.constant.IdAuthenticationErrorConstants;

/**
 * The Class ServiceTimeoutException.
 *
 * @author Manoj SP
 */
public class ServiceTimeoutException extends IdAuthenticationBusinessException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7081182057556155171L;
	
	/**
	 * Instantiates a new service timeout exception.
	 */
	public ServiceTimeoutException() {
		super();
	}

	/**
	 * Instantiates a new service timeout exception.
	 *
	 * @param exceptionConstant the exception constant
	 */
	public ServiceTimeoutException(IdAuthenticationErrorConstants exceptionConstant) {
		super(exceptionConstant);
	}

	/**
	 * Instantiates a new service timeout exception.
	 *
	 * @param exceptionConstant the exception constant
	 * @param rootCause the root cause
	 */
	public ServiceTimeoutException(IdAuthenticationErrorConstants exceptionConstant, Throwable rootCause) {
		super(exceptionConstant, rootCause);
	}

}
