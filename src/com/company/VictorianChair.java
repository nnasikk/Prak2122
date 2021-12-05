package com.company;

public class VictorianChair {
    int high;
    int width;

    public VictorianChair(int high, int width) {
        this.high = high;
        this.width = width;
    }

    @Override
    public String toString() {
        return "VictorianChair{" +
                "high=" + high +
                ", width=" + width +
                '}';
    }
}
