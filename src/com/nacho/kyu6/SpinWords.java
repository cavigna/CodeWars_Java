package com.nacho.kyu6;

import java.util.Arrays;

public class SpinWords {
    public static String dadoVuelta(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public String spinWords(String sentence) {
        String[] parts = sentence.split(" ");
        String array;
        for (int i = 0; i<= parts.length - 1;i++){
            parts[i] = parts[i].length() >= 5 ? parts[i] = dadoVuelta(parts[i]) : parts[i];
        }
        array =Arrays.toString(parts);
        array = array.substring(1, array.length() - 1).replace(",", "");

        return array;
    }

    public String spinWords2(String sentence) {
        String[] words = sentence.split(" ");
        for (var i=0; i<words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ",words);
    }

}



