import java.util.*;

public class convertFintoC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter temp in fahrenheit:");
        int F = sc.nextInt();
        int C=(F-32)*5/9;
        System.out.println("the temp in celsius is:"+ C);
    }
}
