package com.yash.MySQL;
import java.sql.*;

public class InsertDemo
{
    public static void main(String[] args)
    {
        try
        {
            //Load Driver
            Class.forName("com.mysql.jdbc.Driver");
            //Creating connection
            String url="jdbc:mysql://localhost:3306/Siddhant";
            String username="root";
            String password="root";
            Connection connection=DriverManager.getConnection(url, username, password);
            //creating query
            String query="insert into employee(empID,name) value(?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            //seting the value
            preparedStatement.setInt(1, 2400);
            preparedStatement.setString(2, "Yash Tech");
            preparedStatement.executeUpdate();
            System.out.println("Insert Successfully...");
            connection.close();
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
