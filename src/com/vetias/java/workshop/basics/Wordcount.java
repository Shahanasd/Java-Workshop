package src.com.vetias.java.workshop.basics;

public class Wordcount {
    public static void main(String[] args) {
    String str="This program shows how can we spliit a string into multiple parts. We need to find sentence,words and letter count the number of words in a string";
    String dots[]=str.split("\\.");
    String words[]=str.split(" ");
    String letters[]=str.split("");
    System.out.println(dots.length);
    System.out.println(words.length);
    System.out.println(letters.length);
    }
}
