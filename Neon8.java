
import java.util.Scanner;
public class Neon8 {
public static void main(String[] args) {
        double A, P, I, N;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        P = input.nextDouble();
        System.out.println("Enter interest rate:");
        I = input.nextDouble();
        System.out.println("Enter the number of years:");
        N = input.nextDouble(); 
        A = P * Math.pow((1 + I), N);
        System.out.println("Final amount after compound interest is R: " + A);
    }
}
