package com.rogreis.cursomc.services.exceptions;

public class DataIntegrityException extends RuntimeException{
	private static final long serialVersionUID = 9137097353927458893L;
	
	public DataIntegrityException(String msg) {
		super(msg);
	}

	public DataIntegrityException(String msg, Throwable cause) {
		super(msg, cause);
	}

	
}
