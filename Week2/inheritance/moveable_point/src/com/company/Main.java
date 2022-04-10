package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Test Point
	    Point point = new Point();
        System.out.println(point);
        point.setXY(1,2);
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(point);

//        Test MoveablePoint

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint.setXY(2,3);
        moveablePoint.setSpeed(4,5);
        System.out.println(moveablePoint);
        System.out.println(Arrays.toString(moveablePoint.getSpeed()));
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
