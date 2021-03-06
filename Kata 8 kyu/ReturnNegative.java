package com.nacho;

public class ReturnNegative {
    public static int makeNegative(final int n) {
        return (n>0) ? n*-1: n;


    }
}
/*
In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

Example:

Kata.makeNegative(1); // return -1
Kata.makeNegative(-5); // return -5
Kata.makeNegative(0); // return 0
Notes:

The number can be negative already, in which case no change is required.
Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.*/
