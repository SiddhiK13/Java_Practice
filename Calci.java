import java.util.*;

public class Calci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number:");
        int first = input.nextInt();
        System.out.println("enter second number:");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;

        System.out.println("Addition is:"+ add);
        System.out.println("Substraction is:"+ sub);
        System.out.println("Multipllication is:"+ mul);
        System.out.println("Division is:"+ div);
        System.out.println("remainder is:"+ mod);
    
    }
    
}
