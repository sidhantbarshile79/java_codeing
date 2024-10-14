package com.yash.array;


import java.util.Scanner;

public class SortAscending {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);

        //take array size from user
        int n;
        System.out.println("enter the size of array");
        n=Sc.nextInt();

        //enter elements in array
        System.out.println("enter the elements in array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Sc.nextInt();
        }

        //logic for sorting the array
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        //print the sorted array
        System.out.println("sorted array is");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
