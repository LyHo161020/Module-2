package com.company;

import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
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

        if(str.equals(result)){
            System.out.println("Chuỗi Palindrome!");
        }else {
            System.out.println("Không phải chuỗi Palindrome!");
        }
    }
}
