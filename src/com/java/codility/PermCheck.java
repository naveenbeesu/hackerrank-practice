package com.java.codility;

import java.util.HashMap;

public class PermCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {4, 1, 3, 0, 5, 2}; 
		System.out.println(solution(A));
	}
	public static int solution(int[] A) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int max = 0;
		for(int i=0;i<A.length;i++) { 
			int key = A[i];
			if(key>max) {
				max = key;
			}
			if(key<=0 || hashMap.containsKey(key)) {
				return 0;
			} else {
				hashMap.put(key, 1);
			}
		}
		if(hashMap.size()==max) {
			return 1;
		}
		return 0;
	}

}
