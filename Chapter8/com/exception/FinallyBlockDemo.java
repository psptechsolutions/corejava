package com.exception;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		int a[] = new int[2];
		System.out.println("Before Try");
		try {
			// The below statement would throw ArrayIndexoutofBoundsException
			System.out.println("Access Invalid data =" + a[3]);
		}
		finally {
			System.out.println("\n finally is always Executed");
		}
	}

}
