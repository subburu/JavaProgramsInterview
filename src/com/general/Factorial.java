package com.general;

public class Factorial {
	/**
	 * factorial is a number that multiples by every number below it e.g 3 3*2*1=6
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		factorial(3);
		factorial(5);
	}

	public static void factorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
