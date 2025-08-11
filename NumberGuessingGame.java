import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 5, guess;
        do
        {
            System.out.print("please guess the number between 0 & 10: ");
            guess = sc.nextInt();

        } while(num != guess);
        System.out.println("you have successfully guessed the number");
    }
}
