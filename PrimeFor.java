import java.util.*;

public class PrimeFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the number: ");
        int num = sc.nextInt();
        boolean isPrime = isPrime(num);
        System.out.println("your number is " + (isPrime(num) ? "Prime" : " Not Prime"));
    }

    public static boolean isPrime(int num) {
        for(int i = 2; i< num; i++){
            if (num % i == 0 ){
                return false;
            }
        }
        return true;
    }
}
