package com.java.practice;

//Java program to find min operation
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinOperation {
	// Function to print minimum operation required to make
	// all elements of an array equal
	public static int equalArrayValues(int N, List<Integer> A)
	{
		int arraySum, lowest;
		arraySum = 0;
		lowest = A.get(0);
		for (int i = 0; i < N; i++) {
			if (A.get(i) < lowest) {
				lowest = A.get(i);
			}
			arraySum += A.get(i);
		}		
		return arraySum - N * lowest;
	}

	// Driver program to test above functions
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			A.add(scan.nextInt());
		}
		equalArrayValues(n, A);
	}
}
