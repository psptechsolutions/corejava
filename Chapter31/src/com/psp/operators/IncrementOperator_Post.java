package com.psp.operators;

public class IncrementOperator_Post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Post increment
		
		int a = 5;
		int b = 7;
		
		//Here a value will get utilized then will get incremented
		int c = a ++ + b;
		System.out.println("Value of c = "+c);
		//this would be added as 5+7 =12
		
		System.out.println("Value of a = " +a);//this would get incremented by 1
		

	}

}
