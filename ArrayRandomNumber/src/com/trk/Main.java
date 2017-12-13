package com.trk;

import java.util.Scanner;
import java.util.Random;

public class Main {
    private static Scanner scanner
            = new Scanner(System.in);

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random randomNo = new Random();

	int yedek,kacSayi,sayilar[];
        System.out.println("kac sayi uretilsin");
        kacSayi = scanner.nextInt();

        sayilar = new int[kacSayi];
// 0 - 100 arası sayi uret:
        for (int i = 0;i<kacSayi;i++) {
            sayilar[i]= randomNo.nextInt(100) +1; //0 haric
        }
        System.out.println(" space "); // \n
        System.out.println("\n siralanmamis dizi");
        //ekrana yazdir:
        for (int i = 0;i<kacSayi;i++) {
            System.out.print(sayilar[i] + "-");
        }

        //bubble sort sıralama
        for (int j = 1; j < kacSayi;j++) {
            for (int i = 0; j< kacSayi-j;j++) {
                if(sayilar[i]>sayilar[i+1]) {
                    yedek = sayilar[i];
                    sayilar[i] = sayilar[i+1];
                    sayilar[i+1] = yedek;
                }
            }
        }

        System.out.println("\n siralanmis dizi");
        //ekrana yazdir:
        for (int i = 0;i<kacSayi;i++) {
            System.out.print(sayilar[i] + "-");
        }
    }
}
