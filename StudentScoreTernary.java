import java.util.*;

public class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your marks: ");
        int marks = sc.nextInt();

        String result = marks > 80 ? "high" : (marks>50 ? "moderate" : "low");
        System.out.println("your Category is: " + result);
    }
}
