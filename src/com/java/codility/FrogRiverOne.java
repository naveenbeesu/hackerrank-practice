package com.java.codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FrogRiverOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,3,1,4,2, 3, 5, 4}; 
		System.out.println(solution(5, A));
		System.out.println(2/3);
	}
	
	 public static int solution(int X, int[] A) {
	        // write your code in Java SE 8
		 List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 for(int i = 0; i<list.size();i++) {
			 int step = list.get(i);
			 if(!map.containsKey(step)) {
				 map.put(step, 1);
			 }
			 if(map.size()==X) {
				 return i;
			 }
		 }
		 
		 return -1;
	    }

}
