package com.java.codility;

public class CyclicRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,3,4,5}; 
		solution(A, 4);
	}
	
	 public static int[] solution(int[] A, int K) {
	        int[] B = new int[A.length];
	        for(int i = 0; i<A.length;i++){
	                if (K>=A.length) {
	                	K = K % A.length;
	                }
                	if(i+K>=A.length) {
                		 B[i+K-A.length] = A[i];
                	}
	               else {
	                    B[i+K] = A[i];
	                }
	        }
	        return B;
	        // write your code in Java SE 8
	    }
	 
	
	 
}
