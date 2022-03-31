package com.company;

import java.util.Scanner;

public class FindMinIndex {

    public static int minValue(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, -1, -2, 7};
        Scanner scanner = new Scanner(System.in);
        int index = minValue(arr);
        System.out.println("Phan tu co gia tri nho nhat trong co chi so la: " + index);
    }
}
