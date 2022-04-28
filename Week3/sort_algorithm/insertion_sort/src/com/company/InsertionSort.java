package com.company;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,-2,3,7,-9,6};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
