import java.util.*;

public class ReverseTheDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a number:");
        int num = sc.nextInt();
        int Reverse = reverse(num);
        System.out.println("the Reverse of your number is: " + Reverse);
    }
    public static int reverse(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }
}
