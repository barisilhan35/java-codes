package com.baris;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    // this is resolution:
    private Resolution resolution; // this will class later

    public Monitor(String model, String manufacturer,
                   int size, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.resolution = resolution;
    }

    //2 create public method
    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x +
                "," + y + " in colour " + color);
    }

    // 3 create getter
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
