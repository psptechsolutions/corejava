package com.wrapper;

public class WrapperDemo4 {

	public static void main(String[] args) {
		Integer a,b;
		a = new Integer(20); //manual Boxing
		a = 10; //auto Boxing
		b = 30; //auto Boxing
		
		int c = a.intValue() + b.intValue();  //manual unBoxing
		int d = a+b;//auto unBoxing
		System.out.println(" c value :"+c); 
		System.out.println(" d value :"+d); 

	}

}
