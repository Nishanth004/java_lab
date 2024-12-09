import java.util.Scanner;

class ComplexNumber {
    double r; // Real part
    double i; // Imaginary part

    public ComplexNumber(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public String toString() {
        return r + " + " + i + "i";
    }
}

class ComplexOperations {
    public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(num1.r + num2.r, num1.i + num2.i);
    }

    public static ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(num1.r - num2.r, num1.i - num2.i);
    }

    public static boolean isEqual(ComplexNumber num1, ComplexNumber num2) {
        return num1.r == num1.r && num1.i == num2.i;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first complex number
        System.out.println("Enter the real part of the first complex number:");
        double r1 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double i1 = sc.nextDouble();
        ComplexNumber num1 = new ComplexNumber(r1, i1);

        // Input for second complex number
        System.out.println("Enter the real part of the second complex number:");
        double r2 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double i2 = sc.nextDouble();
        ComplexNumber num2 = new ComplexNumber(r2, i2);

        // Perform operations
        ComplexNumber sum = ComplexOperations.add(num1, num2);
        ComplexNumber difference = ComplexOperations.subtract(num1, num2);

        // Output results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Equal or not: " + ComplexOperations.isEqual(num1, num2));

        sc.close(); // Close the scanner
    }
}
