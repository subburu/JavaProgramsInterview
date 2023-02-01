package com.practise;

public class SumOfDigits {
	
	public static void main (String args[])
	{
		System.out.println("Sum of the digits");
		sumOfDigits(125);
		sumOfDigits(20);
	}

	
	public static void sumOfDigits(int num)
	{
		int sum=0;
		while (num!=0)
		{
			sum=sum+num%10; // 5  //2 // 1  //2  remainder
			num=num/10;  //12 // 10 // 1 quotient
		}
		System.out.println("sum of the digits is  "+sum);

	}
	
} 

