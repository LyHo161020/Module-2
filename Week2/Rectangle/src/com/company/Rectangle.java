package com.company;

import java.util.Scanner;

public class Rectangle {
    double width,height;

    public Rectangle() {
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double GetArea() {
        return this.height * this.width;
    }

    public double GetPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{ width = " + width + ", height = " + height + "}";
    }

    public static void main(String[] args) {
        double width,height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        width = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the height: ");
        height = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Rectangle: " + rectangle.display());
        System.out.println("Area of Rectangle: " + rectangle.GetArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.GetPerimeter());
    }
}
