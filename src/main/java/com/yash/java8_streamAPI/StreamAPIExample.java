package com.yash.java8_streamAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {

    public static void main(String[] args) {

        // Create list and filter even nums

        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);

        // filtering without stream


        List<Integer> evenNums = new ArrayList<>();

        for(Integer num : list1) {
            if(num % 2 == 0) {
                evenNums.add(num);
            }
        }

        System.out.println(list1);
        System.out.println(evenNums);

        // using stream api

        Stream <Integer> stream = list1.stream();
        List <Integer> numEven =  stream.filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(numEven);


    }
}
