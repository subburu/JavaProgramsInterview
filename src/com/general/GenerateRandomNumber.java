package com.general;

import java.util.Random;

public class GenerateRandomNumber {
	public static void main(String[] args) {
// Approach -1
		Random rand = new Random();
		int random = rand.nextInt(10000);// 0 to 9
		System.out.println(random);
		double random1 = rand.nextDouble();// range 0.0 to less than 1.0
		System.out.println(random1);
		System.out.println(Math.random());
	}
}
