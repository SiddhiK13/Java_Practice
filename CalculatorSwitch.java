import java.util.*;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("please enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("please enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("now, enter the operation: ");
        String operation = sc.next();

        int result = switch (operation){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;
        };
        System.out.println("your answer is:" + result);
    }
}
