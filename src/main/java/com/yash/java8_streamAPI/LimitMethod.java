package com.yash.java8_streamAPI;

import java.util.*;
import java.util.stream.*;

public class LimitMethod {
    public static void main(String[] args) {

        Stream <Integer> evenNums = Stream.iterate(0, n -> n +2);
        List <Integer> even = evenNums.limit(10).collect(Collectors.toList());

        System.out.println(even);
    }
}
