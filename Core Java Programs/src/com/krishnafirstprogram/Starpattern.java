package com.krishnafirstprogram;

public class Starpattern {
	public static void main(String[] args) {

		int i, j, k, l, m, n;
		for (i = 1; i <= 8; i++) {
			for (j = 1; j <= 8 - i; j++) {
				System.out.print(" ");

			}

			for (k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
				

	}

}
