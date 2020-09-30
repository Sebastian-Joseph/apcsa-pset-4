import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner diame = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        System.out.println("Diameter : ");
        double diameter = diame.nextDouble();

        double radius = diameter / 2;
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area: " + deci.format(area));
        System.out.println("Circumference: " + deci.format(circumference));
    }
}