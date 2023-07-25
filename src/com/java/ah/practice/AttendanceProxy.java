package com.java.ah.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class AttendanceProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        
       Integer[] result = findTheAbsentStudents(n, a);

	}
	
	 static Integer[] findTheAbsentStudents(int n, int[] a) {
		 //https://github.com/jaynigam/javaCodingChallenge/blob/master/Problem1.java
		 https://github.com/sshinde431/AttendanceProxy/commit/dd0c66bed148a9963bb743651f2d5db37f10f890
			 
	        // Return the list of student IDs of the missing students in increasing order.
//		 Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		 Arrays.asList(a).stream().distinct().forEach(b->{if(map.put(b, 1));
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i=0; i<a.length; i++) {
			set.add(a[i]);
		}
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<n;i++) {
			if(!set.contains(i)) {
				list.add(i);
			}
		}
		return (Integer[]) list.toArray();
	    }

}
