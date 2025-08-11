import java.util.*;

public class AbsoluteTernary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your number: ");
        int num = sc.nextInt();
        int result = num > 0 ? num : - num;
        System.out.println("Absolute value is :"+ result);
    }
}