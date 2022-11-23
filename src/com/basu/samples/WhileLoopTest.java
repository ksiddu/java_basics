package com.basu.samples;

public class WhileLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Start Naveen");
		// way 1
		int[] array1 = { 10, 20, 30, 40, 50}; // declare and initialization
		//array1[0] = 10	
		//array1[1] = 20
		//array1[2] = 30
		//array1[3] = 40
		//array1[4] = 50
				
		// while loop
		System.out.println("======== Using while loop ===========");

		System.out.println("Array size: " + array1.length);
		
		// initialization
		// while(condition){
		//  System.out.println();
		//  increment/decrement
		// }
		int i = 0; //initialization
				
		while(i < array1.length) { //condition // start of while
			System.out.println(array1[i]);
			i = i + 1; // increment/decrement
		} // end of while
		
		System.out.println("End Naveen");
		
		


	} // end of main method


}// end of class WhileLoopTest

//IDE: Eclipse
	// How java program runs
	//1. The program Test.java complies into .class files : javac Test.java
	// Test.class
	//2. Then Test.class files in to bytecode/binary form : 
	//3. Java.exe(JVM) runs : java Test
	
	//i++ ==> i = i + 1
	// i = i + 2;
