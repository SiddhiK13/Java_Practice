import java.util.*;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the number: ");
        int num = sc.nextInt();
        boolean isArmstrong =isArmstrong(num);
        //System.out.println(isArmstrong);
        if(isArmstrong){
            System.out.println("your number is Armstrong number");
        }else {
            System.out.println("your number is not Armstrong number");
        }
    }
    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        //System.out.println("No Of Digits: "+ noOfDigits);
        int finalNumber = 0;
        while (num > 0){
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, noOfDigits);
        }
        //System.out.println("final number is " + finalNumber);
        return finalNumber == numCopy;
    }
    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while( i< num2){
            result *= num1;
            i++;
        }
       // System.out.println("power of " + num1 + " is " + result);
        return result;
    }
    public static int noOfDigits(int num){
        int digits = 0;
        while(num > 0){
            digits++;
            num = num /10;
        }
        return digits;
    }
}
