package com.java.codility;

public class PassingCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {0, 1,0, 1, 1}; 
		System.out.println(solutionEffective(A));
	}
	public static int solutionEffective(int[] A) {
		
		int pairs = 0;
		int countOne = 0;
		
		for(int i=A.length;i>=1;i--) {
			int value = A[i-1];
			if(value == 1) {
				countOne++;
			} else {
				pairs = pairs + countOne;
			}
		}
		if(pairs>1000000000) {
			return -1;
		}
		return pairs;
	}
	
public static int solution(int[] A) {
		
		int pairs = 0;
		
		for(int i=0;i<A.length;i++) {
			int value = A[i];
			if(value == 0) {
				for(int j=i+1;j<A.length;j++) {
					if(A[j]==1) pairs++;
				}
			}
		}
		if(pairs>1000000000) {
			return -1;
		}
		return pairs;
	}

}
