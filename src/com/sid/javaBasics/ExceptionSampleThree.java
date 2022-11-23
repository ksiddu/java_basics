package com.sid.javaBasics;

public class ExceptionSampleThree {

	// The Java throw keyword is used to explicitly throw a single exception.
	public static void divideByZero() {

		// throw an exception
		throw new ArithmeticException("Trying to divide by 0");
	}

	public static void main(String[] args) {
		try {
			divideByZero();
		} catch (Exception e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}
	}

}
