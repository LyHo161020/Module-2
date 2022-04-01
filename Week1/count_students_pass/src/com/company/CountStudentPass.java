package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CountStudentPass {

    public static void main(String[] args) {
        int size,count = 0;
        double mark;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        size = Integer.parseInt(scanner.nextLine());

        double[] arr = new double[size];
        if(size > 30) {
            System.out.println("Kich thuoc khong duoc vuot qua 30");
        } else {
            for(int i = 0; i < size; i++) {
                System.out.print("Nhap diem cua hoc sinh thu " + (i + 1) + ": ");
                mark = Double.parseDouble(scanner.nextLine());
                if(0 < mark && mark <= 10) {
                arr[i] = mark;
                }else {
                    System.out.println("Diem nhap khong hop le!");
                }
            }
            System.out.println(Arrays.toString(arr));

            for(int i = 0; i < size; i++) {
               if(arr[i] >= 5) {
                   count++;
               }
            }

            System.out.println("So sinh vien thi dau la: " + count);
        }
    }
}
