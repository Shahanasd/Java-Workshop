package com.vetias.java.workshop.standardlibs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filehandlingeg {
    public static void main(String[] args) {
        try(BufferedReader reader=new BufferedReader(new FileReader("README.md"))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
        
    }
}
