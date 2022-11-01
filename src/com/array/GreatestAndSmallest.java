package com.array;

public class GreatestAndSmallest {
	
	public static void main(String[] args) {
		int array []= {50,30,40,20,60,100,10,101,1};
		maxNumber(array);
		minNumber(array);
		}
		public static void maxNumber(int a[])
		{
		int max=a[0];
		for (int i=1;i<a.length;i++)
		{
		if(a[i]>max)
		{
		max=a[i]; 
		}
		}
		System.out.println(max +" maximum value ");
		}
		public static void minNumber(int a[])
		{
		int min=a[0];
		for (int i=1;i<a.length;i++)
		{
		if(a[i]<min)
		{
		min=a[i];
		}
		}
		System.out.println(min +" minimum value ");
		}
		}
	
	


