package com.company;

import java.util.List;
import java.util.Stack;

public class Main {

    public static void stackOfString(){
        MyStack<String> stack = new MyStack<>();
        stack.push("Five");
        stack.push("For");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.println("1.2. Pop elements from stack : ");
        while(!stack.isEmpty()){
            System.out.printf("%s\t",stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }

    public static void stackOfInteger(){
        MyStack<Integer> stack = new MyStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.println("2.2. Pop elements from stack : ");
        while(!stack.isEmpty()){
            System.out.printf("%d\t",stack.pop());
        }
        System.out.println("\n2.3 Size of stack after pop operations : " + stack.size());

    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfInteger();
        System.out.println("\n2. Stack of Strings");
        stackOfString();
    }
}
