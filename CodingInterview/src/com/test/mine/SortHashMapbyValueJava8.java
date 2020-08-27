package com.test.mine;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapbyValueJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> budget = new HashMap<>(); 
		budget.put("clothes", 120); 
		budget.put("grocery", 150); 
		budget.put("transportation", 100); 
		budget.put("utility", 130); 
		budget.put("rent", 1150); 
		budget.put("miscellneous", 90);
	
	Map<String, Integer> SortedMapByVal = sortMapByVal(budget);
	SortedMapByVal.forEach((key, value) -> System.out.println("**//n" +key + " " +value));

	}

	private static Map<String, Integer> sortMapByVal(Map<String, Integer> budget) {
		// TODO Auto-generated method stub
		//First Approach
		budget.entrySet().stream()
						.sorted(Map.Entry.comparingByValue())
						.forEach(System.out :: print);
		
		//Second Approach
		return budget.entrySet().stream()
								.sorted(Map.Entry.comparingByValue())
								.collect(Collectors.toMap(e->e.getKey(), e->e.getValue(), 
											(e1,e2) -> e1, LinkedHashMap::new));
	}

}
