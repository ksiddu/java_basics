package com.sid.collectionConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 3, 11, 7, 5, 4 };

		Arrays.sort(array);

		System.out.println("Sorted Array : " + Arrays.toString(array));

		Integer[] output = Arrays.stream(array).boxed().toArray(Integer[]::new);

		Arrays.sort(output, Collections.reverseOrder());

		System.out.println("Sorted Array : " + output);
		for (int i : output) {
			System.out.print(" " + i);
		}

	}

}
