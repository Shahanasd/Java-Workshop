import java.util.Arrays;

public class Ascending{
    public static void main(String[] args) {
        float[] price={87.89f,56.65f,31.2f,78.9f,65.43f};
        System.out.println("Arrays before sorting:"+Arrays.toString(price));
        Arrays.sort(price);
        System.out.println("Arrays after sorting in ascending order:"+Arrays.toString(price));
    }
}