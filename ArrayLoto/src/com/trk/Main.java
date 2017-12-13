package com.trk;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random randomNo = new Random();
        int yedek,kacSayi,sayilar[],j=0;
        boolean kontrol=true;
        kacSayi =6;
        sayilar = new int[kacSayi];

        for(int i=0; i<6; i++) {
            sayilar[i] = 0; // 0 atamanın sebebi ilk deger 0
        }

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

        System.out.println("\n siralanmamis dizi");
        //ekrana yazdir:
        for (int i = 0;i<kacSayi;i++) {
            System.out.print(sayilar[i] + "-");
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

        System.out.println("\n siralanmis dizi");
        //ekrana yazdir:
        for (int i = 0;i<kacSayi;i++) {
            System.out.print(sayilar[i] + "-");
        }
    }
}
