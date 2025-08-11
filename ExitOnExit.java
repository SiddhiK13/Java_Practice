import java.util.*;

public class ExitOnExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("enter your command: ");
            String command = sc.next();
            if (command.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("you have successfully exited.");
    }
}
