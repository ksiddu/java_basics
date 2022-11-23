package com.basu.samples;

public class StaticTest {

	// Class name always starts with upper case letter
	// If there are more than one word in the class name
	// each word should start with upper case letter
	public static int a = 5; // a is a static variable
	public int b = 10; // b is a non static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// obj1 creation
		StaticTest obj1 = new StaticTest();
		System.out.println(obj1.a);
		System.out.println(obj1.b);

		// obj2 creation
		StaticTest obj2 = new StaticTest();
		System.out.println(obj2.a);
		System.out.println(obj2.b);

		obj1.a = 20; // static variable value change
		System.out.println(obj1.a);
		
		obj1.b = 30;
		System.out.println(obj2.b);

	}

}

// area of circle
// pi = 3.142
// radius
// Class Circek
