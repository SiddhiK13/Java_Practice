import java.util.*;

public class mathsOperation {
    public static void main(String [] args){
        
        // System.out.print("please enter first number:");
        // int first = sc.nextInt();
        // System.out.print("please enter second number:");
        // int second = sc.nextInt();
        sum();
        sub();
        mul();
        div();
        mod();

        
        // int sub = first - second;
        // int mul = first * second;
        // int div = first / second;
        // int mod = first % second;


    
        // System.out.println("subtraction is:"+ sub);
        // System.out.println("multiplicatin is :"+ mul);
        // System.out.println("division is:"+div);
        // System.out.println("mode is:"+mod);
    }
    public static int sum() {
        Scanner sc= new Scanner(System.in);
        System.out.print("please enter first number:");
        int first = sc.nextInt();
        System.out.print("please enter second number:");
        int second = sc.nextInt();
        int add = first + second;
        System.out.println("addition is:"+add);
        return sum();
    }

    public static int sub(){
        Scanner sc= new Scanner(System.in);
        System.out.print("please enter first number:");
        int first = sc.nextInt();
        System.out.print("please enter second number:");
        int second = sc.nextInt();
        int sub = first - second;
        System.out.println("subtraction is:"+sub);
        return sub();
    }

    public static int mul() {
        Scanner sc= new Scanner(System.in);
        System.out.print("please enter first number:");
        int first = sc.nextInt();
        System.out.print("please enter second number:");
        int second = sc.nextInt();
        int mul = first * second;
        System.out.println("multiplicatin is :"+ mul);
        return mul();
    }

    public static int div(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter first number");
        int first = sc.nextInt();
        System.out.println("please enter second number:");
        int second = sc.nextInt();
        int div = first / second;
        System.out.println("division is:"+ div);
        return 0;
    }

    public static int mod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int first = sc.nextInt();
        System.out.println("enter second number:");
        int second = sc.nextInt();
        int mod = first % second;
        System.out.println("mode is:"+ mod);
        return mod();
    }
}

