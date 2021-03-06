package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e){
        if(size > elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void ensureCapa(){
       int newSize = elements.length * 2;
       elements = Arrays.copyOf(elements,newSize);
    }

    public E get(int i){
        if(i >= size || i < 0){
            System.out.println("Index: " + i + ", Size: " + i );
        }
       return (E) elements[i];
    }
}
