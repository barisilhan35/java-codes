package com.trk;
// recursive fonksiyons call itself many times recursively
public class Main {

    public static int fib(int n) {
        if (n==1)
            return 1;
        if (n==0)
            return 1;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
	/* write your code here
        int toplam = 0;
        for (int i=0;i<10;i++) {
            toplam +=i+1; //1den 10a sayıların toplamı
            System.out.println(toplam +" i: " +i);
        } // her dongu recursive fonk olarak yazılabilir.
        // recursive/iterative mantiği
        System.out.println(toplam);
        System.out.println(f(0));*/
        for (int i=0;i<10;i++) {
        System.out.println(fib(i));}

    }
}
