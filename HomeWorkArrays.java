package com.lucyhu.arrayshomework;

import java.util.ArrayList;

public class HomeWorkArrays {

	public static void main(String[] args) {
		int[] givenArr = { 1, 2, 3, 4, 5, 7, 6 };
		int sum = 0;
		for (int i = 0; i < givenArr.length; i++) {
			sum = sum + givenArr[i];
		}
		System.out.println(sum);
		System.out.println(max());
		System.out.println(toPower(5, 3));

	}

	public static int max() {

		double[] exampleArray = { 1, 5, 6, 5, 4, 1 };

		double maximum = exampleArray[0];

		int index = 0;

		for (int i = 1; i < exampleArray.length; i++) {

			if (exampleArray[i] > maximum) {

				maximum = exampleArray[i];

				index = i;

			}

		}
		return index;

	}

	public static ArrayList<Integer> toPower(int size, int power) {
		ArrayList<Integer> powerArr = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			powerArr.add((int) Math.pow(i, power));
		}
		return powerArr;
	}

}
