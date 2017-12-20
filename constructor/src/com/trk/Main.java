package com.trk;

class insan { //its not public
    int boy;
    int yas;
    int kilo;
    public insan() {
        // this is a constructor to use default
        System.out.println("this is a constructor");
        // constructor class ile ayni isimlidir
        // ve return typei yoktur
        System.out.println("bir insan objesi olusturuldu");

        // en cok initialize etmek için kullanilir:
        yas = 1;
    }
    // bir constructor daha yaratılabilir:
    //bu polymorphism yapısıdır
    public insan(int yas, int kilo, int boy) {
        //polymorphism
        this(); //!!!***default constructorı yukarıdaki cagırr
        this.yas = yas;
        this.kilo = kilo;
        this.boy = boy;
        // this kelimesi int yas taki asil yas değişkenindeki yaştır
        System.out.println("polymorphism");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        insan ali = new insan(); // default constructor
        // insan tipinde ali objesi
        ali.boy=180;
        ali.kilo=80;
        insan baris = new insan(25,81,170);

        System.out.println(ali.boy);
        System.out.println(baris.boy);

    }
}
