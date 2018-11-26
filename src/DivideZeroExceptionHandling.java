import java.util.Scanner;

public class DivideZeroExceptionHandling {
    public static void main(String[] args)
    {
        System.out.print("Enter the numerator: ");
        Scanner keyboard = new Scanner(System.in);
        int numerator = keyboard.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = keyboard.nextInt();

        System.out.printf("The quotient of %d/%d=%d%n",numerator, denominator,
                                                quotient(numerator,denominator));
    }

    public static int quotient(int numerator, int denominator)
    {
        return numerator/denominator;
    }
}
