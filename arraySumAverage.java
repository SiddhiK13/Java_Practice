import java.util.*;

class arraySumAverage {

    public static void main(String[] args){
        
        int[] numArray = ArrayUtility.inputArray(); 
        long sum = sum(numArray);
        double average = average(numArray);
        System.out.println("sum of the numbers is : " + sum);
        System.out.println("Average of numbers is:" + average);
    }

    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while (i< numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static double  average(int[] numArray){
        double sum = sum(numArray);
        return (sum / numArray.length);
    }
}
