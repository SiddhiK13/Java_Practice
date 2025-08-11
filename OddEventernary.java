import java.util.*;

public class OddEventernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
        //String result = num % 2 == 0 ? "even" : "odd";
       // System.out.println("Your number is: " + result);
        String str = num(num); 
        System.out.print("your number is "+ str);
    }
    public static String num(int num){
        return num % 2 == 0 ? "even" : "odd" ;
    }
}
