package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Test Point2D
	    Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D.setX(3);
        point2D.setY(5);
        System.out.println(point2D);
        point2D.setXY(7,5.5);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));

//        Test Point3D
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D.setXYZ(1.2,6.3,4.5);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);
    }
}
