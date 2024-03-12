package com.psp.string;

public class StringReplaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java Programming ";
		System.out.println("Str  = " + str);
		System.out.println(" Replaced with ");
		String replace = str.replace("Programming ", "world");
		System.out.println("Str  = " + replace);
	}

}
