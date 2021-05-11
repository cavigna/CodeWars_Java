package com.nacho.kyu7;

public class HighAndLow {
    public static String highAndLow(String numbers) {
        String[] arr = numbers.split(" ");
        int [] intList = new int[0];
        //List<String> myList = new ArrayList<String>(Arrays.asList(s.split(",")));
        //for(String s : arr) intList.add(Integer.valueOf(s));

        return "ss" ;
    }
}

/*
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Example:

highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes:

All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
 */