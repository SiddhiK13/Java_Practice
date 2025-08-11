import java.util.*;

public class MinimumTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your first number: ");
        int num1 = sc.nextInt();
        System.out.print("please enter your second number");
        int num2 = sc.nextInt();
        MinimumTernary ternary = new MinimumTernary();
        int min = ternary.min(num1,num2);
        System.out.println("Minimum number is: "+ min);
    }
    public static int min(int num1, int num2) {
        return num1 < num2 ? num1 : num2 ;
    }
}