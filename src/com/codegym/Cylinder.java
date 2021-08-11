package com.codegym;

public class Cylinder extends Circle {
    private double volume = 2.00;
    private  double height = 2.00;

   public Cylinder() {}

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    public Cylinder(double volume, double height) {
        this.volume = volume;
        this.height = height;

    }
    public Cylinder(double volume, double height, int radius, String color) {
        super(radius, color);
        this.volume = volume;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", volume=" + volume +
                ", height=" + height +
                '}';
    }
}
