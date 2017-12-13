package com.trk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        int kacSayi = 0;
        int sayilar[] = new int[kacSayi];
        int yedek;
        System.out.println("kac sayı girilecek");
        kacSayi=input.nextInt();

        for (int i=0; i<kacSayi; i++) {
            System.out.println( i +1 + " nolu sayiyi gir");
            sayilar[i]= input.nextInt();
        }

        for (int j = 1; j < kacSayi;j++) {
            for (int i = 0; j< kacSayi-j;j++) {
                if(sayilar[i]>sayilar[i+1]) {
                    yedek = sayilar[i];
                    sayilar[i] = sayilar[i+1];
                    sayilar[i+1] = yedek;
                }
            }
        }
        System.out.println("sıralanmış dizi: ");
        System.out.println("\n\n");

        for (int i = 0; i<kacSayi; i++) {
            System.out.print(sayilar[i] + " - ");
        }
    }
}
