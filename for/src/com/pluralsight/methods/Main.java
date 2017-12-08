package com.pluralsight.methods;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000.0,2.0));
        System.out.println(calculateInterest(10000.0,3.0));
        System.out.println(calculateInterest(10000.0,4.0));
        System.out.println(calculateInterest(10000.0,5.0));

        //for (initilaize; terminate; increment)
        for (int i=6; i < 10; i++){
            System.out.println("for " + String.format("%.2f",calculateInterest(10000.0, (double) i))); // i yi double a cast ettik

        }

        System.out.println("**********");

        for (int i=10; i > 0; i--){
            System.out.println("for2 " + String.format("%.2f",calculateInterest(10000.0, (double) i))); // i yi double a cast ettik

        }

        //ASAL SAYI BULMA

        int count=0;
        for (int i =10; i < 50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("number " + i + " is prime");
                if(count==23) {
                    System.out.println("exit the loop");
                    break;
                }
            }
        }


    }
    public static double calculateInterest(double amount, double interestRate){

        return (amount * (interestRate/100));


    }

    //ASAL SAYI BULMA

    public static boolean isPrime(int n) {

        if(n==1){
            return false;
        }
        for (int i =2; i<=n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }
}
