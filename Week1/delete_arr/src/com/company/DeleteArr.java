package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArr {

    public static void main(String[] args) {
        int size, element, number, index = 0, i;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.print("Nhap so phan tu cua mang( nhap -1 de thoat): ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 1) {
                int[] arr = new int[size];
                for (int j = 0; j < size; j++) {
                    System.out.println("Nhap phan tu thu " + (j + 1) + " : ");
                    element = Integer.parseInt(scanner.nextLine());
                    arr[j] = element;
                }
                System.out.println(Arrays.toString(arr));

                System.out.print("nhap phan tu xoa: ");
                number = Integer.parseInt(scanner.nextLine());
                System.out.println(number);

                for (i = 0; i < size; i++) {
                    if (arr[i] == number) {
                        index = i;
                        break;
                    }
                }

                System.out.println(index);

                if (i == size) {
                    System.out.println("Khong ton tai phan tu " + number + " trong mang!");
                    System.out.println(Arrays.toString(arr));
                }

                int[] newarr = new int[size - 1];
                for (int k = 0, l = 0; k < size; k++) {
                    if (k == index) {
                        continue;
                    }
                    newarr[l] = arr[k];
                    l++;
                }

                System.out.println(Arrays.toString(newarr));
            } else if (size < 1 && size != -1) {
                System.out.println("Nhap so luong phan tu thich hop!");
            }
        } while (size != -1);


    }
}
