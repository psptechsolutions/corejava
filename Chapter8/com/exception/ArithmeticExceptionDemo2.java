package com.exception;

public class ArithmeticExceptionDemo2 {

	public static void main(String[] args) {
		try 
		{
		int i = 10;
		int j = 0;
		int c = i/j;
		System.out.println("The line will not be Executed");
		}
		catch(ArithmeticException exc)
		{
			System.out.println("Catch Block : Division by zero");
		}		
		System.out.println("After Exception is Handled");
		}
	}

