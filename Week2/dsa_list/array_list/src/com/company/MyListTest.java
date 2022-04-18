package com.company;

import java.util.ArrayList;

public class MyListTest {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(2);
        list.add(1,3);
        list.add(2,7);
        list.add(1,4);
        list.add(2,5);
//        list.add(2);
//        list.add(2);
//        list.add(2);
//        list.add(2);
//        list.add(2);
//        list.add(2);
        list.remove(2);
        System.out.println(list.size());
        System.out.println(list.clone());
//        System.out.println(list.contains(5));
//        System.out.println(list.indexOf(6));
        System.out.println(list.get(-2));
        System.out.println(list);
        System.out.println(list.clear());
    }
}
