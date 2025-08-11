// import java.util.*;

// public class Table{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("please enter a number:");
//         int n = sc.nextInt();
//         System.out.println("Table of " + n +" is: ");

//         for(int i = 1; i <= 10; i++){
//             System.out.println(i*n);
//         }
//     }
// }



import java.util.*;

public class Table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the number: ");
        int num = sc.nextInt();
        System.out.println(num);
        multiplicationTable(num);
    }
    public static void multiplicationTable(int num){
        int i = 1;
        while(i <= 10){
            System.out.println(num * i);
            i++;
        }
    }
}