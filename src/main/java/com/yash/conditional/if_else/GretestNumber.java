package com.yash.conditional.if_else;
import java.util.*;

public class GretestNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n= sc.nextInt();
        System.out.println("Enter second number :");
        int n1=sc.nextInt();
        System.out.println("Enter thid number :");
        int n2=sc.nextInt();

        if (n>n1 && n>n2)
        {
            System.out.println("Gretest number :"+n);
        } else if (n1>n && n1>n2)
        {
            System.out.println("Gretest number :"+n1);
        }
        else
        {
            System.out.println("Gretest number :"+n2);
        }
    }
}
