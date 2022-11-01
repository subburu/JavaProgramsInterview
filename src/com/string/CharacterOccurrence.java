package com.string;

public class CharacterOccurrence {
	
	public static void main (String args[])
	{
	
		CharOccurrence("Sravan Kumar",'K');
	CharOccurrence("Sravan Kumar",'a');
	
	}
	
	public static void CharOccurrence(String S,char val)
	{
		int count =0;
		char arr[]=S.toCharArray();
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]==val)
			{
				count++;
			}
		}
		System.out.println("Occurence of  "+val+ " "+ count);
		}
	}

