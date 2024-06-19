package com.customExceptions;


public class InSuffientFundsException extends Exception
{

	private static final long serialVersionUID = 1786L;
	
	public InSuffientFundsException(String exceptionName)
	{
		super(exceptionName);
	}
	
}
