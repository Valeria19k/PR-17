package com.company;

import java.io.*;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class File {
    static String FileName;

    public File(String FileName) {
        this.FileName = FileName;
    }

    public static void main(String[] args) {
        File myFile = new File("record.txt");
        myFile.write();
        myFile.read();
        myFile.write();
    }

    public void read() {
        try {
            FileReader filereader = new FileReader(FileName);
            BufferedReader reader = new BufferedReader(filereader);
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
    
    public void write() {

        try {
            Scanner a = new Scanner(System.in);
            String text = a.nextLine();
            FileWriter writer = new FileWriter(FileName);
            writer.write(text);
            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
