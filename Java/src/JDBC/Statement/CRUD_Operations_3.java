// File: CRUD_Operations_3.java 

// Description: This Java program demonstrates how to perform UPDATE operations on a MySQL database using JDBC.

package JDBC.Statement;

import java.sql.*;  // import the SQL package

public class CRUD_Operations_3 {

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

            String sql = String.format("UPDATE jdbc_student SET name = '%s', age = %d, marks = %f WHERE id = %d", "Sneha", 20, 75.5, 3); // SQL query to update a record in a table

            // String sql1 = String.format("UPDATE jdbc_student SET name = '%s' WHERE id = %d", "Sneha", 3); // SQL query to update a record in a table

            // String sql2 = String.format("UPDATE jdbc_student SET age = %d WHERE id = %d", 20, 3); // SQL query to update a record in a table

            // String sql3 = String.format("UPDATE jdbc_student SET marks = %f WHERE id = %d", 65.5, 3); // SQL query to update a record in a table


            int rowsAffected = statement.executeUpdate(sql);          // execute the SQL query and get the number of rows affected

            if (rowsAffected > 0) {   // check if any rows were affected
                System.out.println("\nRecord Updated successfully!");  // print success message
            } else {
                System.out.println("\nNo record Updated!");             // print failure message
            }
            System.out.println("SQL query executed successfully!");   // print success message

        }
        catch (SQLException e) {
            e.printStackTrace();    // print the stack trace of the exception
        }
    }
}
