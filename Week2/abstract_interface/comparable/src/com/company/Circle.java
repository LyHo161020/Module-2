package com.company;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;

    public Circle(){
        radius = 1.0;
        color = "green";
        filled = true;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public void setRadius(double radius) {
        if(radius > 0) {
            this.radius = radius;
        }else {
            System.out.println("Bán kính không hợp lệ!");
        }
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
