package com.nacho.ryu7;

public class VowelCount {
    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if ((charArr[i] == 'a' ||
                 charArr[i] == 'e' ||
                 charArr[i] == 'i' ||
                 charArr[i] == 'o' ||
                 charArr[i] == 'u')) {

                    vowelsCount++;
            }
        }

        return vowelsCount;

    }
}


/*import java.util.Locale;

public class VowelCount {
    public static int getCount(String str) {
        int vowelsCount = 0;
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        int n = cha

        return vowelsCount;

    }
}*/
