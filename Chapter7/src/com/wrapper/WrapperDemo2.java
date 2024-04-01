package com.wrapper;

public class WrapperDemo2 {

	public static void main(String[] args) {
		int a=10;
		Integer p = new Integer(a);
		System.out.println("int p value :"+p); //Boxing
		
		String b="120";
		Integer s = new Integer(b);
		System.out.println("String s value :"+s); //Boxing
	}

}
