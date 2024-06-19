package com.customExceptions;

public class StringTestClass 
{

	public static void main(String[] args)
	{
		
		try
		{
			StringOperations.getCharacterFromString("Welcome to JP", 15);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.err.println(e.getMessage());
		}
		
	}

}
