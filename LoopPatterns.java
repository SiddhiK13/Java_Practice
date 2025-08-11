import java.util.*;

public class LoopPatterns {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the number of rows:");
        int rows = sc.nextInt();
        RightHalfPyramid(rows);
        reverseRightHalfPyramid(rows);
        trianglePyramid(rows);
        leftHalfPyaramid(rows);

    }
    public static void leftHalfPyaramid (int maxRows) {
        System.out.println("\nHere is left Half Pyaramid");
        int rows = maxRows;
        while(rows > 0) {
            int j = 0;
            while ( j < rows -1 ){
                System.out.print(" ");
                j++;
            }

            int i = 0;
            while (i <= (maxRows-rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
        
    }


    public static void trianglePyramid(int maxRows) {
        System.out.println("Here is Triangle Pyramid: ");
        int rows = maxRows;
        while(rows > 0) {
            // this loop print spaces
            int j = 0;
            while (j < rows - 1) {
                System.out.print(" ");
                j++;
            }
            //this loop prints stars
            int i = 0;
            while (i <= (maxRows - rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
        
    }

    public static void reverseRightHalfPyramid(int maxRows){
        System.out.println("Here is Right Half Pyramid: ");
        int rows = maxRows;
        while(rows > 0){
            int i = 0;
            while ( i < rows) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }


    public static void RightHalfPyramid(int maxRows){
        System.out.println("Here is Right Half Pyramid: ");
        int rows = 0 ;
        while (rows < maxRows){
            System.out.print("*");
            int i = 0;
            while ( i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
