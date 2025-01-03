import java.util.Scanner;
abstract class Bank {
    String name;
    int accNo;
    double balance;

    void readDetails(Scanner sc) {
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Account No: ");
        accNo = sc.nextInt();
        System.out.print("Balance: ");
        balance = sc.nextDouble();
    }

    void display() {
        System.out.println("Name: " + name + ", Account No: " + accNo + ", Balance: " + balance);
    }

    abstract double calculateInterest();
}

class CityBank extends Bank {
    double calculateInterest() { return balance * 0.05; }
}

class SBIBank extends Bank {
    double calculateInterest() { return balance * 0.06; }
}

class CanaraBank extends Bank {
    double calculateInterest() { return balance * 0.07; }
}

public class BankTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank[] banks = {new CityBank(), new SBIBank(), new CanaraBank()};
        for (Bank bank : banks) {
            bank.readDetails(sc);
            bank.display();
            System.out.println("Interest: " + bank.calculateInterest());
        }
    }
}
