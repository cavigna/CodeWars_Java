package com.nacho;

public class StringReversed {
    public static String solution(String str) {
        StringBuilder strbuild = new StringBuilder(str).reverse();
        return strbuild.toString();
    }
}
