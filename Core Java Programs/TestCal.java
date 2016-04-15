package com.krishnafirstprogram;

public class TestCal {
	
	public static void main(String[] args) {

		Calculator4 calculator4 = new Calculator4();
		
		//Calculator4.sum1();
		
		 Calculator4.sum1();
		 calculator4.sum2(20, 30);
		 int sum1=calculator4.sum3();
		int sum2 = calculator4.sum4(23, 45);
		System.out.println("Sum ==>  " + sum1);
		System.out.println("Sum ==>  " + sum2);
	}

} 
