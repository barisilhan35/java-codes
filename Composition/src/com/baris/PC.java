package com.baris;

public class PC {

    private Case thecase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case thecase, Monitor monitor, Motherboard motherboard) {
        this.thecase = thecase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {

        getThecase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {

        monitor.drawPixelAt(120,50,"yellow");
    }

    public Case getThecase() {
        return thecase;
    }

   /* private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }*/
}
