package com.nacho.kyu6;

public class BitCounting {

    public static int countBits(int n){
        int count = 0;
        String s = Integer.toBinaryString(n);
        for (int i=0; i < s.length(); i++){
            if (s.charAt(i) == '1') count +=1;
        }
        return count;
    }

}