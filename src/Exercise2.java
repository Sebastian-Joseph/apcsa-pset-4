import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner inches = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0");

        System.out.println("Inches : ");
        double in = inches.nextDouble();

        double miles = in / 63360;
        double left1 = in % 63360;

        double feet = left1 / 12;
        double leftoverinches = left1 % 12;

        System.out.println("Miles : " + deci.format(miles));
        System.out.println("Feet : " + deci.format(feet));
        System.out.println("Inches : " + deci.format(leftoverinches));
    }
}