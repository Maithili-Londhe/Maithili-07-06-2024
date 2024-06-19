package com.customExceptions;

public class BankTestClass {

	public static void main(String[] args) 
	{		
		
		try
		{
			BankOperations.withdrawAmount(40000.45);
		}
		catch(InSuffientFundsException e)
		{
			System.err.println(e.getMessage());
		}
		
	}

}
