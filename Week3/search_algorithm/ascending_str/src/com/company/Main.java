package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";

       do {
           System.out.print("Nhập chuỗi: ");
           str = scanner.nextLine();

           System.out.print(str.charAt(0));
           for(int i = 1; i < str.length() - 1; i++){
               if((int) str.charAt(i) > (int) str.charAt(i - 1) && str.charAt(i) != str.charAt(0)){
                   System.out.print(str.charAt(i));
               }
           }
           System.out.println();
       }while (str != "quit");
    }
}
