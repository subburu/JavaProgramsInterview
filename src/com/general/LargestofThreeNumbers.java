package com.general;

public class LargestofThreeNumbers {
	public static void main(String[] args) {
		TernaryOperator(30, 10, 30);
		largest(41, 41, 41);

	}

	public static void largest(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println(a + " A is largest number");
		} else if (b > a && b > c) {
			System.out.println(b + " B is largest number");
		} else if (c > a && c > b) {
			System.out.println(c + " Cis largest numeber");
		} else if (a == b && a == c && b == c) {
			System.out.print("more than one number is greater");
		} else if (a == b | a == c | b == c) {
			System.out.print("more than one number is greater");
		}
	}

	public static void TernaryOperator(int a, int b, int c) {

		int largest1 = a > b ? a : b;

		int largest2 = largest1 > c ? largest1 : c;
		System.out.println(largest2 + " is the largest using Ternary Operator");
	}
}