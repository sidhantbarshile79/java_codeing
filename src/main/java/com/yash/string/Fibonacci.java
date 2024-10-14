package com.yash.string;
import java.util.*;

public class Fibonacci {
    public static void main(String args[])
    {
        System.out.println("Enter number till where you want to print the fibonacci series");
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        int first_num = 0;
        int second_num = 1;
        int third_num = 0;
        System.out.print(first_num + " ");
        System.out.print(second_num + " ");
        while (third_num <= num) {
            third_num = first_num + second_num;
            first_num = second_num;
            second_num = third_num;
            System.out.print(third_num + " ");
        }
    }
}
