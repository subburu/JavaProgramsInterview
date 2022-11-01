package com.array;

public class MissingNumber {

	public static void main(String[] args) {
		

		int a[]= {1,2,3,4,6,7,8,5,10};
		int n=10;
		int expectedsum=n * (n+1)/2;

		int sum1=0;
        int sum2=0;

        for (int i=0;i<a.length;i++)

        {

        	sum1=sum1+a[i];

        }

        for (int i=1;i<=10;i++)

        {

        	sum2=sum2+i;

        }
        
        System.out.println(expectedsum-sum1+" is missage number -- -----");

        System.out.println(sum1+ " sum1");

        System.out.println(sum2+ " sum2");

        System.out.println("missing number is =" +(sum2-sum1));
}
}