package com.nacho.kyu8;


import java.util.Arrays;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return  args[0];

    }
}
