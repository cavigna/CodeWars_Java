package com.nacho;
/*You get an array of numbers, return the sum of all of the positives ones.

        Example [1,-4,7,12] => 1 + 7 + 12 = 20

        Note: if there is nothing to sum, the sum is default to 0.*/

import java.util.Arrays;

public class sumPositive {
    public static int sum(int[] arr){
        int sumaPositivo = 0;
        if (arr.equals(null)){
        return 0;}

        for( int i : arr ){
            if (i > 0){
                sumaPositivo += i;
            }
        }
        return sumaPositivo;
    }
    public static int sum2(int[] arr){
        return Arrays.stream(arr).filter(i -> i>0).sum();
    }
}



/*
public class Positive{

    public static int sum(int[] arr){
        return 0;
    }

}*/
