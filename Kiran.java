import java.util.*;

//Bank Methods
public class Kiran{
    static int balance =1000;

    static void deposit(int amt){
        if(amt>0){
            balance = balance + amt;
        }else{
            System.out.println("can't Deposite.Enter greater than zero number.");
        }
    }

    static void withdraw(int amt){
        balance = balance - amt;
    }

    static void display(int amt){
        System.out.println("balance remained:" + balance);
    }
    public static void main(String[] arge){
        deposit(300);
        withdraw(200);
        display(balance);
    }
}



//