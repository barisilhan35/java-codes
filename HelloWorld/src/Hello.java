public class Hello {
    public static void main(String[] args) {
        System.out.println("hellou");

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L *(byteValue+shortValue+intValue);

        short shortTotal = (short) (1000 + 10 *(byteValue+shortValue+intValue));

        System.out.println("longtotal = " + longTotal);
        System.out.println("shorttotal = " + shortTotal);

        float myFloatValue = (float) 5.4; // floata cast ettik
        double myDoubleValue = 2.2;

        double numPounds = 200d;
        double convertedKilogram = numPounds * 0.45359237d;

        System.out.println("kilograms= " + convertedKilogram);

        char myChar = '\u00A9'; //unicode
        System.out.println(myChar);

        char registeredSymbol = '\u00AE';
        System.out.println(registeredSymbol);

        String myString= "this is a string";
        System.out.println("print " + myString);
        System.out.print(myString);

        myString = myString + ", hahfagsg.";
        System.out.println("atla");
        System.out.println("print " + myString);

        String numberString = "250.55";
        numberString = numberString +"49.45"+ "2.5";
        System.out.println("result = " + numberString); //returns result = 250.5549.452.5

        int myInt = 50;
        String lastString = "10";

        lastString = lastString + myInt;

        System.out.println(lastString); // returns 1050 :(

        String strr = "3==)";

        lastString = lastString + strr;
        System.out.println(lastString);

        int result1 = 1+2;
        int prevResult1 = result1;

        result1 = result1 -1 ;
        System.out.println(prevResult1 + " -1 = " + result1);

        prevResult1 = result1;
        result1 = 10*result1;
        System.out.println(prevResult1 + " x 10 = " + result1);

        result1 = 4;
        result1 ++;
        System.out.println(result1);
        result1--;
        result1 +=2; //2 ekle
        result1 -=1; // 1 cikar

        boolean isAlien = false;
        if (isAlien == false) //!!!!!==!!!!!!!
            System.out.println("could be human");

        /*
        ternary operator
         */
        boolean isCar= true;
        boolean wasCar = isCar ? true:false;
        if(wasCar ==isCar)
            System.out.println("true car");

        double d1= 20d;
        double d2 = 80;
        double dResult = (d1+d2)* 25;
        double reminder = dResult % 40; // % means reminder operator
        System.out.println(dResult);

        if (reminder <= 20)
            System.out.println(reminder + "dResult is over limit");

    }
}
