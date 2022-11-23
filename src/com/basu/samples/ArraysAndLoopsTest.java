package com.basu.samples;

public class ArraysAndLoopsTest {

	public static void main(String[] args) {
		
		// Variables Details
		
		// way 1
		int a = 20; // declare and initialization => storing the value of a
		
		// way 2
		int b; // variable declaration
		b = 40; // variable initialization
		
		System.out.println("value of a: "+ a); // accessing/retrieving/fetching the value of a
		
		System.out.println("value of b: "+ b); // accessing/retrieving/fetching the value of b
		
		// sum of 2 numbers: used way 2 concept
		int result;//declare
		int c = 1;
		int d = 2;
		result = c + d; //initialization
		
		//float per;
		
		//int[] marks = {80, 60, 35, 45, 60, 70};
		
		//per = marks[0] + marks[1] + marks[2]
		
		// why we fetch the data
		// 1. To perform some operations: add, sub, mul, div, remainder
		// 2. Just to see the value by printing
		// 3. To perform some operations
		
		System.out.println("value of result: "+ result);
		
		
	
		
		// Arrays Details
		
		//Arrays - when we want to store group of values of same/similar/homogenous data type
		
		
		// way 1
		int[] array1 = { 10, 20, 30, 40, 50 }; // declare and initialization
		
		// way 2
		//int array2[] = { 10, 20, 30, 40, 50};
		
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);
		
		

		
		// for loop
		System.out.println("======== Using for loop===========");
		
		// iterating / loop through an array to get each element/ value
		
		// for(initilization;condition;increment/decrement){}
		
		System.out.println("Array size: " + array1.length);
		
		for (int i = 0; i < array1.length; i++) {

			System.out.println(array1[i]);//array1[2]
			// i = i + 1;// i = 4 + 1 => 5
			// System.out.println("value :" + numbersArray[i] + " index :"+ i);
		}
		
		/*

		// while loop
		System.out.println("======== Using while loop===========");
		int j = 0;
		while (j < array1.length) {
			System.out.println(array1[j]);
			j++;

		}

		// do while loop
		System.out.println("======== Using do while loop===========");
		int k = 0;
		do {
			System.out.println(array1[k]);
			k++;

		} while (k < array1.length);
		*/
	}
	
}