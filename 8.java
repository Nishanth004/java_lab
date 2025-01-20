import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int a = sc.nextInt();
        System.out.print("Enter denominator: ");
        int b = sc.nextInt();

        try {
            if (a < 0 || b <= 0) throw new IllegalArgumentException();
            System.out.println("Result: " + (a / b));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Negative number or divide by zero.");
        }
    }
}
