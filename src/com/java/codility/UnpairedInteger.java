package com.java.codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UnpairedInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,3,1,3,5}; 
		System.out.println(solution(A));
		System.out.println(2/3);
	}
	
	 public static int solution(int[] A) {
	        // write your code in Java SE 8
		 List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
	     Map<Integer, Long> mapStream = list.stream().collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
	     Optional<Integer> unpairedValues = mapStream.entrySet().stream().filter(e -> e.getValue()%2 != 0).map(Map.Entry::getKey).findFirst();
	         return unpairedValues.get();
	    }
	}
