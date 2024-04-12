package com.exception;

import java.io.*;

public class TryWithResourseDemo {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("d:\\myfile.txt"))) {
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println("str =" + str);
			}
		} catch (IOException ie) {
			System.out.println("IOException =" + ie);
		}

	}
}
