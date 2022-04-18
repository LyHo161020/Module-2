package com.company;

import java.util.ArrayList;

public class MyListTest {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(9);

//        TH1
        System.out.println("Element 4: " + list.get(4));
        System.out.println("Element 2: " + list.get(2));
        System.out.println("Element 1: " + list.get(1));

//        TH2
        System.out.println("Element 5: " + list.get(5));
        System.out.println("Element -1: " + list.get(-1));
    }
}
