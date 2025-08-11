import java.util.*;

public class OccurrencesForEach {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] nums = ArrayUtility.inputArray();
        System.out.print("enter the number you want to search: ");
        int element = sc.nextInt();
        int occ = countOccurrences(nums, element);
        System.out.println("your element was found: "+ occ + " times");
    }
    public static int countOccurrences(int[] nums, int element){
        int occ = 0;
        for (int num : nums){
            if (num == element) {
                occ++;
            }
        }
        return occ;
    }
}
