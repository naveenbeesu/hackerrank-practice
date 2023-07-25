package com.java.practice;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		s = sc.nextLine(); // reading string from user
		System.out.print("After reverse string is: ");
		int i=s.length();
		while(i>0)
		{
			System.out.print(s.charAt(i-1));
			i--;
	}
}
}
