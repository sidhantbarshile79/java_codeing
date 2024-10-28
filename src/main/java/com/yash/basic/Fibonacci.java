/*
    In fibonacci series, next number is the sum of previous two numbers
    e.g = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
    The first two numbers of fibonacci series are 0 and 1.
 */

package com.yash.basic;

public class Fibonacci
{
    public static void main(String[] args)
    {
        int n1=0;
        int n2=1;
        int n3=10;
        int i=10;
//        System.out.println(n1+" "+n2);
        for (i=2; i<10; i++)
        {
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
