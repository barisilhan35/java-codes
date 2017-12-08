package com.pluralsight.methods;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        while (count !=5) {
            System.out.println("while " + count);
            count++;
        }

        for (int i = 0; i<5; i ++){
            System.out.println("same for " + i);
        }

        count = 0;
        while (true) { //*****important*****
            if (count == 5) {
                break;
            }
            System.out.println("while true " + count);
            count++;
        }

        count = 0;
        do {
            System.out.println("do while " + count);
            count++;
        } while(count !=5);

        // find even number
        int number=5;
        int finalNumber= 20;

        while (number <= finalNumber) {
            if (isEvenNumber(number)){
                number++;
                continue;
            }
            System.out.println("this is even number " + number);
            number++;
        }
        ////




    }
    // find even number method
    public static boolean isEvenNumber(int number){
        if((number%2)==0){
            return false;
        }
        else {
            return true;
        }
    }
}
