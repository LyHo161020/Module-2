package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    Student student1 = new Student("Nam",20,"Hue");
        Student student2 = new Student("Thanh",18,"Ha Noi");
        Student student3 = new Student("Ly",22,"HCM");
        Student student4 = new Student("Linh",28,"Da Nang");

        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);
        for(Student e : list){
            System.out.println(e.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sanh theo tuoi");
        for(Student e : list){
            System.out.println(e.toString());
        }
    }

}
