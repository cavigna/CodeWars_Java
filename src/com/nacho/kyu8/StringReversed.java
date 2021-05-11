package com.nacho.kyu8;

public class StringReversed {
    public static String solution(String str) {
        StringBuilder strbuild = new StringBuilder(str).reverse();
        return strbuild.toString();
    }
}
