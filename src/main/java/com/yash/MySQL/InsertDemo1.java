package com.yash.MySQL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;

public class InsertDemo1
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
            Connection connection= DriverManager.getConnection(url, username, password);
            //creating query
            String query="insert into employee(empID,name) value(?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            BufferedReader bufferedReaderfer=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Emp ID");
            int id=Integer.parseInt(bufferedReaderfer.readLine());
            System.out.println("Enter Name");
            String name=bufferedReaderfer.readLine();

            //seting the value
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.executeUpdate();
            System.out.println("Insert Successfully...");
            connection.close();

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
