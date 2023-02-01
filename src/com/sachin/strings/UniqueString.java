package com.sachin.strings;

public class UniqueString {
	
	// Note int j=0;
	
	public static void main (String args[])
	{
		String str = "beautiful beachbua";
		str=str.replace("\s", ""); // Removes white space
	  char [] arr=str.toCharArray();
	  for (int i=0;i<arr.length;i++)
	  {
		  int count=0;
		   for (int j=0;j<arr.length;j++)
		   {
			   if (arr[i]==arr[j])
			   {
				   count++;
				   
			   }
		   }
		  if (count==1)
		  {
			  System.out.println(arr[i]+" is a unqiue string");
		  }
	  }
	  
		
		
	}

}
