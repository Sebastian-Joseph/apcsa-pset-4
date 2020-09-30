import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner rect = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        System.out.println("Length : ");
        double length = rect.nextDouble();

        System.out.println("Width : ");
        double width = rect.nextDouble();

       double area = length * width;
       double perimeter = (length + width) * 2;
       double diagonal = Math.sqrt(length * length + width * width);

        System.out.println("Area : " + deci.format(area));
        System.out.println("Perimeter : " + deci.format(perimeter));
        System.out.println("Diagonal : " + deci.format(diagonal));
    }
}
