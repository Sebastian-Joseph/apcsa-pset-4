import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner centi = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0");

        System.out.println("Centimeters : ");
        double cen = centi.nextDouble();

        double kilometers = cen / 100000;
        double left1 = cen % 100000;

        double meters = left1 / 100;
        double leftovercentimeters = left1 % 100;

        System.out.println("Kilometer : " + deci.format(kilometers));
        System.out.println("Meters : " + deci.format(meters));
        System.out.println("Centimeters : " + deci.format(leftovercentimeters));
    }
}