package com.exception;

public class ThrowsDemo {
	public static void check() throws ArithmeticException {
		int a = 10, b = 0, c = 0;

		if (b == 0) {
			System.out.println("Division by Zero is not possible");
			throw new ArithmeticException("Demo");
		}
		c = a / b;
		System.out.println("Division =" + c);
	}

	public static void main(String[] args) {
		System.out.println("first line in Main ()");
		try {
			check();
		} catch (ArithmeticException exc) {
			System.out.println("Catch Block : Division by zero" + exc);
		}
		System.out.println("After Exception is Handled");
	}
}
