package com.basics_20;

public class DuplicateElements {
	
	public static void main (String args[])
	{
		String str="Subburu Sravan Kumar";
		String str1=str.replaceAll("\\s","");
		
	   char a[]=	str1.toCharArray();
	  
	   for (int i=0;i<=a.length-1;i++)
	   {   
		   int count=0;
		   for (int j=i;j<=a.length-1;j++)
		   {
			   if ( a[i]==a[j])
			   {
				   count++;
			   }
			  
		   }
		   if (count==2)
		   {
			   System.out.println(a[i]+" is a duplicate");
		   }
		   
	   }
	  
	   
	}

}
