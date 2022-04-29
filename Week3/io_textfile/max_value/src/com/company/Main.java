package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int findMax(List<Integer> numbers){
        int max = 0;
        for (int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) > max){
                max = numbers.get(i);
            }
        }

        return max;
    }

    public static List<Integer> readFile(String fileName) throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        }catch (Exception e){
            System.out.println("File không tồn tại hoặc nội dung có lỗi");
        }
        return numbers;
    }

    public static void writeFile(String fileName, int max) throws IOException {

       try {
           FileWriter fileWriter = new FileWriter(fileName);
           BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
           bufferedWriter.write("Giá trị lớn nhất là: " + max);
           bufferedWriter.close();
       }catch (IOException e){
           e.printStackTrace();
       }
    }

    public static void main(String[] args) throws IOException {
        List numbers = readFile("src/com/company/filetest.txt");
        int max = findMax(numbers);
        writeFile("src/com/company/result.txt",max);
    }
}
