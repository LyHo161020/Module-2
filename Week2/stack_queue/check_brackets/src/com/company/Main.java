package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static boolean checkBracket(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char sym = str.charAt(i);
            if (sym == '(') stack.push(sym);
            if (sym == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(checkBracket("s * (s – a) * (s – b) * (s – c)"));
        System.out.println(checkBracket("s * (s – a * (s – b) * (s – c)"));
        System.out.println(checkBracket("s * (s – a) * (s – b) * (s – c)()()"));
        System.out.println(checkBracket("s * (s – a) * (s – b)) * (s – c)()()"));
        System.out.println(checkBracket("s * )(s – a) * (s – b)) * (s – c)()()"));
    }
}
