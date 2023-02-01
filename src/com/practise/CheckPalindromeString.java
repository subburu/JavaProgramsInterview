package com.practise;

public class CheckPalindromeString {
	
	public static void main (String args[])
	{
		checkPalindrome("Sravan Kumar");
		checkPalindrome("madam");
		checkPalindrome("121");
	}
	
	public static void checkPalindrome(String str)
	{
	String originalString =str;	
	char[]	a= str.toCharArray();
	String rev="";
	
	for (int i=a.length-1;i>=0;i--)
	{
		rev=rev+a[i];
		
	}
		if (originalString.equals(rev))
		{
			System.out.println(originalString+ " is a palindrom");
		}
		else 
		{
			System.out.println(originalString+ "is not a palindrome");
		}
	
	}

}
