package com.psp.operators;

public class AssignmentOperator {

public static void main(String[] args) {

		// TODO Auto-generated method stub
				int a = 40;
				int b = 30;
				int c = 0;
				
				c = a + b;
				System.out.println( "c = " + c);
				
				c  += a;
				System.out.println( "+a = " + c);
				
				c  -= a;
				System.out.println( "-a = " + c);
				
				c  *= a;
				System.out.println( "*a = " + c);
				
				a = 20;
				b = 25;
				c  /= a;
				System.out.println( "/a = " + c);
								
				c  %= a;
				System.out.println( "%a = " + c);
				

	}

}

