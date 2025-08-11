import java.util.*;

public class MultiplicationTableFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the number you want to print Table of: ");
        int num = sc.nextInt();

        for (int i = 1; i<=10;i++){
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
