package com.psp.operators;

public class DecrementOperatorPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Post Decrement
		
				int a = 5;
				int b = 7;
				
				//Here a value will get utilized then will get Decrement
				int c = a -- - b;
				System.out.println("Value of c = "+c);
				//this would be subtracted as 5-7 =-2
				
				System.out.println("Value of a = " +a);//this would get Decrement by 1
	}

}
