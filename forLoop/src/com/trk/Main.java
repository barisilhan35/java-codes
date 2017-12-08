package com.trk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sSayisi;

        System.out.println("enter satir sayisi");
        sSayisi = input.nextInt();

        for (int i =1; i<=sSayisi; i++) {
            /*for (int k=0; k<i; k++) {
                System.out.print("*"); //dik ucgen yapar
            }
            System.out.println();//alt satıra gecer
            */

            for (int k = 0; k<sSayisi-i; k++) {
                System.out.print(" ");
            }
            for (int m=0; m<2*i-1; m++); {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i =sSayisi-1; i>0; i--) {
            /*for (int k=0; k<i; k++) {
                System.out.print("*"); //dik ucgen yapar
            }
            System.out.println();//alt satıra gecer
            */

            for (int k = 0; k<sSayisi-i; k++) {
                System.out.print(" ");
            }
            for (int m=0; m<2*i-1; m++); {
                System.out.print("*");
            }

            System.out.println();
        }



    }
}
