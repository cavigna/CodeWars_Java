package com.nacho.kyu6;

public class Persist {

    public static int persistence(long n) {
        if (n / 10 == 0)
            return 0;

        long mulDigits = 1;


        for (long i = n; n != 0; n /= 10) {
            mulDigits *= (n % 10);
        }

        return persistence(mulDigits) + 1;
    }
}
/* Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
 which is the number of times you must multiply the digits in num until you reach a single digit.

For example:

 persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
                      // and 4 has only one digit

 persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
                       // 1*2*6 = 12, and finally 1*2 = 2

 persistence(4) == 0 // because 4 is already a one-digit number*/


/*    public static long mulDigits(long n) {
        int result = (int) n % 10;
        if ((n /= 10) == 0) {
            return result;
        }
        return mulDigits(result *= n % 10);


    }
}*/

/*    public static long mulDigits(long n) {
        int result = (int) n % 10;

        while ((n /= 10) > 0) {
            result *= n % 10;
        }

        return result;
    }
}*/


/*public class Persist {
    private static int counter=0;

    public static long mulRecursive(long num){
        if (num<1){
            return counter;
        }
        //System.out.println(num);
        return (num %10 + mulRecursive(num/10) );

    }
    public static int persistence(long n) {

        if (n <10){
            return counter;
        }
        counter += 1;
        System.out.println(counter);

        return persistence(mulRecursive(n));



    }
}*/
