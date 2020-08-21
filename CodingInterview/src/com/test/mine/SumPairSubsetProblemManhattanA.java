package com.test.mine;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SumPairSubsetProblemManhattanA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new TreeSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		int x = 10;
		// Print the all the pairs of Numbers which sums to x
		printPairs(set, x);

		// Print the all the subset of numbers which sums up to x
		// printSubsets(set, x);

	}

	/*
	 * private static void printSubsets(Set<Integer> set, int x) { // TODO
	 * Auto-generated method stub HashMap<Integer, List<Integer>> mapList = new
	 * HashMap<>(); for(Integer curr : set) { map. if(mapList.containsKey(curr)) {
	 * 
	 * } }
	 * 
	 * }
	 */

	private static void printPairs(Set<Integer> set, int x) {
		// TODO Auto-generated method stub
		int remainingNumber = 0;
		// Collections.sort(set);
		List<Integer> numList = new ArrayList<>();

		for (int i : set) {
			remainingNumber = x - i;
			if (remainingNumber != i && !numList.contains(i) && !numList.contains(remainingNumber)
					&& set.contains(remainingNumber)) {
				numList.add(i);
				numList.add(remainingNumber);
				System.out.print(i + ",");
				System.out.println(remainingNumber);
			}
		}
	}
}