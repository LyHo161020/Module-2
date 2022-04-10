package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double side1,side2,side3;
        String color;
        boolean filled;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài 3 cạnh của tam giác: ");
        side1 = Double.parseDouble(scanner.nextLine());
        side2 = Double.parseDouble(scanner.nextLine());
        side3 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập màu sắc của tam giác: ");
        color = scanner.nextLine();
        System.out.print("Có tô màu cho tam giác không( true / false)? ");
        filled = scanner.nextBoolean();
        Triangle triangle = new Triangle(color,filled,side1,side2,side3);
        System.out.println("Diện tích: " + triangle.getArea());
        System.out.println("Chu vi: " + triangle.getPerimeter());
        System.out.println(triangle);

//        triangle.setSide(1,2,3);
//        System.out.println(triangle.getArea());
//        System.out.println(triangle.getPerimeter());
//        System.out.println(triangle);

    }
}
