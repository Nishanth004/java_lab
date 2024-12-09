import java.util.*;

public class Main {
    String name;
    int id;
    String dep;
    int age;
    String role;
    double sal;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();
        sc.nextLine(); 
        double totsal = 0.0;
        int highest = -1; // Initialize to -1 to indicate no manager found yet
        Main[] employees = new Main[n];

        for (int i = 0; i < n; i++) {
            employees[i] = new Main();  
            System.out.println("Enter Name, ID, Department, Age, Role, and Salary of employee " + (i + 1));
            System.out.print("Name: ");
            employees[i].name = sc.nextLine();
            System.out.print("ID: ");
            employees[i].id = sc.nextInt();
            System.out.print("Age: ");
            employees[i].age = sc.nextInt();
            System.out.print("Salary: ");
            employees[i].sal = sc.nextDouble();
            sc.nextLine();  
            System.out.print("Department: ");
            employees[i].dep = sc.nextLine();
            System.out.print("Role: ");
            employees[i].role = sc.nextLine();

            if (employees[i].dep.equals("sales")) {
                totsal += employees[i].sal;
            }

            // Check if employee is a manager and has a higher salary
            if (employees[i].role.equals("manager")) {
                if (highest == -1 || employees[highest].sal < employees[i].sal) {
                    highest = i;
                }
            }
        }

        System.out.println("\nEmployee Details:");
        for (Main emp : employees) {
            System.out.println("Name: " + emp.name + ", ID: " + emp.id + ", Age: " + emp.age + ", Salary: " + emp.sal + ", Department: " + emp.dep + ", Role: " + emp.role);
        }
        System.out.println("Total Salary of Sales Department: " + totsal);

        if (highest != -1) {
            System.out.println("Details of Highest Paid Manager:");
            System.out.println("Name: " + employees[highest].name + ", ID: " + employees[highest].id + ", Age: " + employees[highest].age + ", Salary: " + employees[highest].sal + ", Department: " + employees[highest].dep + ", Role: " + employees[highest].role);
        } else {
            System.out.println("No manager found in the input data.");
        }

        sc.close();
    }
}
