package com.general;

public class FibonacciSeries {
	/**
	 * fibonacci series means sum of the two preceding numbers e.g 0+1=1,1+2=3; 2+3
	 * =5 ; 3+5=8; 5+8=13 ; 8+13=21 ;13+21=34
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, sum = 0;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < 11; i++) {
			sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;
		}
	}
}
