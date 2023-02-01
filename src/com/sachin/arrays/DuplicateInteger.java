package com.sachin.arrays;

public class DuplicateInteger {
	
	// Note : int j=i; 
	
	public static void main (String args[])
	{
		int [] arr ={2,4,2,5,2,5,6,7,5,7,2};
		
		
		for (int i=0;i<arr.length;i++)
		{		
			int count=0;
			for (int j=i;j<arr.length;j++ )
			{
				if (arr[i]==arr[j])
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(arr[i]+ " is a duplicate");
			}
			
		}
		
		
		
	}

}
