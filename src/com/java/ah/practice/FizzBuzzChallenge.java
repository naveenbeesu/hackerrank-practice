package com.java.ah.practice;

import java.util.stream.IntStream;

public class FizzBuzzChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i% 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
		IntStream

	}
	
	void RangeFizzBuzzz() {
		int end = 100;

		IntStream.rangeClosed(1, end)
		        .mapToObj(
		                i -> i % 5 == 0 ? 
		                        (i % 7 == 0 ? "FizzBuzz" : "Fizz") : 
		                        (i % 7 == 0 ? "Buzz" : i))
		        .forEach(System.out::println);
	}
	
	https://javarevisited.blogspot.com/2015/04/fizzbuzz-solution-in-java-8.html#axzz86cDTRhaH
	
	/** * FizzBuzz Solution using Java 8 Optional, map and * Stream map() function is * really useful here. * * @param number * @return Fizz, Buzz, FizzBuzz or the number itself */ 
	public static String fizzBuzzInJava8(int number) {
		String result = Optional.of(number) 
				.map(n -> (n % 3 == 0 ? "Fizz" : "") + (n % 5 == 0 ? "Buzz" : "")) .get(); 
	return result.isEmpty() ? Integer.toString(number) : result; }

	
	
	

}
