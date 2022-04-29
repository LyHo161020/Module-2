package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/com/company/filetest.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("src/com/company/result.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String line = "";

        while ((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
