package com.customExceptions;

public class StringOperations 
{
	
	public static char getCharacterFromString(String text, int value)throws StringIndexOutOfBoundsException
	{
		char charValue;
		
		if(!(value < 0 || value >= text.length()))
		{
			charValue = text.charAt(value);
		}
		else
		{
			throw new StringIndexOutOfBoundsException("character not found in a given string...!");
		}
		
		return charValue;
		
	}
}
