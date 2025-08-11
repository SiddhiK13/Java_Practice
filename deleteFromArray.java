import java.util.*;

public class deleteFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("enter the number you want to delete: ");
        int numToDelete = sc.nextInt();
        int[] newArr = deleteNumber(numArr,numToDelete);
        System.out.println("here is your new array: ");
        ArrayUtility.displayArray(newArr);

    }
    public static int[] deleteNumber(int[] numArr , int numToDelete){
        int occ = OccurencesArray.noOfOccurrences(numArr, numToDelete);
        if(occ == 0){
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < numArr.length){
            if (numArr[i] != numToDelete){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
