package com.nacho;

public class JadenCase {
    public String toJadenCase(String phrase){
        if (phrase == null) return null ;
        else if(phrase.isEmpty()){
            return null;

        }
        String [] array = phrase.split(" ");
        StringBuilder out = new StringBuilder();
        for(String s:array){
            out.append(upperCase(s)).append(" ");

        }
        return out.substring(0, out.length() - 1);
    }
    public static String upperCase(String str) {
        if (str.isEmpty()) return null;

        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}

/*public class JadenCase {

    public String toJadenCase(String phrase) {
        // TODO put your code below this comment

        return null;
    }

}*/
