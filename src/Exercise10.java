import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner cit = new Scanner(System.in);

        System.out.println("What's your favorite city? ");
        String text = cit.nextLine();

        String Upper = text.toUpperCase();
        String Lower = text.toLowerCase();
        int Length = text.length();


       System.out.println("Text : " + text);
       System.out.println("Length : " + Length);
       System.out.println("Upper : " + Upper);
       System.out.println("Lower : " + Lower);


    }
}