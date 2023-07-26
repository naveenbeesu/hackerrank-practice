package com.java.codility;

import java.util.Arrays;

public class PermMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1}; 
		System.out.println(solution(A));
	}
	
	 public static int solution(int[] A) {
		 int n = A.length; 
		 if(n==0) {
			 return 1;
		 }
		 Arrays.sort(A);
		 for(int i=0; i<n;i++) {
			 if (A[i]!=i+1) {
				 return i+1;
			 }
		 }
		 return n+1;
	 }

}
