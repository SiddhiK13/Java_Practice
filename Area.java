import java.util.*;

public class Area{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("please enter length of triangle:");
        // int length = sc.nextInt();
        // System.out.print("please enter breadth of triangle:");
        // int breadth = sc.nextInt();
        // int area = (length*breadth)/2;
        // System.out.print("the area of triangle is:"+area);
        area();
    }
    public static int area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter base of triangle:");
        int base = sc.nextInt();
        System.out.print("please enter height of triangle:");
        int height = sc.nextInt();
        int area = (base*height)/2;
        System.out.print("the area of triangle is:"+area);
        return 0;
    }
}
