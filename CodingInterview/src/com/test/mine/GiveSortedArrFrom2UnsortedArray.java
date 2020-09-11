package com.test.mine;

import java.util.Arrays;

public class GiveSortedArrFrom2UnsortedArray {

	public static void main(String[] args) {
		// todo auto-generated method stub
		int[] arr1 = { 6, 7, 3, 2, 4 };
		int[] arr2 = { 9, 8, 1, 5, 4 };

		printsortedarray(arr1, arr2);

	}

	private static void printsortedarray(int[] arr1, int[] arr2) {
		// todo auto-generated method stub
		int[] resularr = new int[arr1.length + arr2.length];
		int resultarrcounter = 0;
		int temp = 0;
		for (int curr : arr1) {
			resularr[resultarrcounter++] = curr;
		}
		for (int curr : arr2) {
			resularr[resultarrcounter++] = curr;
		}

		for (int i = 0; i < resularr.length; i++) {
			for (int j = 0; j < resularr.length; j++) {
				if (resularr[i] <= resularr[j]) {
					temp = resularr[i];
					resularr[i] = resularr[j];
					resularr[j] = temp;
					// continue;
				}
				resultarrcounter++;
			}
		}
		Arrays.stream(resularr).forEach(System.out :: print);
	}
}
