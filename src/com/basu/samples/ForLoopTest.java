package com.basu.samples;

public class ForLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// way 1
		int[] array1 = { 10, 20, 30, 40, 50}; // declare and initialization
		//array1[0] = 10	
		//array1[1] = 20
		//array1[2] = 30
		//array1[3] = 40
		//array1[4] = 50
				
		// for loop
		System.out.println("======== Using for loop===========");

		System.out.println("Array size: " + array1.length);

		// for(initialization;condition;increment/decrement){}
		for (int i = 0; i < array1.length; i++) {

			System.out.println(array1[i]);
		
		}
		//java.lang.ArrayIndexOutOfBoundsException:
		//System.out.println(array1[5]);
		System.out.println("Hi Naveen");
		System.out.println("Hi Siddu");

	}
	
	// IDE: Eclipse
	// How java program runs
	//1. The program Test.java complies into .class files : javac Test.java
	// Test.class
	//2. Then Test.class files in to bytecode/binary form : 
	//3. Java.exe(JVM) runs : java Test

}
