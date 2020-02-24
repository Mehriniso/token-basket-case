package com.example.demo.utilities;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileIO {

    public static String fileName = "src/main/resources/IdCounter.txt";
//    public static String fileName = "/WEB-INF/classes/IdCounter.txt";
//
    public void writeToFile(Integer pValue) throws IOException {


        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(pValue);
        }
        String content = String.valueOf(pValue);
        Files.write(Paths.get(fileName), content.getBytes());
    }

    public Integer readFromFile() throws IOException {

        Integer result = -1;
        File myObj = new File(fileName);

        Scanner scanner = new Scanner(myObj);
        try{
            while(scanner.hasNext())
            {
                result = scanner.nextInt();
            }
        }
        finally
        {
            scanner.close();
        }
        return result;
    }


}
