package com.sid.javaBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionSampleFourth {

	// URL : https://www.programiz.com/java-programming/exception-handling
	// Similarly, the throws keyword is used to declare the type of exceptions
	// that might occur within the method. It is used in the method declaration
	// declaring the type of exception
	public static void findFile() throws IOException {

		// code that may generate IOException
		File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
	}

	public static void main(String[] args) {
		try {
			findFile();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
