package com.arrays;

import java.util.Arrays;

public class Anagram {
	
	
	public static void main(String[] args) {
		
		
		String s1="Army";
		String s2="mary";
		boolean status=true;
		
	char[]a=	s1.toCharArray();
	char[]b=s2.toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);
if (	Arrays.equals(a, b))
{
	System.out.println("Given Strings are  Anagram");
}
else
{
	System.out.println("Given Strings are not Anagram");
}
	
}
}