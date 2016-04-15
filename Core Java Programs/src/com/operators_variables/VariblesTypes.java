package com.operators_variables;

public class VariblesTypes {

	// static variable
	static int x;

	// instace variable
	int d;

	public void sum() {
		// local variable
		int a = 12;
		int b = 23;

		System.out.println(a + b);
	}

	public static void main(String[] args) {
		VariblesTypes.x = 10;
		System.out.println("X==>  " + VariblesTypes.x);

		VariblesTypes v = new VariblesTypes();
		v.d = 23;

		System.out.println("D ==> " + v.d);

	}

}
