package com.exception;

public class ThrowDemo {

	public static void main(String[] args) {
		System.out.println("first line in Main ()");
		int a =10, b=0, c = 0;
		try {
			if (b == 0) {
				ArithmeticException ae = new ArithmeticException("Division by Zero is not possible");
				throw ae;
			}
			c = a / b;
			System.out.println("Division =" + c);
		} catch (ArithmeticException exc) {
			System.out.println("Catch Block : Division by zero");
		}
		System.out.println("After Exception is Handled");
	}
}
