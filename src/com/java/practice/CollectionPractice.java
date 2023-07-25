package com.java.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Naveen");
		alist.add("Vaishnavi");
		alist.add("Naveen");
		//different ways of iterating through list
		//for loop using i
		System.out.println("for loop using i");
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		
		// for each
		System.out.println("For Each");
		alist.forEach(a->System.out.println(a));
		
		System.out.println("For loop");
		for(String s: alist) {
			System.out.println(s);
		}
		System.out.println("Using Iterator");
		Iterator<String> i = alist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Removing Duplicate elements using hashset");
		HashSet<String> hSet = new HashSet<String>();
		hSet.addAll(alist);
		hSet.forEach(a->System.out.println(a));
		
		System.out.println("Removing Duplicate elements using Linkedhashset");
		LinkedHashSet<String> linkedHSet = new LinkedHashSet<String>();
		linkedHSet.addAll(alist);
		linkedHSet.forEach(a->System.out.println(a));

	}

}
