package com.basu.samples;

public class PolymorphismOneTest {

	// compile time polymorphism --> function overloading - single class
	// run time polymorphism --> function overriding - inheritance concept
	
	// it takes 2 arguments
	public int sum(int a, int b) {
		return a + b;
	}
	
	// it takes 3 arguments
	public int sum(int a, int b, int c) {
		return a + b;
	}
	
	public float sum(int a, int b, int c, float d) {
		return (float)a + b + c + d;
	}
	
	
	public float sum(float a, float b, float c) {
		return a + b + c;
	}
	
	
	
	// order of parameters
	// no of parameters
	// datatype of parameters
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismOneTest obj1 = new PolymorphismOneTest();
		
		// function overloading
		System.out.println(obj1.sum(1,2));
		
		// function overloading
		System.out.println(obj1.sum(1,2, 3));
		

	}

}

// Test.java(program)(javac) -- compile --> Test.class (bytecode--b
// Test.class/Test(java.exe) --> Program output

// 10000033 if , int , long , for loop, while, if else
