 import java.io.*;
 import java.util.*;
 class Person {
    protected String name;
    protected int age;
    protected String gender;
    public void readDetails(Scanner scanner) {
        name = scanner.next();
        age = scanner.nextInt();
        gender = scanner.next();
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
 }
 class Employee extends Person {

    public String jobTitle;
    public double salary;
    public void readDetails(Scanner scanner) {
        super.readDetails(scanner);
        jobTitle = scanner.next();
        salary = scanner.nextDouble();
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
 }
 class Student extends Person {
    public String department;
    public String course;
    public int year;
    public void readDetails(Scanner scanner) {
        super.readDetails(scanner);
        department = scanner.next();
        course = scanner.next();

        year = scanner.nextInt();
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Course: " + course);
        System.out.println("Year of Study: " + year);
    }
 }
 public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        try {
            File file = new File("data.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String type = sc.next();
                if (type.equals("Employee")) {
                    Employee employee = new Employee();
                    employee.readDetails(sc);

                    employees.add(employee);
                } else if (type.equals("Student")) {
                    Student student = new Student();
                    student.readDetails(sc);
                    students.add(student);
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please ensure 'data.txt' is in the same directory as the program.");
        }
        System.out.println("\nDetails of Employees:");
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }
        System.out.println("\nDetails of Students:");
        for (Student student : students) {
            student.displayDetails();
            System.out.println();
        }
 }
 }
