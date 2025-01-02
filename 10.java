import java.sql.*;

public class lab10 {

  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/school_db";
  private static final String DB_USER = "root";
  private static final String DB_PASSWORD = "";

  public static void main(String[] args) {
    try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
         Statement statement = connection.createStatement()) {

      // CREATE
      statement.executeUpdate("INSERT INTO students (id, name, usn, semester, age, course, dob, address) VALUES (17, 'random', 21, 3, 15, 'Computer Science', '2003-05-07', '221b baker street')");
      System.out.println("Record created successfully.");

      // READ
      ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
      while (resultSet.next()) {
        System.out.println("ID: " + resultSet.getInt("id") + ", Name: " + resultSet.getString("name") + ", Age: " + resultSet.getInt("age"));
      }

      // UPDATE
      statement.executeUpdate("UPDATE students SET age = 22 WHERE name = 'John'");
      System.out.println("Record updated successfully.");

      // DELETE
      statement.executeUpdate("DELETE FROM students WHERE name = 'John'");
      System.out.println("Record deleted successfully.");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
