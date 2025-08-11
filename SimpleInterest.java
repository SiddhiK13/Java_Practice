import java.util.*;

public class SimpleInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your principle amount:");
        int P = sc.nextInt();
        System.out.print("tell me how many years are you borrowing this money:");
        int T = sc.nextInt();
        System.out.print("now, tell me your rate of interest:");
        float R = sc.nextFloat();
        float simpleinterest = (P*T*R)/100;
        System.out.print("your Simple Interest is:" + simpleinterest);
    }

}