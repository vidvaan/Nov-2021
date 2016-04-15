package com.operators_variables;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Operators_in_methods {
	public int ADD(int a, int b) {
		System.out.println("Addition : " + (a + b));
		return (a + b);

	}

	public float MUL() {
		float a = 2.4f, b = 6.9f;
		System.out.println("Multiplication : " + (a * b));
		return (a * b);
	}

	public long SUB() {
		long a = 3667, b = 865354;
		System.out.println("Subtraction : " + (a - b));
		return (a - b);

	}

	public void MOD() {
		int a = 66, b = 5;
		System.out.println("Modulodivision : " + (a % b));

	}

	public void DIV() {
		int a = 56, b = 4;
		System.out.println("Division : " + (a / b));
	}

	public static void main(String[] args) {
		System.out.println("Arithmetic Operators :   ");

		Operators_in_methods M = new Operators_in_methods();
		M.ADD(10, 20);
		M.MUL();
		M.SUB();
		M.MOD();
		M.DIV();
	}
}
