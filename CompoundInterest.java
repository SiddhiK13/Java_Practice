import java.util.*;

public class CompoundInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter principle:");
        int P = sc.nextInt();
        System.out.print("please enter time:");
        double T = sc.nextDouble();
        System.out.print("please enter rate:");
        double R = sc.nextDouble();
        
        double compoundinterest = P * Math.pow((1+ R / 100 ), T);
        System.out.print("compound interest is:"+ compoundinterest);
    }
}