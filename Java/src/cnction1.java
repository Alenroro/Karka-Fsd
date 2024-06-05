package src;

import java.sql.*;

public class cnction1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employees";
        String user = "root";
        String password = "Alen@05.";
        String query = "INSERT INTO country_new (Country_id, Country_name) VALUES (?, ?)";

        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query)
        ) {
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "India");
            

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("No rows were affected.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
