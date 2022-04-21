package com.company;

public class MyStack {
    private int[] arr;
    private int size;
    private int index = 0;

    public MyStack(int size){
        this.size = size;
        arr = new int[size];
    }

    public boolean ifFull(){
        return index == size;
    }

    public boolean isEmpty(){
        return index == 0;
    }

    public void push(int item){
        if(ifFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = item;
        index++;
    }

    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    public int size(){
        return index;
    }
}
