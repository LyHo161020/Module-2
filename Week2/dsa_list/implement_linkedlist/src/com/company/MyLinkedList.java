package com.company;

import java.util.Iterator;

import static java.util.Spliterators.iterator;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, E e) {
       if(index >= numNodes || index < 0){
           System.out.println("Index invalid!");
       }else{
           Node temp = head;
           Node holder;

           for (int i = 0; i < index - 1 && temp.next != null; i++) {
               temp = temp.next;
           }

           holder = temp.next;
           temp.next = new Node(e);
           temp.next.next = holder;
           numNodes++;
       }
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        if (numNodes == 0) {
            head = new Node(e);
            numNodes++;
            return;
        }

        Node temp = head;
        Node holder;

        for (int i = 0; i < numNodes - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNodes++;
    }

    public Node get(int index) {
        if(index >= numNodes || index < 0){
            System.out.println("Index invalid!");
        }else{
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }
        return null;
    }

    public void removeAtElement(E e) {
        Node temp = head;
        boolean flag = true;
        int i;
        for (i = 0; i < numNodes; i++) {
            if (temp.data.equals(e)) {
                remove(i);
            }
            temp = temp.next;
        }

        if (i == numNodes) {
            flag = false;
        }

        if (!flag) {
            System.out.println("Phần tử không tồn tại trong mảng!");
        }
    }

    public void remove(int index) {
        if (index >= numNodes || index < 0) {
            System.out.println("Index invalid!");
        } else {
            Node temp = head;
            Node holder;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            holder = temp.next.next;
            temp.next = holder;
            numNodes--;
        }
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList clone() {
        MyLinkedList newList = new MyLinkedList<>();
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            newList.addLast(temp.data);
            temp = temp.next;
        }
        return newList;
    }

    public boolean contains(E e) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(e)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E e) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(e)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public Node getFirst() {
        if (numNodes != 0) {
            return head;
        } else {
            return null;
        }
    }

    public Node getLast() {
        if (numNodes == 0) {
            return null;
        } else {
            Node temp = head;
            for (int i = 0; i < numNodes - 1; i++) {
                temp = temp.next;
            }
            return temp;
        }
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    public String printList() {
        Node temp = head;
        int count = 0;
        String str = "[";
        while (temp != null) {
            if (count != numNodes - 1) {
                str += temp.data + ",";
            } else {
                str += temp.data;
            }
            temp = temp.next;
            count++;
        }
        return str + "]";
    }


    public class Node {
        private Node next;
        private Node pre;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public Node getPre() {
            return pre;
        }

        public String toString() {
            return "" + data;
        }
    }
}
