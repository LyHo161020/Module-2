package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printList(List<Country> list){
        for(int i = 0; i < list.size(); i++){
            System.out.printf("%-10s %-10s %-10s\n",list.get(i).getId(),list.get(i).getCode(),list.get(i).getName());
        }
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Country> list = new ArrayList<>();
        FileReader fileReader = new FileReader("src/com/company/test.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = "";
        while ((line = bufferedReader.readLine()) != null){
            list.add(new Country(line));
        }

        printList(list);
    }
}
