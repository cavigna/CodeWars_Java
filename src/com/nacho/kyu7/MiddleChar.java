package com.nacho.kyu7;

public class MiddleChar {


    public static String getMiddle(String word) {
        String palabra; int medio =Math.floorDiv(word.length(),2);
        if (word.length()%2==0){
            palabra = word.substring(medio-1, medio+1);
            System.out.println(medio);
        }
        else {
            palabra = word.substring(medio, medio+1);
        }
        return palabra;
    }






}
