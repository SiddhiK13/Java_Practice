// import java.util.*;

// public class Factorial {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("please enter a number:");
//         int num = sc.nextInt();
//         long fact =factorial(num);
//         System.out.print("factorial is "+ fact);
//     }

//     public static long factorial(int num){
//         if(num < 2){
//             return 1;
//         }

//         long fact = 1;
//         int i = 2;
//         while (i <= num) {
//             fact *= i;
//             i++;
//         }
//         return fact;
//     }
// }
import java.util.*;

public class Factorial{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("please enter the number: ");
    int num = sc.nextInt();
    long fact = fact(num);
    System.out.println("the factorial of number is:" + fact);
    }
    public static long fact(int num){
        long fact = 1;
        int i = 1;
        while(i <= num){
            fact = fact * i;
            i++;
        }
        return fact;
    }
}