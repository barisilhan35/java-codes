package com.pluralsight.methods;

public class Main {

    public static void main(String[] args) {

    /*    int number =1;
        if(number ==1){
            System.out.println("number is 1");
        }
        else if(number ==2){
            System.out.println("number is 2");
        }
        else {
            System.out.println("number is none");
        }*/

        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("number is 1");
                break;

            case 2:
                System.out.println("number is 2");
                break;

                default:
                    System.out.println("number is none");
                    break;

        }

        char charValue= 'A';
        switch (charValue) {
            case 'A':
                System.out.println("A comes");
                break;
            case 'B':
                System.out.println("b comes");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " comes");
                break;
            default:
                System.out.println("nothing");
                break;
        }

        String month = "JANUARY"; // sonuc Jan olacaktır toUpperCase de kullanilabilir
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "February":
                System.out.println("Feb");
                break;
                default:
                    System.out.println("wrong month");
                    break;

        }




    }



}
