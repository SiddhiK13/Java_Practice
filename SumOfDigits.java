//sum of digits of an integer

// import java.util.*;

// public class SumOfDigits {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("please enter a number:");
//         int num =sc.nextInt();
//         int sum = SumOfDigits(num);
//         System.out.println("the sum of digits is:" + sum);
//     }
//     public static int SumOfDigits(int num){
//         int sum = 0;
//         while(num > 0){
//             sum = sum + (num % 10);
//             num = num/10;
//         }
//         return sum;
//     }
// }

import java.util.*;

public class SumOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        int sum = sumofdigits(num);
        System.out.println("the sum of digits is:" + sum);
    }
    public static int sumofdigits(int num){
        int sum = 0;
        while (num > 0){
            sum = sum + (num % 10);
            num =num / 10;
        }
        return sum;
    }
}