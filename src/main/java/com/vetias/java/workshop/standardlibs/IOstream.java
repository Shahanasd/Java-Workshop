package com.vetias.java.workshop.standardlibs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOstream {
    public static void main(String[] args) {
       try(FileInputStream inputStream=new FileInputStream("Shahana.jpeg");
       FileOutputStream outputStream=new FileOutputStream("sd.jpeg")) {
            byte[] chunk=new byte[1024];
            int bytes;
            while((bytes=inputStream.read(chunk))!=-1){
                outputStream.write(chunk,0,bytes);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}