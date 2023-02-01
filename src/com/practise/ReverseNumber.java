package com.practise;

public class ReverseNumber {

		public static void main (String args [])
		{
			int number =354;
			UsingStringBuffer(354);
			UsingStringBuffer(1234);
			UsingStringBuilder(12345);
			// Using String buffer 
			UsingWhile(123456);
			
		}
		
		public static void UsingWhile(int num)
		{
		System.out.println("Using whileloop");
		int rev=0;
		while(	num !=0)
		{
			
			rev=rev*10+num %10;
			num=num/10;
		}
			System.out.println(rev);
			System.out.println(25%5+" % gives remainder");  
			System.out.println(25/5 +" / gives Quotient");
		}

		public static void UsingStringBuffer(int num)
		{
			
		System.out.println("Using String Buffer");	
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();		
		System.out.println(rev);
	
		}
		
		public static void UsingStringBuilder(int num)
		{
			
		System.out.println("Using String Builder");	
		StringBuilder sb=new StringBuilder();
		sb.append(num);
	    StringBuilder rev=	sb.reverse();
		System.out.println(rev);
			
		}
}
