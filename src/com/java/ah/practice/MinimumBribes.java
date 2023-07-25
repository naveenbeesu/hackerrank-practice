package com.java.ah.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumBribes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minimumBribes(List.of(2, 1, 5, 3, 4));

	}

	static void minimumBribes(List<Integer> q) {
	    // Write your code here
	    int count = 0;
	    int chaoticCount = 0;
	    //Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    	for(int i=0;i<q.size();i++){
	            if(q.get(i)!=i) {
	                count++;
	                if(Math.abs(q.get(i)-(i+1))>2) {
	                	chaoticCount++;
	                }
//	                else{
//	                    int value = q.get(i);
//	                    int nextValue = q.indexOf(value);
//	                    q.add(i, nextValue);
//	                    q.add(nextValue, value);
//	                    count++;
//	                } 
	                for (int j = Math.max(0, q.get(i)-2); j < i; j++) {
	                    if (q.get(j) > q.get(i)) {
	                        count++;
	                    }
	                }
	            }
	        }
	        if(chaoticCount>0){
	            System.out.println("Too chaotic");
	        } else {
	         System.out.println(count);   
	        }

	}}
