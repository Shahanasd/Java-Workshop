package src.com.vetias.java.workshop.basics1;
import java.util.Arrays;
import java.util.Collections;

import src.com.vetias.java.workshop.tempdata.Strings;

public class Descending {
    public static void main(Strings[] args) {
        Double[] price={87.89, 56.65, 31.2, 78.9, 65.43};
        System.out.println("Arrays before sorting: " + Arrays.toString(price));
        Arrays.sort(price, Collections.reverseOrder());
        System.out.println("Arrays after sorting: "+Arrays.toString(price));
    }
}
