package com.sid.collectionConcepts;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// https://www.java67.com/2014/03/how-to-print-array-in-java-example-tutorial.html
		int[] oneDArray = new int[3];

		oneDArray[0] = 10;
		oneDArray[1] = 20;
		oneDArray[2] = 30;

		System.out.println(oneDArray);

		System.out.println("Array Elements: ");
		for (int i : oneDArray)
			System.out.println(i);
		System.out.println(oneDArray[2]);

		int[][] twoDArray = { { 1, 2, 9, 3, 6, 4 }, { 3, 4, 2, 3, 1, 6 }, { 3, 4, 2, 3, 1, 6 }, { 1, 2, 9, 3, 6, 4 } };

		System.out.println("twoDArray size :" + twoDArray.length);

		System.out.println("twoDArray Row size :" + twoDArray.length);

		System.out.println("twoDArray Column size :" + twoDArray[0].length);

		// use Arrays.toString() to print one - dimensional array

		System.out.println("oneDArray elements :" + Arrays.toString(oneDArray));

		// use Arrays.deepToString() to print two - dimensional array

		System.out.println("twoDArray elements :" + Arrays.deepToString(twoDArray));

		// System.out.println("twoDArray [1] sort elements :" +
		// Arrays.sort(twoDArray[1]));

		System.out.println("twoDArray [1] before sort elements :" + Arrays.toString(twoDArray[1]));
		Arrays.sort(twoDArray[1]);
		System.out.println("twoDArray [1] sort elements :" + Arrays.toString(twoDArray[1]));
	}

}
