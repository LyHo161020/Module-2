package com.company;

public class Main {

    public static void main(String[] args) {
	    Student student = new Student();
        System.out.println(student.toString());
        student.setName("Ly");
        student.setClasses("CO222H1");
        System.out.println(student.toString());
    }
}
