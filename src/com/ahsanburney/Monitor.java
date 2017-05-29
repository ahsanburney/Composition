package com.ahsanburney;

/**
 * Created by Kulsum on 5/28/2017.
 */
public class Monitor {
    private String model;
    private String maufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String maufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.maufacturer = maufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x,int y, String color){
        System.out.println("Drawing pixel at " +x + ","+ y +" in color "+ color);
    }

    public String getModel() {
        return model;
    }

    public String getMaufacturer() {
        return maufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
