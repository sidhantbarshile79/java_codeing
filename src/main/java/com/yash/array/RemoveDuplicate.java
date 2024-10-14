package com.yash.array;

import java.util.Scanner;

/**
 * This class removes duplicates from an array of integers.
 */
public class RemoveDuplicate {
    public static void main(String[] args){
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

        int length = arr.length;
        int[] uniqueArray = new int[length];//create new array which stores the unique values
        int uniqueIndex = 0;

        //find all the unique elements and add it to array uniqueArray
        for (int i=0; i <length; i++) {
            boolean isDuplicate = false;
            for (int j=0; j<i; j++) {
                if (arr[i]==arr[j]) {
                    isDuplicate=true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[uniqueIndex++]=arr[i];
            }
        }

        //create new array result of the size of unique array and store all the unique values in it
        int[] result = new int[uniqueIndex];
        for (int i=0; i<uniqueIndex; i++) {
            result[i] = uniqueArray[i];
        }

        // Print the resulting array
        for (int element : result) {
            System.out.print(element+" ");
        }
    }
}