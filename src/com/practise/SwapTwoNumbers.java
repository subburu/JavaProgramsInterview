package com.practise;

public class SwapTwoNumbers {

  //https://www.youtube.com/playlist?list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa"

	public static void UsingThirdVariable(int x, int y)
	{
		System.out.println("Before Swapping  "+ x +  " "+ y);
		int temp = x;
		x= y;
		y=temp;
		System.out.println("After Swapping  "+ x +  " "+ y);
		
	}

	public static void UsingAddSub(int x,int y)
	{
		
		  System.out.println("Before Swapping  "+ x +  " "+ y);
		  x=x+y; 
		  y=x-y; 
		  x=x-y;
		  System.out.println("After Swapping  "+ x +  " "+ y);
	}
	
	public static void SingleLine(int x,int y)
	{
		
		  System.out.println("Before Swapping  "+ x +  " "+ y);
		 y=x+y-(x=y);
		  System.out.println("After Swapping  "+ x +  " "+ y);
	}
	
	public static void UsingMultipleDivison(int x,int y)
	{
		
		  System.out.println("Before Swapping  "+ x +  " "+ y);
		  x=x*y; 
		  y=x/y; 
		  x=x/y;
		  System.out.println("After Swapping  "+ x +  " "+ y);
	}

	public static void main (String args[])
	{
	  UsingThirdVariable(10,-50);
	  UsingAddSub(20,-10);
	  UsingAddSub(0,0);
	  UsingMultipleDivison(400,200);
	  SingleLine(50,60);
	  
	}
}
