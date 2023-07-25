package com.java.codility;

import java.util.Arrays;

public class MaxCounters {

	public static void main(String[] args) {
		int[] A = {3,4,4,6,1,4,4}; 
		A = solution(5, A);
		for(int j=0;j<A.length;j++) {
			System.out.println(A[j]);
		}
		System.out.println(solution(5, A));
	}
	
	public static int[] solution(int N, int[] A) {
		int[] B = new int[N];
		int max = 0;
		for(int i=0;i<A.length;i++) {
			int value = A[i];
			if(value>=1 && value<=N) {
				B[value-1]++;
				if(B[value-1]>max) {
					max = B[value-1];
				}
			}
			if(value==N+1) {
				Arrays.fill(B, max);
			}
		}
		return B;
	}

}
