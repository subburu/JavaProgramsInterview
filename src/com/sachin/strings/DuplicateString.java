package com.sachin.strings;

public class DuplicateString {
	
	// Note : int j=i; 
	
	// Note : str=str.replaceAll("\\s+", "");  // to remove spaces btw strings
	
    public static void main (String args [])
    {
    	String str = "beautiful beach bua";
    
    	str=str.replaceAll("\\s+", "");  // to remove spaces btw strings
    	
    	char [] arr =str.toCharArray();
    	
    	 for (int i=0;i<arr.length;i++)
    	 {
    		 int count=0;
    		 
    		 for (int j=i;j<arr.length;j++)
    		 {
    			 
    			 if (arr[i]==arr[j])
    			 {
    				 count++;
    			 }
    		 }
    		 
    		 if (count==2)
    		 {
    			 System.out.println(arr[i]+" is duplicate character");
    		 }
    	 }
    	
    }


}
