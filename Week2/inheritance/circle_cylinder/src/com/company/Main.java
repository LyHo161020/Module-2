package com.company;

public class Main {

    public static void main(String[] args) {
//        Test Circle
        Circle circle = new Circle(4.5);
        System.out.println("Area Circle: " + circle.getArea());
        System.out.println("Color Circle: " + circle.getColor());
        System.out.println("Perimeter Circle: " + circle.getPerimeter());
        circle.setColor("yellow");
        System.out.println(circle);

//        Test Cylinder
        Cylinder cylinder = new Cylinder(3.5,2.6);
        System.out.println("Area Cylinder: " + cylinder.getArea());
        System.out.println("Perimeter Cylinder: " + cylinder.getPerimeter());
        System.out.println("Volume Cylinder: " + cylinder.getVolume());
        cylinder.setColor("red");
        System.out.println(cylinder);
    }
}
