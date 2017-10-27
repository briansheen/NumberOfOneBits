package com.example;

public class Main {

    public static void main(String[] args) {
	    int n = 11;
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n){
        int temp = 0;
        int count = 0;
        while(n!=0){
            temp = n % 2;
            if(temp != 0){
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }
}
