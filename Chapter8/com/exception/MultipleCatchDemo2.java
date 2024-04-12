package com.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

class MultipleCatchDemo2 {

	public static void main(String[] args) {
	try(FileReader fr = new FileReader(new File("abc.txt"))){
		DriverManager.getConnection("url","uname","pwd");
	}
	catch (IOException | SQLException ie) {
		System.out.println("Catch 1");
	}

	}

}
