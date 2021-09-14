package com.bridgelabz.indianstatescensusanalyser.main;

public class StateCensusDataException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ExceptionType type;

	public StateCensusDataException(String message, ExceptionType type) {
		super(message);
		this.type = type;
	}

}
