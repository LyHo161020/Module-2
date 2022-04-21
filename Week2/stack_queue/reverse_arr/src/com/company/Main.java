package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int size,element;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        size = Integer.parseInt(scanner.nextLine());

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < size; i++){
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            element = Integer.parseInt(scanner.nextLine());
            stack.push(element);
        }
        System.out.println(stack);

        Stack<Integer> newStack = new Stack<>();

        for(int i = 0; i < size; i++){
            newStack.push(stack.pop());
        }

        System.out.println(newStack);

    }
}
