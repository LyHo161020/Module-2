package com.company;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        int input;

        do {
            Stack<Integer> stack = new Stack<>();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số cần đổi: ");
            input = Integer.parseInt(scanner.nextLine());

            do {
                stack.push(input % 2);
                input = input / 2;
            } while (input != 0);

            while (!stack.isEmpty()){
                System.out.print(stack.pop());
            }
            System.out.println();
        } while (input != -1);
    }

}
