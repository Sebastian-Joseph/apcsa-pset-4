import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner texx = new Scanner(System.in);
        String text;
        System.out.println("Text : ");
          text = texx.nextLine();

        int length = text.length();
        String fHalf = text.substring(0,length/2);
        String sHalf = text.substring((length/2), length);
        String total = sHalf + fHalf;
        String finale = total.toUpperCase();

        System.out.println(finale + ".");

    }
}
