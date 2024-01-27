package com.psp.operators;

public class IncrementOperator_Pre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pre increment
		
				int a = 5;
				int b = 7;
				
				//Here a value will get utilized after increment
				int c = ++a + b;
				System.out.println("Value of c = "+c);
				//this would be added as 6+7 =13
				
				System.out.println("Value of a = " +a);//this would get incremented by 1
	}

}
