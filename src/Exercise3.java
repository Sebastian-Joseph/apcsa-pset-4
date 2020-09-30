import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner mrcorn = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0,000.00");

        System.out.print("Length : ");
        double length = mrcorn.nextDouble();

        System.out.print("Width : ");
        double width = mrcorn.nextDouble();

        System.out.print("Diameter : ");
        double diameter = mrcorn.nextDouble();
        double radius = diameter / 2;

        double board = length * width;
        double hole = Math.PI * Math.pow(radius, 2);

        double area = board - hole;

        System.out.println("Surface area : " + deci.format(area));
    }
}