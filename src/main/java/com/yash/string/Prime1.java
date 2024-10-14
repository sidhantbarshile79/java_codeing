package com.yash.string;
import  java.util.*;

public class Prime1
{
    public static void main(String args[])
    {
        int flag=0;
        int sum=0;
        int Nsum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n= sc.nextInt();
        for (int j=2; j<=n; j++)
        {
            for (int i=2; i<=j/2; i++)
            {
                if(j%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if (flag==0) {
                System.out.println(j + "Prime number");
                sum = sum + 1;
            }
            else
            {
                System.out.println(j+ "not a prime number");
                Nsum=Nsum+1;
            }
            flag=0;
        }
        System.out.println("Prime count :"+sum);
        System.out.println("Not Prime count :"+Nsum);

    }

}
