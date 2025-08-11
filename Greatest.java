import java.util.*;

public class Greatest{
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter first number:");
        int A =sc.nextInt();
        System.out.print("please enter second number:");
        int B = sc.nextInt();
        System.out.print("please enter third number:");
        int C =sc.nextInt();
        
        if (A >= B && A >= C){
            System.out.println(A +" is greatest out of three number");
        }else if (B >= A && B >= C){
            System.out.println(B + " is greatest");
        }else{
            System.out.println(C +" is greatest");
        }
        
    }
}
