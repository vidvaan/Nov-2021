package com.methods;

public class Static_Methods {
	// *Static Method. These are Four Types.* //

	// without Return Type and Parameters Respectively.....

	public static void method1() {
		int a = 12;
		int b = 55;
		System.out.println("Sum1  : " + (a + b));
	}
	// without Return Type and with Parameters......

	public static void method2(int a, int b) {
		System.out.println("sum2  : " + (a = b));
	}
	// with Return Type and without Parameters

	public static int method3() {
		int a = 10;
		int b = 20;
		return (a + b);
	}
	// with Return Type and Parameters Respectively.....

	public static int method4(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {

		Static_Methods.method1();
		Static_Methods.method2(23, 45);
		int method3 = Static_Methods.method3();
		System.out.println("Sum3  : " + method3);
		int method4 = Static_Methods.method4(22, 24);
		System.out.println("Sum4  : " + method4);

	}
}