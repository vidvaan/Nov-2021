package com.krishnafirstprogram;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num 1 == ");
		int num1=sc.nextInt();
		System.out.println("Enter Num 2 == ");
		float num2=sc.nextFloat();
		float add=num1+num2;
		System.out.println("Add :"+add);
		float sub=num1-num2;
		System.out.println("Sub :"+sub);
		float mul=num1*num2;
		System.out.println("Mul :"+mul);
		float div=num1/num2;
		System.out.println("Div :"+div);
		float mod=num1%num2;
		System.out.println("Mod :"+mod);
	}

}
