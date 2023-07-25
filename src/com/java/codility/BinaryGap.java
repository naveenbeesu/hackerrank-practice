package com.java.codility;

import java.util.ArrayList;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(1376796946));
		}

    public static int solution(int N) {
        // write your code in Java SE 8
        int countOfZeros = 0;
        int prev = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(N>0){
        list.add(N%2);
            N= N/2;
        }
        for(int i=0;i<list.size();i++){
        	if(list.get(i)==0) continue;
        	for(int j = i+1; j<list.size();j++) {
        	         if(list.get(j)==1) { if(countOfZeros>prev){
        	                    prev = countOfZeros;
        	                    countOfZeros = 0;
        	         }
        	                    break;
        	                }
        	         if(list.get(j) == 0) {
        	        	 countOfZeros++; 
        	         }
        		}
        	countOfZeros = 0;
        	}
        return prev;
    }

}
