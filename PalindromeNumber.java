import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the number: ");
        int num = sc.nextInt();
        boolean isPalindrome =isPalindrome(num);
        if (isPalindrome){
            System.out.println("Your number is a Palindrome number");
        }else {
            System.out.println("Your number is not a Palindrome number");
        }

    }
    public static boolean isPalindrome(int num){
        // int reverse = reverse(num);
        // return num == reverse;
        return num == reverse(num);
    }
    public static int reverse(int num){
        int newNum = 0;
        while ( num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
