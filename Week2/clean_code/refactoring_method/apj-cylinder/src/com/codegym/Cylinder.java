package com.codegym;


public class Cylinder {
    public static double getArea(int radius){
        return Math.PI * radius * radius;
    }

    public static double getPerimeter(int radius){
        return 2 * Math.PI * radius;
    }

    public static double getVolume(int radius, int height){
        return getPerimeter(radius) * height + 2 * getArea(radius);
    }
}
