import java.util.*; 

public class MonthSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("please enter the number: ");
        int monthNum = sc.nextInt();
        String monthName = getMonthName(monthNum);
        System.out.println("your month name is: " + monthName);

    }
    public static String getMonthName(int monthNum){
            return switch (monthNum){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "june";
            case 7 -> "july";
            case 8 -> "August";
            case 9 -> "september";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "mars month";
        };
    }
}
