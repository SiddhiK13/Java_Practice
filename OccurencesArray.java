import java.util.*;

public class OccurencesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numArr = ArrayUtility.inputArray();
        System.out.println("enter the number you want to search:");
        int num = sc.nextInt();
        int occurrences = noOfOccurrences(numArr, num);
        System.out.println("your element is found " + occurrences + " times in the array"); 
    }
    public static int noOfOccurrences(int[] numArr, int num){
        int occ = 0;
        int i = 0;
        while(i < numArr.length){
            if (numArr[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
