package com.nacho.kyu7;

import java.util.Arrays;

public class SortArray {
    /*public static <T> T[]  sortArray(T[] arr){
        //ordenado(arr);
        return [];
        //Arrays.stream(arr).sorted().toArray();

    }*/
    private static int [] ordenado(int [] arr){
        return Arrays.stream(arr).sorted().toArray();

    }

}
