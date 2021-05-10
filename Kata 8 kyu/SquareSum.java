package com.nacho.ryu8;

import java.util.Arrays;
public class SquareSum {
    public static int squareSum(int[] n){
        int sum = 0;
       for(int i:n){
           sum += Math.pow(i,2);

       }
       return sum;
        //Your Code
    }

    public static int squareSum2(int[] n){
        return Arrays.stream(n).map(m -> m * m).sum(); // With map
    }
}

/*Complete the square sum function so that it squares each number passed into it
 and then sums the results together.

For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.*/
