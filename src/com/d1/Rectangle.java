package com.d1;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        if (length < 0.0 || width < 0.0) {
            this.length = 0;
            this.width = 0;
        }
        else {
            this.length = length;
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double getArea() {
        return length * width;
    }
}
