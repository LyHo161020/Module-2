package com.company;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        int size;
        double element, max = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap kich thuoc cua mang( nhap -1 de thoat):");
            size = Integer.parseInt(scanner.nextLine());

            if (size > 0) {
                double[] arr = new double[size];
                for (int i = 0; i < size; i++) {
                    System.out.println("Nhap phan thu thu " + (i + 1) + ": ");
                    element = Double.parseDouble(scanner.nextLine());
                    arr[i] = element;
                }

                for (int i = 0; i < size; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
                System.out.println("Gia tri cua phan tu lon nhat trong mang la: " + max);
            } else if (size < 0 && size != -1) {
                System.out.println("So phan tu cua mang phai la mot gia tri duong");
            }

        } while (size != -1);


    }
}

