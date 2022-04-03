package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        a = Double.parseDouble(scanner.nextLine());
        b = Double.parseDouble(scanner.nextLine());
        c = Double.parseDouble(scanner.nextLine());

        QuadraticEquation equation = new QuadraticEquation(a, b ,c);
        System.out.println("Detla: " + equation.getDiscriminant());

        if(equation.getDiscriminant() > 0){
            System.out.println("Equation has 2 solutions: ");
            System.out.println("x1 = " + equation.getRoot1());
            System.out.println("x2 = " + equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.println("Equation has 1 doulbe solution: ");
            System.out.println("x1 = x2 = " + equation.getRoot1());
        }else {
            System.out.println("Equation has no solutions!");
        }
    }
}
