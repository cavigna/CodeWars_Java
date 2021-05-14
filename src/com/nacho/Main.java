package com.nacho;

import com.nacho.kyu6.BitCounting;
import com.nacho.kyu6.Multiple3Or5;
import com.nacho.kyu7.LineNumbering;
import com.nacho.kyu7.ReverseLonger;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(BitCounting.countBits(1234));
        System.out.println();
        System.out.println(ReverseLonger.shorterReverseLonger("first", "abcde"));
        System.out.println(Multiple3Or5.solution(10));
        System.out.println(Multiple3Or5.recursive(10));
        System.out.println(LineNumbering.number(Arrays.asList("a", "b", "c")));
	// write your code here
    }
}
