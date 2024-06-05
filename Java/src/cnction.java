package src;

import java.sql.*;

public class cnction {

	public static void main(String arg[])
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String password = "Alen@05.";
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees",user, password);
			Statement statement= connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from work_details");
			int empid;
			String empname;
			while (resultSet.next()) {
				empid = resultSet.getInt("employee_id");
				empname = resultSet.getString("emp_name").trim();
				System.out.println("Code : " + empid + " Title : " + empname);
			} 
            resultSet.close();
			statement.close();
			connection.close();

		}
		catch (Exception exception) {
			System.out.println(exception);
		}
	} 
} 