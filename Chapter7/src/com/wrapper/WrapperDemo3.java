package com.wrapper;

public class WrapperDemo3 {

	public static void main(String[] args) {
		
		int a=120;
		
		Integer i1 = Integer.valueOf(a);  //Boxing using valueOf
		int v1 = i1.intValue();			  //UnBoxing using int value
		byte b1 = i1.byteValue();			  //UnBoxing using int value
		
		System.out.println("int v1 value :"+v1); 
		System.out.println("byte b1 value :"+b1);
		
		String s="76120";
		int v3 = Integer.parseInt(s);			  //UnBoxing using int value
		
		System.out.println("String s value :"+v3); 
	}

}
