package com.practise;

public class CheckPalindromeNumber {
	
	public static void main (String args[])
	{
	
	
		Palindrome(121);
		Palindrome(1212);
	}

	public static void Palindrome(int num)
	{
		int acutalnum=num;
		
	   int rev=0;
	   System.out.println("Check Palindrome");
	
	while (num>0)
	{
		rev=rev*10+num%10;
		num=num/10;
		
	}
	
	if (acutalnum==rev)	
	{
		System.out.println("Given number is a palindrom " + acutalnum);
	}
		
	else 
	{
		System.out.println("Given number is not a palindrome "+  acutalnum);
	}
	}
}
