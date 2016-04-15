package com.krishnafirstprogram;

public class Star_Pattern {
	public static void main(String[] args) {
		int i, k;

		// Pattern model 1
		for (i = 5; i >= 1; i--) {

			for (k = 1; k <= i; k++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		for (i = 1; i <= 5; i++) {

			for (k = 1; k <= i; k++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		
		
		
		
	}

}

