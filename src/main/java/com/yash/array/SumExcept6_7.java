package com.yash.array;

import java.util.Scanner;

public class SumExcept6_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take array size from user
        int n;
        System.out.println("Enter the size of array");
        n = sc.nextInt();

        //enter elements in array
        int[] arr= new int[n];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //logic to find the sum except 6 and 7
        int sum=0;
        boolean add = true;
        for (int i=0; i<n; i++) {
            if (arr[i] != 6 && add)
                sum = sum + arr[i];
            else if (arr[i] == 6)
                add = false;
            else if (arr[i] == 7)
                add = true;
        }

        //print the sum
        System.out.println(sum);

    }
}
