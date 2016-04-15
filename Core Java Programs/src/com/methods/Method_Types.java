package com.methods;

public class Method_Types {

	// *Instance Method. These are Four Types.* //

	// without Return Type and Parameters Respectively.....

	public void method1() {
		int a = 12;
		int b = 55;
		System.out.println("Sum1  : " + (a + b));
	}
	// without Return Type and with Parameters......

	public void method2(int a, int b) {
		System.out.println("sum2  : " + (a = b));
	}
	// with Return Type and without Parameters

	public int method3() {
		int a = 10;
		int b = 20;
		return (a + b);
	}
	// with Return Type and Parameters Respectively.....

	public int method4(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {
		Method_Types MT = new Method_Types();
		MT.method1();
		MT.method2(23, 45);
		int method3 = MT.method3();
		System.out.println("Sum3  : " + method3);
		int method4 = MT.method4(22, 24);
		System.out.println("Sum4  : " + method4);

	}
}
