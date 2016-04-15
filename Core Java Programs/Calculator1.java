package com.krishnafirstprogram;

import java.util.Scanner;

public class Calculator1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1  : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2  : ");
		float num2 = sc.nextFloat();
		System.out.println("Enter num3  : ");
		long num3 = sc.nextLong();
		float add = num1 + num2 + num3;
		System.out.println("addition  : " + add);
		float sub = num1 - num2 - num3;
		System.out.println("Subtraction  : " + sub);
		float mul = num1 * num2 * num3;
		System.out.println("Multiplication  :" + mul);
	}
}
