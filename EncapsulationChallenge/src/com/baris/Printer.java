package com.baris;
/* Create a class and demonstate proper encapsulation
techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level,
number of pages printed, and
// also whether its a duplex printer
(capable of printing on both sides of the paper).
// Add methods to fill up the toner
(up to a maximum of 100%), another method to
// simulate printing a page
(which should increase the number of pages printed).
// Decide on the scope, whether to use constructors,
 and anything else you think is needed.
*/
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {

        if(tonerLevel >-1 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if(tonerLevel > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
           // this.tonerLevel = tonerAmount + tonerLevel;
            return tonerLevel;
        }
        else {
            return -1;
        }

    }

    public int printPages(int pages) {
        //int pagesToPrint = pages;
        if(this.isDuplex == true) {
            pages /=2;
            System.out.println("page is duplex");
        }
        else if(this.isDuplex == false){
            pages *=2;
            System.out.println("page is not duplex");
        }
        this.pagesPrinted += pages;
        return pages;
    }
// add getter to retrieve number of page printed
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
