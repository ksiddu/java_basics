package com.basu.samples;

public class Example {

	int a = 10; // variable   

	void call(Example eg1) { // method parameter : object eg1 = objecy eg , both points to same address
		eg1.a = eg1.a + 10;  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example eg = new Example();
		
		System.out.println("Before call-by-reference: " + eg.a); // 10

		eg.a = 40; // 40
		
		System.out.println("Before call-by-reference: " + eg.a); // 40
		
		// passing the object as a value using pass-by-reference
		eg.call(eg); // method argument
		// eg1 = eg; // same address
		
		System.out.println("After call-by-reference: " + eg.a); // 50
	

	}

}
