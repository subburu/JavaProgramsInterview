package com.array;



public class DuplicateElementForLoop {

	public static void main (String args[])
	
	{
		
		
		System.out.println("****For Loop*****");
		int arr [] = {2,3,4,5,6,2,3,4,7,9,6};
	
		
		for (int i=0;i<arr.length;i++)
		{
			int count=0;
			
			for (int j=i;j<arr.length;j++)
			{  
			
				if (arr[i]==(arr[j]))
				{
					count++;
				}
				
			}
			if (count==2)
			{
				System.out.println(arr[i]+" duplicate elements");
			}
		}
		
		
	}
	
}
