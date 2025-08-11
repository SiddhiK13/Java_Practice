import java.util.*;

public class PasswordChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to set your password");
        boolean isValid;
        String password;
        do{
            System.out.print("please enter your password: ");
            password = sc.next();
        }while (!isValidPassword(password));
        System.out.println("thanks for enterring a valid password");

    }


    public static boolean isValidPassword(String password) {
        return password.length() > 6;
    }
}
