package com.company;

import java.util.LinkedList;

public class MyStack<E> {
    private LinkedList<E> stack;

    public MyStack(){
        stack = new LinkedList<>();
    }

    public void push(E e){
        stack.addLast(e);
    }

    public E pop(){
        E e = stack.get(stack.size()- 1);
        stack.remove(stack.size() - 1);
        return e;
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if(stack.size() != 0){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String str = "[";
        int count = 1;
        for (int i = 0; i < stack.size(); i++){
            if(count != stack.size()){
                str += stack.get(i) + ",";
            }else{
                str += stack.get(i);
            }
            count++;
        }
        return str + "]";
    }
}
