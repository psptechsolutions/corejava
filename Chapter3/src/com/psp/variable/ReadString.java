package com.psp.variable;

import java.util.Scanner;

public class ReadString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Read first number
		System.out.println("Enter first Name = ");
		String fname = sc.next();
		// Read second number
		System.out.println("Enter Last Name = ");
		String lname = sc.next();
		// print result
		String name = fname + lname;
		System.out.println("FullName = " + name);

		sc.close();

	}

}
