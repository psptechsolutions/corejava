package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AgeException extends Exception {
	AgeException(String msg) {
		super(msg);
	}
}

public class UserDefinedException {

	public static void main(String[] args) throws IOException, AgeException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Age :");
		int age = Integer.parseInt(br.readLine());
		if (age < 18) {
			AgeException ae = new AgeException("Sorry you have to wait " + (18 - age) + " Years");
			throw ae;
		} else
			System.out.println("Eligible for voting");

	}
}
