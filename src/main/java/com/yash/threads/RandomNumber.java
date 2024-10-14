package com.yash.threads;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber
{
    public static void main(String[] args) {
        int arr[] = new int[20];
        int positiveodd[] =new int[20];
        int positiveeven[] =new int[20];
        int negativeodd[] =new int[20];
        int negativeeven[] =new int[20];
        int positive=0;
        int positiveoddd=0;
        int negative=0;
        int negativeoddd=0;
        int npositive=0;
        int nnegative=0;
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            arr[i] = random.nextInt(100)-50;
//            System.out.println(arr[i]);
            if(arr[i]>0)
            {
                if(arr[i] % 2 == 0)
                {
                    positiveeven[positive++]=arr[i];
                }
                else
                {
                    positiveodd[positiveoddd++]=arr[i];
                }
            }
            else if(arr[i]%2==0)
            {
                negativeeven[npositive++] = arr[i];
            }
            else
            {
                negativeodd[negativeoddd++]=arr[i];
            }
        }


        for(int i=0;i<20;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Positive odd numbers are: ");
        for(int i=0;i<positiveoddd;i++)
        {
            System.out.print(positiveodd[i]+" ");
        }
        System.out.println();
        System.out.println("Postive Even Numbers: ");
        for(int i=0;i<positive;i++)
        {
            System.out.print(positiveeven[i]+" ");
        }
        System.out.println();
        System.out.println("Negative even numbers are: ");
        for(int i=0;i<npositive;i++)
        {
            System.out.print(+negativeeven[i]+" ");
        }
        System.out.println();
        System.out.println("Negative odd numbers are: ");
        for(int i=0;i<negativeoddd;i++)
        {
            System.out.print(+negativeodd[i]+" ");
        }
    }
}
