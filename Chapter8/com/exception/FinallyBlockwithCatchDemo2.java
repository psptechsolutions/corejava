package com.exception;

public class FinallyBlockwithCatchDemo2 {

	public static void main(String[] args) {
		int a[] = new int[2];
		System.out.println("Before Try");
		try {
			// The below statement would throw ArrayIndexoutofBoundsException
			System.out.println("Access Invalid data =" + a[3]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Exception =" + ae);
		}
		finally {
			System.out.println("\n finally is always Executed");
		}
	}

}
