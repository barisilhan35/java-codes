package com.trk;

class insan {
    int boy;
}
class ogrenci extends insan implements Cloneable{
    Object kopyala() throws CloneNotSupportedException {
        return this.clone();
    }
    ogrenci kopyala2() {
        ogrenci temp = new ogrenci();
        temp.boy = this.boy;
        return temp;
    }
    boolean equals(ogrenci rhs) {
        //if(this.boy == rhs.boy) {
          //  return true;
        //}
        //else {
          //  return false;
        //}
        return this.boy == rhs.boy;
    }

    //override tostring
    public String toString() {
        return "object boy" +this.boy;
    }
}

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	    insan ali = new insan();
	    // object ali is created
        //insan baris; // Null. not object. object referrer
        //baris.boy = 180; hata verir
        insan baris = ali; // shallow copy

        if(ali.equals(baris)) {
            System.out.println("esitler");
        }

        ogrenci a = new ogrenci();
        a.boy = 160;
        // deep copy
        ogrenci b = (ogrenci) a.kopyala(); // type casting
        System.out.println(b.boy);
        b.boy = 150;

        System.out.println(baris); //com.trk.insan@4d687dcd

        System.out.println(baris.hashCode()); //1298693581

        System.out.println(baris.toString());

    }

}
