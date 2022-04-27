package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
	  int[] arr = {9,-2,6,7,1,3,8};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
