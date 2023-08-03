package com.java.practice;

import java.util.HashMap;
import java.util.List;

public class SalesByMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sockMerchant(7, List.of(1, 2, 1, 2, 1, 3, 2)));

	}
	
	 public static int sockMerchant(int n, List<Integer> ar) {
		    // Write your code here
		        HashMap<Integer, Integer> map = new HashMap();
		        int pairs = 0;
		        for(Integer color: ar){
		            if(map.containsKey(color)){
		            	System.out.println(map.get(color));
		                map.put(color, map.get(color)+1);
		            } else {
		                map.put(color, 1);
		            }
		        }
		        for(Integer value: map.values()) {
		            pairs = pairs + (value/2);
		        }
		        return pairs;
		    }
}
