package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter the choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    for (int i = 0; i <= 3; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.printf("%s\t", "*");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.printf("%s\t", "*");
                        }
                        System.out.printf("\n");
                    }
                    System.out.printf("\n");

                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.printf("%s\t", "*");
                        }
                        System.out.printf("\n");
                    }
                    System.out.printf("\n");

                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j >= i) {
                                System.out.printf("%s\t", "*");
                            } else {
                                System.out.printf("\t");
                            }
                        }
                        System.out.printf("\n");
                    }
                    System.out.printf("\n");

                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= 5; j++) {
                            if (j >= i) {
                                System.out.printf("%s\t", "*");
                            } else {
                                System.out.printf("\t");
                            }
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 3:
                    for (int i = 0; i <= 6; i++) {
                        for (int space = 7 - i; space >= 1; space--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i * 2 + 1; j++) {
                            System.out.printf("%s", "*");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }

        } while (choice != 0);
    }
}
