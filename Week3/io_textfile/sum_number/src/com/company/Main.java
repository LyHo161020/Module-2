package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\hoclaptrinh\\Module2\\Code\\Week3\\io_textfile\\sum_number\\src\\com\\company\\filetesst.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int sum = 0;
        String line = "";

        try{
            while ((line = bufferedReader.readLine()) != null){
                System.out.printf("%s\t",line);
                sum += Integer.parseInt(line);
            }
            System.out.println("\nTổng các số trong file là: " + sum);
        }catch (NumberFormatException e){
            System.out.println("\nDữ liệu trong file đọc được không phải là số");
        }



    }
}
