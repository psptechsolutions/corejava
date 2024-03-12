package com.psp.array;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10,20,30,40,50,60,70 };
		for (int i : a) {
			System.out.println("i= "+ i);
		}
		a[1]=105;
		System.out.println("My array First Index= "+ a[1]);

}
}