package com.company;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius ,  double height) {
        super(radius);
        this.height = height;
    }

    public void setHeight(double height) {
        if ( height > 0) {
            this.height = height;
        } else {
            System.out.println("Chieu cao khong hop le!");
        }
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getPerimeter() {
        System.out.println("Khong hop le!");
        return -1;
    }

    @Override
    public double getArea() {
        return 2 *super.getArea() + super.getPerimeter() * height ;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{radius= " + super.getRadius() + ", color='" + super.getColor() +
                "', height=" + height +
                '}';
    }
}
