import java.util.*;

public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter first number: ");
        int first = sc.nextInt();
        System.out.print("please enter the second number: ");
        int second = sc.nextInt();
        int GCD = gcd(first , second);
        System.out.println("the GCD of your numbers is: "+ GCD);
    }
    public static int gcd(int num1 , int num2){
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while( i <= least) {
            if ( num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
    public static int least( int num1, int num2){
        if (num1<num2){
            return num1;
        }else {
            return num2;
        }
    }
}
