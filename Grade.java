import java.util.*;

public class Grade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your percentage: ");
        int marks = sc.nextInt();

        if(marks >= 90){
            System.out.println("your grade is A");
        }else if( marks >= 75){
            System.out.println("your grade is B");
        }else if(marks >= 60) {
            System.out.println("your grade is C");
        }else if(marks >= 30 ){
            System.out.println("your grade is D");
        }else{
            System.out.println("your grade is F ");
        }
    }
}
