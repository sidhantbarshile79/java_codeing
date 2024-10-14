package com.yash.string;
import java.util.*;

public class Armstrong
{
    public static void main(String[] args)
    {
        int num;
        int temp;
        int Arm = 0;
        int y=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        y=num;
        while (num != 0)
        {
            temp = num % 10;
            Arm = Arm + temp*temp*temp;
            num = num / 10;
        }
        if (Arm == y)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not Armstrong number");
        }

    }
}
