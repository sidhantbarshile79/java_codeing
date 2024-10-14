package com.yash.java8_streamAPI;

import java.util.*;
import java.util.stream.*;

public class FilterMethod {

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


        Stream<Integer> stream = list1.stream();
        List <Integer> numEven =  stream.filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(numEven);
    }
}
