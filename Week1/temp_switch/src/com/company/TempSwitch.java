package com.company;

import java.util.Scanner;

public class TempSwitch {

    public static void main(String[] args) {
        int choice;
        double tempF,tempC;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter the choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            if(choice != 0) {
                switch (choice) {
                    case 1:
                        System.out.printf("Fahrenheit: ");
                        tempF = Double.parseDouble(scanner.nextLine());
                        System.out.printf("%s%.2f%s%n","Celsius: " , ((5.0 / 9) * (tempF - 32)) , "°C");
                        break;
                    case 2:
                        System.out.print("Celsius: ");
                        tempC = Double.parseDouble(scanner.nextLine());
                        System.out.printf("%s%.2f%s%n","Fahrenheit: " , ((9.0 / 5) * tempC  + 32) , " °F");
                        break;
                    default:
                        System.out.println("No choice!");
                }
            }
        } while (choice != 0);
    }
}
