package com.general;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 20;
		System.out.println("5 is prime number" + checkPrime(5));
		getPrimeNumbers();
	}

	public static boolean checkPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void getPrimeNumbers() {
		for (int i = 2; i <= 20; i++) {
			if (checkPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
}