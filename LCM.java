// import java.util.*;

// public class LCM {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("please enter first number: ");
//         int first = sc.nextInt();
//         System.out.print("please enter second number: ");
//         int second = sc.nextInt();
//         int LCM = lcm(first , second);
//         System.out.println("LCM of the two number is: " + LCM);
//     }
//     public static int lcm(int first, int second){
//         int i = 1;
//         while (i <= second) {                          //while(true)  
//             int factor = first * i;
//             if (factor %second == 0){
//                 return factor;
//             }
//             i++;
//         }
//         return 0;                                    // no return statement
//     }
// }
