// import java.util.*;
// public class SumOfOdd {
//     public static void main(String[] srgs){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("please enter number N:");
//         int num = sc.nextInt();
//         int sum = OddSum(num);
//         System.out.println("oddsum till " + num +"is " + sum);
//     }

//     public static int OddSum(int num) {
//         int sum = 0;
//         int i = 1;
//         while(i <= num ) {
//             sum =+ i;
//             i =+ 2;
//         }
//         return sum;
//     }
// }   

    
import java.util.*;

public class SumOfOdd{
    public static void main(String[] args) { 
        Scanner sc =new Scanner(System.in);
        System.out.print("please enter the number: ");
        int num = sc.nextInt();
        int sum = oddSum(num);
        System.out.println("sum of odd numbers is: " + sum );
    }
    public static int oddSum(int num){
        int sum = 0;
        int i = 1;
        while (i <= num ){
            sum = sum+ i;
            i =+ 1;
        }
        return sum;
    }
}