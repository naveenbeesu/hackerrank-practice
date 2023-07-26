package com.java.ah.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ComplementaryDNA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter DNA strand");
		String dna = scan.next(); //scans input String and assigns to a variable called dna
		
		System.out.println(makeComplement(dna)); //passes dna string as param to makeComplement() method and prints the result
		scan.close();
	}
	public static String makeComplement(String dna) {
		Map<String, String> complementaryDnaMap = Map.ofEntries(Map.entry("A", "T"), Map.entry("T", "A"), 
				Map.entry("G", "C"), Map.entry("C", "G"));  //creates a Map with entries of all the dna symbols and their complementary symbols

		StringBuilder complementaryDna = new StringBuilder(); //creates StringBuilder object to append the complementary symbol of each symbol in the input dna string
		for(String code: dna.split("")) {	//iterates for each symbol in the string
			complementaryDna.append(complementaryDnaMap.get(code)); //appends each complementary symbol to modifiedDna string builder object
		}
		return complementaryDna.toString(); //converts string builder to string
	}
}
