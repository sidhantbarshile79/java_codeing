package com.yash.array;

import java.util.Scanner;

public class ElementPresent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //take array size from user
        int n;
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();

        //enter elements in array
        int[] arr = new int[n];
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //check whether element is present in array or not
        System.out.println("Enter the element you want to find in array");
        int num=sc.nextInt();
        boolean present=true;
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==num){
                present=true;
                break;
            }
            else{
                present=false;
            }

        }
        if(present){
            System.out.println("The element is present at index "+i);
        }
        else{
            System.out.println("-1");
        }

    }
}
