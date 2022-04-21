package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static Stack<Integer> reverseOfInteger(){
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

        Stack<Integer> newStack = new Stack<>();

        for(int i = 0; i < size; i++){
            newStack.push(stack.pop());
        }
        return newStack;
    }

    public static String reverseOfString(){
        String str;
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.println("Nhập chuỗi: ");
        str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseOfInteger());
        System.out.println(reverseOfString());;
    }
}
