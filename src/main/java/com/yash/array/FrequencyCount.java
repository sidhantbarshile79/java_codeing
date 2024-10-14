package com.yash.array;

import java.util.Scanner;

public class FrequencyCount {
    public  static int frequency(int arr[],int num){
        int count=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==num){
               count++;
           }
       }
       return count;
    }
    public static void main(String[] args) {
        //take array size from user
        Scanner sc = new Scanner(System.in);
        //enter elements in array
        int[] arr= new int[10];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to find frequency of");
        int num=sc.nextInt();
        int count_frequency=frequency(arr,num);
        System.out.println(count_frequency);


    }
}
