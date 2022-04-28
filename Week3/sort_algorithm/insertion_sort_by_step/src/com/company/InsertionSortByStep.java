package com.company;

import java.util.Arrays;

public class InsertionSortByStep {
    public static void insertionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key){
                System.out.println("Gán arr[" + (j + 1)  + "] = " + arr[j]);
                arr[j + 1] = arr[j];
                System.out.println(Arrays.toString(arr));
                j--;
            }
            arr[j + 1] = key;
            System.out.println("Mảng sau vòng lặp thứ " + ( i + 1 ) + ": " + Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {4,5,-2,3,7,-9,6};
        insertionSort(arr);
    }
}
