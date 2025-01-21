import java.util.Scanner;

interface Compute {
    double convert(double input);
}

class GBtoBytes implements Compute {
    public double convert(double gb) { return gb * 1_073_741_824; }
}

class EuroToRupees implements Compute {
    public double convert(double euro) { return euro * 88.5; }
}

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter GB to convert to Bytes: ");
        double gb = sc.nextDouble();
        System.out.println("Bytes: " + new GBtoBytes().convert(gb));

        System.out.print("Enter Euros to convert to Rupees: ");
        double euro = sc.nextDouble();
        System.out.println("Rupees: " + new EuroToRupees().convert(euro));
    }
}
