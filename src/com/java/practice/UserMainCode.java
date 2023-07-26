package com.java.practice;

import java.util.Scanner;

public class UserMainCode {
	
	  public int sum(int input1, int[] input2)
	  {
		    int min=input2[0];
		    int max=input2[0];

		    for(int i=0;i<input2.length;i++)
		    {
		       if(min>input2[i])
		           min=input2[i];
		       
		       if(max<input2[i])
		          max=input2[i];
		     }
		    return min+max;
	  }
	  public static void main(String[] args)
	   {
	   Scanner sc=new Scanner(System.in);
	   int input1 = sc.nextInt();
	   int input2[]=new int[input1];
	    for(int i=0;i<input2.length;i++)
	    	input2[i]=sc.nextInt();
	    
	    UserMainCode userMainCode = new UserMainCode();
	     System.out.println(userMainCode.sum(input1, input2));
	     }
}