package com.nacho.kyu6;

public class Multiple3Or5 {
    public static int solution(int n) {
        int sum = 0;
        for (int i=0; i<n; i++){
            if (i%3==0){ sum+=i;}
            else if (i%5 == 0){
                sum +=i;
            }

        }
        return sum;

    }
    private static int suma = 0;
    public static int recursive(int n){

        if (n <1){
            return suma;
        }
        else {
            n-=1;
            suma += (n % 3 == 0) ? n : (n % 5 == 0 ? n : 0);
            return recursive(n);
        }
    }
}
