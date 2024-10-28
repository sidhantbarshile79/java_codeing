//Write a Java program to get a number from the user and print whether it is positive or negative.

package com.yash.conditional.if_else;
import java.util.*;

public class PositiveNumber
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :");
        int n= sc.nextInt();

        if (n>0)
        {
            System.out.println("Number is positive...");
        }
        else {
            System.out.println("Number is negative...");
        }
    }
}
