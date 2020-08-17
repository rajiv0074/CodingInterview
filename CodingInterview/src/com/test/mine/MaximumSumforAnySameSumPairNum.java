package com.test.mine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Given an array of number find the group of 
 * numbers with same sum and the return the sum of those numbers with maximum sum
 * for example = input = { 51, 71, 17, 42 }; [51, 42] (6) and [71, 17] (8) 
 * giving same sum but as (51+42) =  93 and [71, 17] = 88 output of program will be
 * 93.
 * Example 2 = {52, 72, 17, 42} return = -1
 * Example 3 = {2,5,7,45, 9} return = 54
 */
public class MaximumSumforAnySameSumPairNum {

	public static void main(String[] args) {
		 int[] A = {51, 71, 17, 42};
		 //int[] A = {2,5,7,45, 9};
		//int[] A = { 52, 72, 17, 42 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		Map<Integer, List<Integer>> sumMap = new HashMap<>();
		for (int curr : A) {
			int sum = 0;
			int rem = curr;
			int currVal = curr;
			if (curr >= 10) {
				while (currVal >= 10) {
					rem = currVal % 10;
					currVal = (currVal / 10);
					sum = sum + rem;
				}
			}
			sum = sum + currVal;

			List<Integer> listOfSum = new ArrayList<>();
			if (sumMap.containsKey(sum)) {
				listOfSum = sumMap.get(sum);
			}
			listOfSum.add(curr);
			sumMap.put(sum, listOfSum);
		}
		int maxSum = 0;
		int returnMaxSum = -1;

		for (List<Integer> curr : sumMap.values()) {
			if (curr.size() > 1) {
				maxSum = curr.stream().reduce(0, (a, b) -> a + b);
				if (maxSum > returnMaxSum) {
					returnMaxSum = maxSum;
				}
			}

		}

		return returnMaxSum;
	}
}
