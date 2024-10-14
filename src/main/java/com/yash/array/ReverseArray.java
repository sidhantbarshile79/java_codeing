package com.yash.array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //take array size from user
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];

        //take array element input from user
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //create new array to store the reversed array elements
        int[] revArray=new int[arr.length];
        for(int i=0;i<revArray.length;i++){
            revArray[i]=arr[n-i-1];

        }

        //print the reversed array
        for(int i=0;i<revArray.length;i++){
            System.out.println(revArray[i]);
        }
    }
}
