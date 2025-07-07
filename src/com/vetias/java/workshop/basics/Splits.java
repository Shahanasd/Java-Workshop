package src.com.vetias.java.workshop.basics;

public class Splits {
    public static void main(String[] args) {
        String str="This program shows how can we split a string into multiple parts";
        String words[]=str.split(" ");
        System.out.println(words.length);
        for(String word:words){
            System.out.println(word);
        }
    }
}
