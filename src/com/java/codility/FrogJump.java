package com.java.codility;

public class FrogJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int remaining = Y - X;
        if(D>remaining){
            return 1;
        } if(remaining%D == 0){
            return  remaining/D;
        } else{
            return  remaining/D + 1;
        }
        
    }

}
