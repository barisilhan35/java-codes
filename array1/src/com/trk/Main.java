package com.trk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] a,b,c;

        a = new int[2];
        //System.out.println(a);

        int z[] = {1,2,3,4,5};
        System.out.println(a[1]);
        System.out.println(z[1]);

        Scanner input = new Scanner(System.in);
        int array[] = new int[5];
        int toplam = 0;
        double ortalama;

// arrayin içine veri girerken for kullanalım
        for (int i = 0; i<5; i++) {
            System.out.println(i+1 + " sayı gir");
            array[i] = input.nextInt();
            //sayıları arraye girdik
        }
        // ekrana yazdırmak icin for:
        for (int i = 0;i<5;i++) {
           // System.out.println(array[i]);
            toplam += array[i]; // toplam + array i

            }
        toplam = toplam / 5;

        System.out.println(toplam);


    }
}
