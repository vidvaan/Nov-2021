package com.krishnafirstprogram;

public class Sweeping_of_two_numbers_without_thirdvariable {
	public static void main(String[] args) {
		int a=29,b=33;
		//befor sweeping
		System.out.println(a+"=a Befor Sweeping   b="+b);
		
		//after sweeping
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+"=a After Sweeping   b="+b);
		
	}

}
