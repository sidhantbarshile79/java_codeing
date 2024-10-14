package com.yash.JDBC;
import java.sql.*;
import java.util.*;

public class JDBC_Demo
{
    //2. create connection
    //final - we cant change again and again.
    private static final String url="jdbc:mysql://localhost:3306/campaigns";
    private static final String username="root";
    private static final String password="root";

    public static void main(String[] args)
    {
        //1. Driver load - Class.forName
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            //3. create connection
            Connection connection=DriverManager.getConnection(url, username, password);

            //4. statement
            Statement statement= connection.createStatement();
            //Query
//            String query = "select * from campaigns";
//            ResultSet resultSet=statement.executeQuery(query);   // resultset interface = hold the query.
//            while (resultSet.next())
//            {
//                int campaignId= resultSet.getInt("campaignId");
//                String title= resultSet.getString("title");
//                String description= resultSet.getString("description");
//                double fundRaise= resultSet.getDouble("fundRaise");
//                double targetAmount= resultSet.getDouble("targetAmount");
//                String startDate= resultSet.getString("startDate");
//                String endDate= resultSet.getString("endDate");
//
//                System.out.println("ID: "+campaignId);
//                System.out.println("Title :"+title);
//                System.out.println("Description :"+description);
//                System.out.println("Fund Raise :"+fundRaise);
//                System.out.println("Target Amount :"+targetAmount);
//                System.out.println("Start Date : "+startDate);
//                System.out.println("End Date :"+endDate);
//
//            }
//

            // update query
            String query = String.format("insert into campaigns(title, description, fundRaise, targetAmount, startDate, endDate) values('%s', '%s', %f, %f, '%s', '%s')","Cricket Turnament", "Play for Handicape Person", 150000.00, 90000.00, "2024-11-11", "2024-12-11");
            System.out.println(query);
            int rowsAffected= statement.executeUpdate(query);
            if (rowsAffected>0)
            {
                System.out.println("Data insert successfully...!");
            }
            else
                System.out.println("Data not inserted...!");

        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
