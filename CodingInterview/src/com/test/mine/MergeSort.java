package com.test.mine;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 4, 1, 2, 9, 8,0 };
		int[] temp = new int[arr.length];

		divideArr(arr, temp, 0, arr.length - 1);
		Arrays.stream(arr).forEach(System.out::print);
	}

	private static void mergeArr(int[] arr, int[] temp2, int low, int high) {
		// TODO Auto-generated method stub
		int leftEnd = (low + high) / 2;
		int rightStart = leftEnd + 1;
		int rightEnd = high;
		int leftStart = low;

		for (int i = low; i <= high; i++) {
			temp2[i] = arr[i];
		}

		int left = leftStart;
		int right = rightStart;
		int currentIndex = leftStart;
		while ((left <= leftEnd) && (right <= rightEnd)) {
			if (temp2[left] <= temp2[right]) {
				arr[currentIndex] = temp2[left];
				left++;
				currentIndex++;
			} else {
				arr[currentIndex] = temp2[right];
				right++;
				currentIndex++;
			}

		}

		for (int i = left; i <= leftEnd; i++) {
			arr[currentIndex] = temp2[i];
			currentIndex++;
		}
		for (int i = right; i <= rightEnd; i++) {
			arr[currentIndex] = temp2[i];
			currentIndex++;
		}

	}

	private static void divideArr(int[] arr, int[] temp, int low, int high) {
		// TODO Auto-generated method stub
		if (low >= high)
			return;

		int mid = (low + high) / 2;
		divideArr(arr, temp, low, mid);
		divideArr(arr, temp, mid + 1, high);
		mergeArr(arr, temp, low, high);
	}

}
