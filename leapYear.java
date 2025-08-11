import java.util.*;

public class leapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the year that you want to check:");
        int year = sc.nextInt();

        if( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 )){
            System.out.print("your year is a leap year");
        }else{
            System.out.println("year is not a leap year");
        }
    }
    
}
