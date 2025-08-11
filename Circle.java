import java.util.*;

public class Circle {

    double radiusInMm;

    Circle(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }

    double getCircumference(){
        return 2 * radiusInMm * Math.PI;
    }

    double getArea(){
        return Math.PI * Math.pow(radiusInMm, 2);
    }
     
    @Override
    public String toString() {
        return "Circle props: radius in mm:" + radiusInMm +",Circumference in mm:" + getCircumference() + ", Area in mm2: " + getArea();
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your radius: ");
        double radius = sc.nextInt();
        Circle Circle = new Circle(radius);
        System.out.print(Circle);
    }
}
