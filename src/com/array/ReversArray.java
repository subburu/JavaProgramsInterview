package com.array;

public class ReversArray {

	public static void main (String args[])
	{
		int arr [] = {1,2,3,4,5,9,8,6};
		int k=arr.length;
		
		for (int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[k-1];
			arr[k-1]=temp;
			k--;
			
		}
		System.out.println(arr[k]);
		
	}
	
}
