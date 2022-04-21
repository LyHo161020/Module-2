package com.company;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int input, temp, status;



        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số cần đổi: ");
            input = Integer.parseInt(scanner.nextLine());
            do {
                temp = input;
                input = input / 2;
                status = temp % 2;
                stack.push(status);
            } while (input != 0);

            for (int i = stack.size() - 1; i >= 0; i--) {
                System.out.print(stack.get(i));
            }
            System.out.println();
        } while (input != -1);
    }

}
