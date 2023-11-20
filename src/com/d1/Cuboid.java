package com.d1;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double height, double width, double length) {
        super(length, width);

        if (height < 0.0) {
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return getLength() * getWidth() * getHeight();
    }
}
