package com.basics_20;

public class Factorial {
	/*
	 * Recursive function -- A function calling by itself is called recursive
	 * 
	 * 
	 * 
	 * 
	 */	
	public static void main(String[] args) {
		
	   int num=5;
	   fact(5);
	   fact(1);
	   fact(0);
	}

	public static void fact(int num)
	{
		int fact=1;
		  
		
		   for (int i=num;i>0;i--)
		   {
			   fact=fact*i;
		   }
		   System.out.println(fact);
	}
}
