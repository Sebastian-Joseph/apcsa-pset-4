import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner hex = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        System.out.println("Side : ");
        double side = hex.nextDouble();


        double area =  ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);
        double perimeter = side * 6;


        System.out.println("Area: " + deci.format(area));
        System.out.println("Perimeter: " + deci.format(perimeter));

    }
}
