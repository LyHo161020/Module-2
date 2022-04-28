package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int[] createRandom(){
        Random random = new Random();
        int[] arr = new int[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++){
            arr[i] = random.nextInt(100);
            System.out.printf("%d\t",arr[i]);
        }
        System.out.println();
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = createRandom();
        System.out.println("Nhập chỉ số của phần tử muốn truy xuất: ");
        int index = Integer.parseInt(scanner.nextLine());
        try{
            System.out.println("Giá trị của phần tử thứ " + ( index + 1 ) + " là: " + arr[index]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Chỉ số không phù hợp!");
        }
    }
}
