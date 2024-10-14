package com.yash.string;

import java.util.*;
public class CubeSumOfDigits
{
    public static void main(String args[]){
        System.out.println("Enter number you want to check");
        Scanner Sc=new Scanner(System.in);
        int num=Sc.nextInt();
        int sum=0;
        int temp=num;
        while (num>0){
            int rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
        }

        System.out.println(sum);
    }
}
