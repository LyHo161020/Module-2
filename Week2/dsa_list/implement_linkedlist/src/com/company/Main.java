package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addLast(4);
        list.addFirst(2);
        list.addLast(5);
        list.addFirst(7);
        list.remove(4);
        list.removeAtElement(9);
        System.out.println(list.printList());

        System.out.println(list.contains(8));
        System.out.println(list.indexOf(5));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
//        list.clear();
        System.out.println(list.printList());
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.add(-1,3);

//        MyLinkedList<Integer> list1 = list.clone();
//        System.out.println(list1.printList());

//        LinkedList<Integer> list1 = new LinkedList<>();
//        list1.add(3);
//        list1.add(5);
//        System.out.println(list1.toString());
//        list1.get(2);
//        list1.remove(2);
//        list1.remove((Integer) 2);

//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(2);
    }
}
