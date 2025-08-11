import java.util.*;

public class Float{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter first number:");
        double first = sc.nextFloat();
        System.out.print("please enter second number:");
        double second = sc.nextFloat();
        double mul = first * second;
        System.out.println("multiplication of two floating num is:"+ mul);
    }
}
