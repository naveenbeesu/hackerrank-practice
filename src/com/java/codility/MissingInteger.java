package com.java.codility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissingInteger {

	public static void main(String[] args) {
		int[] A = {-1, 2, 4}; 
		
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		List<Integer> list = Arrays.stream(A).boxed().filter(a->a>=0).distinct().sorted().collect(Collectors.toList());
		if(list.size()==0) {
			return 1;
		}
		for(int i=0;i<list.size();i++) {
			if(i+1 != list.get(i)) {
				return i+1;
			}
		}
		return list.size()+1;
	}

}
