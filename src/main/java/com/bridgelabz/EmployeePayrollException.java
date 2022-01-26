package com.bridgelabz;

public class EmployeePayrollException extends Exception {
	enum ExceptionType {
		CONNECTION_FAIL, CANNOT_RETRIEVE_DATA, CANNOT_EXECUTE_QUERY, UPDATE_FAILED
	}

	ExceptionType exceptionType;

	public EmployeePayrollException(String message, ExceptionType exceptionType) {
		super(message);
		this.exceptionType = exceptionType;
	}

}
