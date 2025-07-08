package src.com.vetias.java.workshop.basics;
public class SingleLinePrint {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String str1 = "Java";
        String str2 = "Programming";
        String str3 = "is fun!";

        sb.append(str1);
        sb.append(" "); // Add a space
        sb.append(str2);
        sb.append(" "); // Add another space
        sb.append(str3);

        System.out.println(sb.toString());
    }
}