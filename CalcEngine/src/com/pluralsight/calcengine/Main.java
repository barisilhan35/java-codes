package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {

        double val1 = 100.0d; // 100 vererek initialize etmeliyiz
        double val2 = 50.0d; // 50 vererek initialize etmeliyiz
        double result;

        char opCode;

        opCode = 'd'; // initialize etmeliyiz

        if (opCode == 'a')

            result = val1 + val2;
        else if (opCode == 's')
            result = val1 - val2;
        else if (opCode == 'd')
            /*if (val2 != 0.0d)
            result = val1 / val2;
            else
                result = 0.0d;*/
            // ustteki kisim ile asagidaki satir ayni; ":" otherwise "?" if
            result = val2 != 0.0d ? val1 / val2 : 0.0d;
        else if (opCode == 'm')
            result = val1 * val2;
        else {
            System.out.println("error: invalid opcode"); // bu satırı ekleyince block statement oldu { koymazsak 0.0 döner
            result = 0.0d; // resulti initialize ettik
        }
        System.out.println(result);

        /*
        While loop:
         */

        int kVal = 5;
        int factorial = 1;

        while (kVal > 1) {
            factorial *= kVal; // 5*1 = 5 sonra 5*4 =20 sonra 20*3 60*2 120*1
            kVal -= 1; // -1 çıkar 4 yapar 3 yapar 2

            //factorial *= kVal--; üstteki iki satırla aynı is
        }
        System.out.println(factorial); // en son 120 basar

        /*
        do while loop;
         */
        int iVal = 5;

        do {
            System.out.print(iVal); // print tek satıra yazar println alt alta
            System.out.print(" * 2 = ");
            iVal *= 2; //iki ile carpar
            System.out.println(iVal);
            // 5 * 2 = 10 yazar

        } while (iVal < 100);

        /*
        5 * 2 = 10
        10 * 2 = 20
        20 * 2 = 40
        40 * 2 = 80
        80 * 2 = 160
         */

        int iVal2 = 5;
        //int result2;

        do {
            System.out.print(iVal2); // print tek satıra yazar println alt alta
            System.out.print(" * 2 = ");
            // 5 * 2 = yazar
            iVal2 = iVal2 * 2;
            System.out.println(iVal2);

        } while (iVal2 < 100);

        /*
        for loop
         */

        for (int iVal3 = 1; iVal3 < 100; iVal3 *= 2) // (once initialize et sonra condition sonra update )
        {
            System.out.println(iVal3);
        }

        for (int iVal4 = 1; iVal4 < 10; iVal4++) // (once initialize et sonra condition sonra update )
        {
            System.out.println(iVal4);
        }

        /*
        ARRAYS
         */

        float[] theVals = new float[3];

        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 30.0f;

        float sum = 0.0f;

        for (int i = 0; i < theVals.length; i++) // .length !!
            sum += theVals[i];
        System.out.println(sum);

        float[] newArray = {10.0f, 20.0f, 30.0f}; //create an array and initialize it
        float sum2 = 0.0f;

        for (int i = 0; i < newArray.length; i++) // .length !!
            sum2 += newArray[i];
        System.out.println("array toplam = " + sum2);

        /*
        for each loop:
         */

        float[] newArray2 = {10.0f, 20.0f, 15.0f}; //create an array and initialize it

        float toplam = 0.0f;

        for (float currentVal : newArray2)
            toplam += currentVal; // for loopunda currentval 10 20 15 i ekleyecek

        System.out.println(toplam);  //print 45.0

        /*

         */

        int sVal = 10;
        switch (sVal % 2) {
            case 0:
                System.out.print(sVal);
                System.out.println(" is even");
                break;
            case 1:
                System.out.print(sVal);
                System.out.println(" is odd");
            default:
                System.out.println("nothing");



        }

        int variable1 = 50;
        variable1++;
        variable1--;
        System.out.println(variable1);
        System.out.println("one" + "two");

        boolean gameOver= true;
        int score =800;
        int level = 5;
        int bonus = 100;

        calculateScore();
        calculateScore2(true,800,5,bonus);
        calculateScore2(true,10000,8,bonus);


        if (score <5000 && score > 1000) {
            System.out.println("go");
        }
        else if (score < 1000){
            System.out.println("elseif");
        }
        else {
            System.out.println("else");
        }

        int finalScore = score + (level * bonus);

        score =10000;
        level = 8;
        bonus = 200;
        calculateScore2(true,10000,8,200);


    }
    /*
    method tanimlama calculateScore u üstte kullaniyoruz
     */

    public static void calculateScore() {
        boolean gameOver= true;
        int score =800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver == true) {
            int finalScore = score + (levelCompleted
                    * bonus);
            finalScore +=1000;
            System.out.println("final score is "
            + finalScore);
        }

    }

    public static void calculateScore2(boolean gameOver, int score,int levelCompleted, int bonus) {
        /*boolean gameOver= true;
        int score =800;
        int levelCompleted = 5;
        int bonus = 100;*/

        if (gameOver == true) {
            int finalScore = score + (levelCompleted
                    * bonus);
            finalScore +=1000;
            System.out.println("final score 2 is "
                    + finalScore);
        }

    }

    public static int calculateScore3(boolean gameOver, int score,int levelCompleted, int bonus) {


        if (gameOver) {
            int finalScore = score + (levelCompleted
                    * bonus);
            finalScore +=2000;
            System.out.println("final score 3 is "
                    + finalScore);
            return finalScore;
        }
        else
            return -1;

    }


}
