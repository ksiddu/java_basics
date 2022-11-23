package com.sid.javaBasics;

public class ExceptionSampleTwo {

	// try block without catch block
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int divideByZero = 5 / 0;
			System.out.println("Rest of code in try block");
		} finally {
			System.out.println("Finally block is always executed");
		}

	}

}
