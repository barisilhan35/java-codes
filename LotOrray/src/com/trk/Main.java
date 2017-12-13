package com.trk;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random randomNo = new Random();
        Scanner scanner = new Scanner(System.in);
        int yedek,kacSayi,sayilar[],j, kolon;
        boolean kontrol=true;
        kacSayi =6;
        sayilar = new int[kacSayi];

        System.out.println("Kac kolon?");
        kolon = scanner.nextInt();

        for(int z=0; z<kolon;z++) {
            for(int i=0; i<6; i++) {
                sayilar[i] = 0; // 0 atamanın sebebi ilk deger 0
            }
            j=0;
            while(j<6) {
                yedek=randomNo.nextInt(49)+1;
                kontrol = true;
                for(int i=0; i<6; i++) {
                    if(sayilar[i] == yedek) {
                        kontrol = false;
                    }
                }
                if(kontrol) { // trueysa
                    sayilar[j] = yedek;
                    j++;
                }
            }

            //bubble sort sıralama
            for (int k = 1; k < kacSayi;k++) {
                for (int i = 0; i< kacSayi-k;i++) {
                    if(sayilar[i]>sayilar[i+1]) {
                        yedek = sayilar[i];
                        sayilar[i] = sayilar[i+1];
                        sayilar[i+1] = yedek;
                    }
                }
            }
            System.out.println();
            System.out.println(z + 1 + ". kolon sayilari");
            //ekrana yazdir:
            for (int i = 0;i<kacSayi;i++) {
                String w ="-";
                System.out.print(sayilar[i] + w);
            }
            System.out.println();
        }
    }
}
