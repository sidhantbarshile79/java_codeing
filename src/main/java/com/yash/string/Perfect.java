package com.yash.string;

public class Perfect
{
    public static void main(String[] args)
    {
        int n=100;
        int sum = 0;
        for (int j=1; j<=n; j++)
        {
            for (int i = 1; i < j; i++)
            {
                if (j % i == 0)
                {
                    sum = sum + i;
                }
            }
            if (sum == j)
            {
                System.out.println(j + "Perfect number");
            } else
            {
                System.out.println(j + "not a perfect number");
            }
            sum =0;
        }
    }
}
