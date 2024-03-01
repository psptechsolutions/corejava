package com.psp.variable;

import java.util.Scanner;

public class ReadDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Read first number
		System.out.println("Enter first Number = ");
		int i = sc.nextInt();
		// Read second number
		System.out.println("Enter second Number = ");
		int j = sc.nextInt();
		// print result
		int sum = i + j;
		System.out.println("Sum of given two Numbers = " + sum);

		sc.close();

	}

}
