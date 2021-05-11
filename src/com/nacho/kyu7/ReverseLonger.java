package com.nacho.kyu7;

public class ReverseLonger {
    public static String shorterReverseLonger(String a, String b) {
        String s1; String s2;
        if(a.length()>=b.length()){
            s1= b;
            s2 =new StringBuilder(a).reverse().toString();}
        else {
            s1 = a;
            s2 = new StringBuilder(b).reverse().toString();
        }
        return s1+s2+s1;
    }
}

/* BETTER ONE
public class ReverseLonger {


  public static String shorterReverseLonger(String a, String b) {
        return a.length() >= b.length() ?
                b + new StringBuilder(a).reverse() + b :
                a + new StringBuilder(b).reverse() + a;
  }

}
 */

/*
Given 2 strings, a and b, return a string of the form:
shorter+reverse(longer)+shorter.

In other words, the shortest string has to be put as prefix
and as suffix of the reverse of the longest.

Strings a and b may be empty, but not null
(In C# strings may also be null. Treat them as if they are empty.).
If a and b have the same length treat a as the longer producing b+reverse(a)+b
 */