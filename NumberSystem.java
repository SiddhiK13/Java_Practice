import java.util.*;

public class NumberSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter number:");
        int num =sc.nextInt();

        if(num>0){
            System.out.println("number is positive");
        }else if(num<0){
            System.out.println("number is negative");
        }else{
            System.out.println("num is zero");
        }
    }
}
