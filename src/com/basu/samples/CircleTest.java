package com.basu.samples;

public class CircleTest {

	
	public static float pi = 3.142f;
	public int radius;
	
	// parameterised constructor
	CircleTest(int x){
		radius = x;
	}
	
	public static void printMessage() {
		System.out.println("Hi you are within static method");
	
	}
	
	public float area() {
		return pi * radius * radius;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		CircleTest c1 = new CircleTest(5);
		c1.radius = 10;
		System.out.println(c1.radius);
		System.out.println(c1.area());
		
		CircleTest c2 = new CircleTest(6);
		System.out.println(c2.radius);
		System.out.println(c2.area());
		*/
		
		// how static can be accessed/used
		// ClassName.variableName
		System.out.println(CircleTest.pi);
		
		// ClassName.methodName()
		CircleTest.printMessage();
		
		
		
		
	}

}
