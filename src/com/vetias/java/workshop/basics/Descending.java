package src.com.vetias.java.workshop.basics;
import java.util.Arrays;
import java.util.Collections;

public class Descending {
    public static void main(String[] args) {
        Double[] price={87.89, 56.65, 31.2, 78.9, 65.43};
        System.out.println("Arrays before sorting: " + Arrays.toString(price));
        Arrays.sort(price, Collections.reverseOrder());
        System.out.println("Arrays after sorting: "+Arrays.toString(price));
    }
}
