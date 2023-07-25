package com.java.codility;

import java.util.Arrays;

public class TapeEquilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-1000, 1000}; 
		System.out.println(solution(A));

	}
	public static int solution(int[] A) {
		int difference = 0;
		int currentSum = 0;
		int sum = Arrays.stream(A).boxed().skip(1).reduce((a,b)->a+b).get();
		int prev = Math.abs(sum - A[0]);
		for(int i=0;i<A.length-1;i++) {
			currentSum += A[i];
			difference = Math.abs(sum - currentSum); 
			sum = sum - A[i+1];
			if(difference<prev) {
				prev = difference;
			}
		}
		return prev;
	}

}
