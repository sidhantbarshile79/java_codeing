package com.yash.array;

import java.util.Scanner;

public class LargestNSmallestTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //take array size from user
        int n;
        System.out.println("Enter the size of array");
        n = sc.nextInt();

        //enter elements in array
        int arr[] = new int[n];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //finding the largest and smallest two elements in array
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=0;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        //print the smallest and largest two elements in array
        System.out.println("Smallest element in array is: "+ arr[0]);
        System.out.println("Second smallest element in array is: "+ arr[1]);
        System.out.println("Largest element in array is: "+ arr[n-1]);
        System.out.println("Second largest element in array is: "+ arr[n-2]);


    }

}
