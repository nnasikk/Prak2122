package com.company;

public class MultifunctionalChair implements Chair{
    int high;
    int width;

    public MultifunctionalChair(int high, int width) {
        this.high = high;
        this.width = width;
    }

    @Override
    public String toString() {
        return "MultifunctionalChair{" +
                "high=" + high +
                ", width=" + width +
                '}';
    }
}
