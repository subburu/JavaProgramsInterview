package com.general;

public class PalindromeNumber {
	public static void main(String[] args) {
		checkPalindrome(121);
		checkPalindrome(132);
		checkPalindrome(151);
	}

	public static void checkPalindrome(int num) {
		int originalnum = num;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (originalnum == rev) {
			System.out.println(originalnum + " " + " is a palindrome");
		} else {
			System.out.println(originalnum + " " + " is not a palindrome");
		}
	}
}