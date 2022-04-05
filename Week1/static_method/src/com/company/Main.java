package com.company;

public class Main {

    public static void main(String[] args) {
	    Student.change();

        Student s1 = new Student(111, "Ly");
        Student s2 = new Student(222,"Huy");
        Student s3 = new Student(333,"Thao");

        s1.display();
        s2.display();
        s3.display();
    }
}
