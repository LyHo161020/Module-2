package com.company;

import java.util.Scanner;

public class Main {
    public static void calculate(int x, int y){
        try {
            int d = x / y;
            System.out.println("Tổng là: " + ( x + y));
            System.out.println("Hiệu là: " + ( x - y));
            System.out.println("Tích là: " + ( x * y));
            System.out.println(d);
        }catch (NumberFormatException e){
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập y: ");
        int y = scanner.nextInt();
        calculate(x,y);
    }
}
