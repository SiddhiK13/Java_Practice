import java.util.*;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;
        for (int num: arr) {
            if (max <num){
                max = num;
            }
        }
        System.out.println("maximum number is: " + max);
    }
}
