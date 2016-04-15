package com.methods;

import java.util.Scanner;

public class Using_Methods_Scanner {

	// Method.

	public void sum1(int a, int b) {
		System.out.println("Add : " + (a + b));
	}

	public float sum2() {
		float a = 5.6f;
		float b = 4.5f;
		System.out.println("Add : " + (a + b));
		return a + b;

	}

	public static void main(String[] args) {

		// Object creation for Method revoke.

		Using_Methods_Scanner obj = new Using_Methods_Scanner();

		obj.sum1(24, 12);
		obj.sum2();

		// Scanner Tool.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num1 : ");
		float num1 = sc.nextFloat();

		System.out.println("Enter num2 : ");
		float num2 = sc.nextFloat();

		// Subtraction
		float sub = num1 - num2;
		System.out.println("Sub : " + sub);

		// Addition
		float Add = num1 + num2;
		System.out.println("Add : " + Add);

		// Multipication
		float Mul = num1 * num2;
		System.out.println("Multiplication : " + Mul);

		// Division
		float Div = num1 / num2;
		System.out.println("Division : " + Div);

		// Modulous
		float Mod = num1 % num2;
		System.out.println("Modulous : " + Mod);

	}

}
