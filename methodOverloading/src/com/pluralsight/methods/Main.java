package com.pluralsight.methods;

public class Main {

    public static void main(String[] args) {
       // calculateScore("Baris", 500); // this line run successful
        // yeni bir degisken tanımlayıp ona da atabiliriz:
        int newScore = calculateScore("Baris", 500);
        System.out.println("new score is : " + newScore);
        calculateScore(75);
        calculateScore();
       // calcFeetAndInchesToCentimeters(7,5); // other method
        double centimeter = calcFeetAndInchesToCentimeters(7,5);
        if (centimeter < 0.0) {
            System.out.println("invalid centimeter parameter.");
        }
        calcFeetAndInchesToCentimeters(100);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player  scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player No Points");
        return 0;
    }

    // new method calculate feet and inch to centimeters

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if(feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("invalid feet and inches parameters");
            return -1;
        }
        else {

            // 1 inch = 2.54 cm && 1 feet = 12 inches

            double centimeter = (feet * 12) * 2.54; //calc feet
            centimeter += inches * 2.54; // calc inches
            // System.out.println("feet " + feet + "inches " + inches + "= " + centimeter + "cm ."); hatali
            System.out.println(feet + " feet," + inches + "inches = " + centimeter + "cm .");


            return centimeter;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if ( inches < 0) {
            System.out.println("invalid feet and inches parameters");
            return -1;
        }
        else {

            double feet;
            feet = (int) inches / 12;
            double remainingInches;
            remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to "
                    + feet + " feet and " + remainingInches + "inches");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }


    }


    }
