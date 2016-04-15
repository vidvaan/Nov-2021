package com.methods;

public class Sir_Methods {

	public void display() {
		System.out.println("Vidvaan Technologies");
	}
	public void add(int a ,int b) {
		System.out.println("Addition is :"+(a+b));
	}
	public void add1() {
		int c=10;
		int d=27;
		System.out.println("Addtion1 is :"+(c+d));
	}

	public static void main(String[] args) {
		Sir_Methods method = new Sir_Methods();
		method.display();
		method.add(12, 5);
		method.add1();
	}
}
