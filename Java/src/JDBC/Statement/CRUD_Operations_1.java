// File: CRUD_Operations_1.java 

// Description: This Java program demonstrates how to perform READ operations on a MySQL database using JDBC.

package JDBC.Statement;

import java.sql.*;  // import the SQL package

public class CRUD_Operations_1 {

    private static final String url = "jdbc:mysql://localhost:3306/jdbcmydb";    // database URL
    private static final String userName = "root";                              // database username
    private static final String password = "Dipankar@1997";                     // database password

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // load the MySQL JDBC driver
            System.out.println("\nDriver loaded successfully!");  // print success message
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();    // print the stack trace of the exception
        }
        
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);  // establish a connection to the database
            System.out.println("Connection established successfully!");  // print success message

            Statement statement = connection.createStatement();         // create a statement object to execute SQL queries
            String sql = "SELECT * FROM jdbc_student";                  // SQL query to select all records from a table
            ResultSet resultSet = statement.executeQuery(sql);          // execute the SQL query
            System.out.println("\nSQL query executed successfully!");   // print success message

            while (resultSet.next()) {                                  // iterate through the result set
                int id = resultSet.getInt("id");                      // get the id column value
                String name = resultSet.getString("name");            // get the name column value
                int age = resultSet.getInt("age");                    // get the age column value
                double marks = resultSet.getDouble("marks");          // get the email column value

                System.out.println("=====================================");  // print separator line
                System.out.println("Student Details:");               // print student details header
                System.out.println("Id: " + id);                  // print the id value
                System.out.println("Name: " + name);              // print the name value
                System.out.println("Age: " + age);                // print the age value
                System.out.println("Marks: " + marks);            // print the email value
                System.out.println("=====================================");  // print separator line
            }   
        }
        catch (SQLException e) {
            e.printStackTrace();    // print the stack trace of the exception
        }
    }
}
