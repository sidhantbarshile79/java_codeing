package com.yash.string;

public class NaturalNumberSumDemo
{
    public static int calculateSum(int n)
    {
        int sum=0;

        for(int i=1; i<=n; i++)
        {
            if(i%3==0 || i%5==0)
            {
                sum+=i;

            }
        }

        return sum;
    }
    public static void main(String[] args) {

        int n=5;
        System.out.println(calculateSum(5));
    }
}
