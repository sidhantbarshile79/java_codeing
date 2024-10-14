package com.yash.string;

import java.util.*;

public class Palindrom
{
    public static void main(String args[])
    {
        System.out.println("Enter number you want to print palindrome of");
        Scanner Sc=new Scanner(System.in);
        int num=Sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0)
        {
            int rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(sum==temp)
        {
            System.out.println(temp+ " is a Palindrome number ");
        }
        else
        {
            System.out.println(temp+ " is not a Palindrome number ");
        }

    }
}
