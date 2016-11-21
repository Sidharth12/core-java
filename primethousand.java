package binsear;

import java.util.ArrayList;

public class primethousand {


    public static void main(String args[]) {
        int d = 2;
        int count = 0;
        long sum = 0;
        while(count < 1000){
            if(isPrimeNumber(d)){
                sum += d;
                count++;
            }
            d++;
        }
        System.out.println(sum);
    }
     
    private static boolean isPrimeNumber(int number){
         
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    }

