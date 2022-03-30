package com.company;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap can nang cua ban(kilogram):");
        weight = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhap chieu cao cua ban(metter):");
        height = Double.parseDouble((scanner.nextLine()));

        bmi = weight / (height * height);
        System.out.println("Chi so BMI cua ban la: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Thieu can!");
        } else if (bmi < 25) {
            System.out.println("Binh thuong!");
        } else if (bmi < 30) {
            System.out.println("Thua can!");
        } else System.out.println("Beo phi");

    }
}

