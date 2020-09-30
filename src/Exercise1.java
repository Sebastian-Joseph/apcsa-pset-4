import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner weather = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        System.out.println("Temperature : ");
        double temp = weather.nextDouble();


        System.out.println("Wind Speed : ");
        double windspeed = weather.nextDouble();

        double a = .6215*temp;
        double b = .4275*temp;
        double c = Math.pow(windspeed, .16);

        double windchill = 35.74 + a + (b - 35.75) * c;

        System.out.println("Wind Chill : " + deci.format(windchill));
    }
}
