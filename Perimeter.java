import java.util.*;

public class Perimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter length of first side of rectangle in cm:");
        // int A = sc.nextInt();
        // System.out.print("enter length of second side of rectangle:");
        // int B = sc.nextInt();
        // System.out.print("enter leneth of third side of rectngle:");
        // int C = sc.nextInt();
        // System.out.print("enter length of fourth side of rectangle:");
        // int D = sc.nextInt();
        // int perimeter = A+B+C+D;
        //System.out.println("PERIMITER OF RECTANGLE IS:"+ perimeter+"cm");



        System.out.print("enter all four sides of rectangle in cms: ");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double D= sc.nextDouble();
        double perimeter = A+B+C+D;
        System.out.println("perimeter of rectangle is "+perimeter);
    }
}
