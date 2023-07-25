package com.java.ah.practice;

import java.util.Arrays;
import java.util.List;

public class RecursiveDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(superDigit("9875", 4));

	}

	public static int superDigit(String n, int k) {
		String number = n.repeat(k);
		if (number.length() == 1) {
            return Integer.parseInt(number);
        }

        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            // Convert each digit to integer and add it to the sum
            sum += Character.getNumericValue(number.charAt(i));
        }

        // Recursively calculate the super digit of the sum
        return superDigit(String.valueOf(sum), 1);
        
//		int sum = 0;
//		if (n == "" || n.isEmpty() || k == 0)
//			return sum;
//		if (n.length() * k <= 1)
//			return Integer.valueOf(n);
//		int newInt = Integer.valueOf(n) * k;
//		System.out.println(newInt);
//		//while (newInt > 9) {
//			System.out.println(newInt);
//			while (newInt > 0) {
//				sum = sum + newInt % 10;
//				newInt = newInt / 10;
//			}
//			if(sum>9) sum = superDigit(String.valueOf(sum), 1);
			//newInt = sum;
		//}

		//return sum;

		// Write your code here
		// Arrays.asList(n.split(" ")).stream().mapToInt(a,
		// b->Integer.valueOf(a)+Integer.valueOf(b)).
//		 List<String> a;
//	    System.out.println(n);
//	    int sum = 0;
//	    if(n == "" || n.isEmpty() || k==0) return sum;
//	    if(n.length()*k <= 1) return Integer.valueOf(n);
//	    StringBuilder str = new StringBuilder();
//	    str.append(String.valueOf(Integer.valueOf(n)*k));
//	    //String newString = String.valueOf(Integer.valueOf(n)*k);
//	    while(str.length()>1) {
//	        a = Arrays.asList(str.toString().split(""));
//	        sum = a.stream().mapToInt(Integer::parseInt).sum();
//	        System.out.println(sum);
//	        str = new StringBuilder(String.valueOf(sum));
//	    }
//	    return sum;
	}

}
