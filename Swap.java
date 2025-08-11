import java.util.*;

public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter value of A: ");
        int A = sc.nextInt();
        System.out.print("please enter value of B: ");
        int B = sc.nextInt();

        int C = A;
        A = B;
        B = C;

        System.out.println("swapping done: ");
        System.out.println("value of A is: "+ A);
        System.out.println("value of B is: "+ B);
    }
}
