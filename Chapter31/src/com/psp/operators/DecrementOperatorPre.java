package com.psp.operators;

public class DecrementOperatorPre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pre Decrement
		
		int a = 5;
		int b = 7;
		
		//Here a value will get utilized after Decrement
		int c = --a - b;
		System.out.println("Value of c = "+c);
		//this would be decrement as 4-7 = -3
		
		System.out.println("Value of a = " +a);//this would get Decrement by 1
	}

}
