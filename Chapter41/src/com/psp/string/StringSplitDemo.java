package com.psp.string;

public class StringSplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "JavaXYZisXYZObjectXYZOrientedXYZProgramming";
		String str2 = "XYZ";
		String s3[] = str1.split("XYZ");

		for (String str : s3)
			System.out.println("s3 = " + str);
	}

}
