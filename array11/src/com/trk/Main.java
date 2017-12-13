package com.trk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        int sayiDizisi[],bSayi,diziUzunlugu;

        System.out.println("kac sayı girilecek?");
        diziUzunlugu = input.nextInt();
        while(diziUzunlugu<=0) {
            System.out.println("sayı 0dan buyuk olmali");
            diziUzunlugu = input.nextInt();
        }

        sayiDizisi = new int[diziUzunlugu];

        for (int i=0;i<diziUzunlugu;i++) {
            System.out.println(i + 1 + " nolu sayıyı gir");
            sayiDizisi[i] = input.nextInt();
        }

        bSayi = sayiDizisi[0];

        for (int i = 0; i<diziUzunlugu;i++) {
            if (bSayi<sayiDizisi[i]) { //Example sayı dizisi[1]=6 bSayi=5
                bSayi = sayiDizisi[i];
            }
        }

        System.out.println("en buyuk sayı " + bSayi);
    }
}
