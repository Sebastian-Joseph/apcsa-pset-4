import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner init = new Scanner(System.in);

        System.out.println("First name : ");
        String first = init.nextLine();

        System.out.println("Middle name : ");
        String middle = init.nextLine();

        System.out.println("Last name : ");
        String last = init.nextLine();

        String fLetter = first.substring(0,1);
        String sLetter = middle.substring(0,1);
        String tLetter = last.substring(0,1);

        String oneL = fLetter.toUpperCase();
        String twoL = sLetter.toUpperCase();
        String threeL = tLetter.toUpperCase();

        System.out.println(oneL + twoL + threeL + ".");


    }
}