package com.java.practice;

import java.util.Scanner;

public class GcdSums {

	public static int gcdSumsSolution(int N) {
		int[] a = new int[N];
		int result = 0;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<N;i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int gcd = 1;
				for(int k=1;k<=a[i] && k<=a[j];++k) {
					if(a[i]%k==0 && a[j]%k==0) {
						gcd = k;
					}
				}
				result = result + gcd;
			}
		}
		
		return result;
	
	}
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println(gcdSumsSolution(N));
		scan.close();
		// TODO Auto-generated method stub

	}

}
