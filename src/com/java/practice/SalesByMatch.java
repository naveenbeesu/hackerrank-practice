package com.java.practice;

import java.util.HashMap;
import java.util.List;

public class SalesByMatch {

	/*
 There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example


There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

Function Description

Complete the sockMerchant function in the editor below.

sockMerchant has the following parameter(s):

int n: the number of socks in the pile
int ar[n]: the colors of each sock
Returns

int: the number of pairs
Input Format

The first line contains an integer , the number of socks represented in .
The second line contains  space-separated integers, , the colors of the socks in the pile.
	*/
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
