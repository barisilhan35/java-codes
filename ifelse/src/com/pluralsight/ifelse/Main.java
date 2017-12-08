package com.pluralsight.ifelse;

public class Main {

    public static void main(String[] args) {

        int v1 = 7;
        int v2 = 5;

        if (v1 > v2)
            System.out.println("v1 is bigger");
        else
            System.out.println("v1 is not bigger");

        /* else if: */

        int v3 = 10;
        int v4 = 40;

        if (v3 > v4)
            System.out.println("v3 is bigger" + v3);
        else if (v3 < v4)
            System.out.println("v4 is bigger: " + v4);
            else
                System.out.println("they are equal");

        int v5 = 10, v6 = 4, diff = 0;

        if (v5 > v6)
            diff = v5 - v6;
        System.out.println("v5 is bigger");
        System.out.println(diff);

        int v7 = 10, v8 = 4, diff2;

        if (v7 > v8)    {
            diff2 = v7 - v8;
            System.out.println("v7 is bigger");
            System.out.println(diff2);
        }
        else if (v8 > v7) {
            diff2 = v8 - v7;
            System.out.println("v8 is bigger");
            System.out.println(diff2);
        }
        else {
            System.out.println("they are equal");
        }

        /* if icinde if */

        float students = 0.0f;
        float rooms = 4.0f;

        if (students > 0.0f) {
            if (rooms > 0.0f)

                System.out.println(students / rooms);
        }
        else
            System.out.println("no students");

        System.out.println();
        System.out.println("**end of program**");


        /*
        logical operators
         */
        int a = 6, b = 9, c = 5;

        if (a > c & b > c)
            System.out.println("a is greater than c");

        /*
        & is bitwise. && is logical.
        & evaluates both sides of the operation. operates on each bit separately
        && evaluates the left side of the operation, if it's true, it continues and evaluates the right side.
         */

        boolean done = false;

                if (!done)
                    System.out.println("keep going");

        /*
        logical , conditional logical;
         */

        int student = 150;
        int room = 0;

        if ( room > 0 && student / room > 30)

            System.out.println("class is crowded");

    }
}
