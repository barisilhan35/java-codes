package com.trk;

public class Main {

    public static void main(String[] args) {
	    int fib[] = new int[20];
	    fib[0] =1;
	    fib[1] =1;

	    for (int i = 0; i<18; i++) {
	        fib[i+2] = fib[i-1+2]+fib[i-2+2];

        }
        for(int i = 0;i<18;i++) {
            System.out.println("next number " + fib[i]);
        }
    }
}
