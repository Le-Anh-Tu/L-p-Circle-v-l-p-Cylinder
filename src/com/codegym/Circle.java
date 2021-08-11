    package com.codegym;

    public class Circle {
        int radius = 1;
        String color = "red";

    public Circle(){}
        public Circle(int radius, String color) {
            this.radius = radius;
            this.color = color;
    }

        public int getRadius() {
            return radius;
        }
        public void setRadius(int radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public double getArea() {
            return radius * radius * Math.PI;
        }
        public double getPerimeter() {
            return (radius * Math.PI) * 2;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

