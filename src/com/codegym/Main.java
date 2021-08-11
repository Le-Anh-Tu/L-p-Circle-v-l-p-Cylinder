package com.codegym;

public class Main {

    public static void main(String[] args) {
	Circle circle = new Circle(5,"black");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(3,4,5,"white");
        System.out.println(cylinder);
        System.out.println(cylinder.getArea());
    }
}
