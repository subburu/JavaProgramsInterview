package com.practise;

public class ReverseString {
	
	public static void main (String args[])
	{
		
	//	reverStringCharAt("Sravan Kumar");
		reverseCharArray("Sravan Kumar");
	}

	
	public static void reverStringCharAt(String str)
	{
		System.out.println("Using CharAt");
		
     String rev="";//empty
	for (int i=str.length()-1;i>=0;i--)
	{
		
	rev=rev+str.charAt(i);
	
	}
	
	System.out.println("Revers of a string " + rev);
	
	}
	
	
	public static void reverseCharArray(String str)
	{
		System.out.println("Using Char Array");
		String rev="";
		char a[]=str.toCharArray();
		for (int i=a.length-1;i>=0;i--)	
			
		{
			
			 rev=rev+a[i];
		}
		System.out.println("Revers of a string " + rev);
	}
	
	}

