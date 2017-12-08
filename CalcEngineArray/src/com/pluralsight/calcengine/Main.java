package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {

        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d}; //array
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d}; //array
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

//        double val1 = 100.0d; // 100 vererek initialize etmeliyiz
//        double val2 = 50.0d; // 50 vererek initialize etmeliyiz
//        double result;

//       char opCode;

        for (int i = 0; i < opCodes.length; i++) {

//            opCodes = ''; // initialize etmeliyiz

            if (opCodes[i] == 'a')

                results[i] = leftVals[i] + rightVals[i];
            else if (opCodes[i] == 's')
                results[i] = leftVals[i] - rightVals[i];
            else if (opCodes[i] == 'd')
            /*if (val2 != 0.0d)
            result = val1 / val2;
            else
                result = 0.0d;*/
                // ustteki kisim ile asagidaki satir ayni; ":" otherwise "?" if
                results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
            else if (opCodes[i] == 'm')
                results[i] = leftVals[i] * rightVals[i];
            else {
                System.out.println("error: invalid opcode"); // bu satırı ekleyince block statement oldu { koymazsak 0.0 döner
                results[i] = 0.0d; // resulti initialize ettik
            }
        }

        for (double theresult : results) {// for each loop
            System.out.print("result equals ");
            System.out.println(theresult);
        }
    }
}
