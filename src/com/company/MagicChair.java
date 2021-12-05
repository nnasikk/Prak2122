package com.company;

public class MagicChair {
    int high;
    int width;

    public MagicChair(int high, int width) {
        this.high = high;
        this.width = width;
    }

    @Override
    public String toString() {
        return "MagicChair{" +
                "high=" + high +
                ", width=" + width +
                '}';
    }
}
