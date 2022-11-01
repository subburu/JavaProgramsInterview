package com.string;

public class CharacterOccurrence2 {
	
	public static void main (String args[])
	{
	
		CharOccurrence("Automation testing",'t');
	
	
	}
	
	public static void CharOccurrence(String S,char val)
	{
		 int count =0;
		
		for (int i=0;i<S.length();i++)
		{
			if (S.charAt(i)==val)
			{
				count++;
			}
		}
		System.out.println("Occurence of  "+val+ " "+ count);
		}
	}

