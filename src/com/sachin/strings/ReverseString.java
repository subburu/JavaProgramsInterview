package com.sachin.strings;

public class ReverseString {

	// Using empty string and appending

	
	public static void main(String[] args) {
	
	   String str= "Madam";
	   str.equalsIgnoreCase(str);
	   char [] arr=str.toCharArray();
	    System.out.println(str+" actual string");
	  String reverse="";
	   for (int i=0;i<arr.length;i++)
	   {
		   reverse=reverse+arr[i];
	   }
		System.out.println(reverse+" reverse String");
		

	}

}
