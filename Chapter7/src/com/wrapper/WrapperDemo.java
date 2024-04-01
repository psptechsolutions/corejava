package com.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		int a=10;
		Integer p = new Integer(a);  //Boxing using Constructor
		Integer q = Integer.valueOf(a);  //Boxing using valueOf
		
		System.out.println("int q value :"+p); 
		
		String b="120";
		Integer s = new Integer(b);  //Boxing using Constructor
		Integer s1 = Integer.valueOf(b); //Boxing using valueOf
		System.out.println("String s1 value :"+s1); 
	}

}
