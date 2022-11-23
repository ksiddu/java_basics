package com.sid.javaBasics;

public class ExceptionSampleOne {

	// try - catch block with finally
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int divideByZero = 5 / 0;
			System.out.println("Rest of code in try block");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ArithmeticException => " + e.getMessage());
		} finally {
			System.out.println("Finally block is always executed");
		}

	}

}
