package com.vetias.java.workshop.basics;

public class MyStringBuilderExample {
public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("Java").append(0)
      .append("Programming").append(1)
      .append("is fun!").append(2)
      .append("Let's learn together!").append(3);
      String result = sb.toString();
    System.out.println(result);
}
}
