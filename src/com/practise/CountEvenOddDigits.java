package com.practise;

public class CountEvenOddDigits {
	
	public static void main (String args[])
	{
		System.out.println("Count Even and Odd digits in given number");
		int num =234567910;
		int oddcount=0; 
		int evencount=0;
		
		while (num>0)
		{
			int rem=num%10;
			
			if (rem%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num=num/10;
		}
		
		System.out.println("count of even numbers  " +evencount);
		System.out.println("count of odd numbers  " +oddcount);
		
		
}
}