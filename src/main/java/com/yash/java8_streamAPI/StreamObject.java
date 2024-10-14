package com.yash.java8_streamAPI;

import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args)
    {
        Stream<Integer> emptyStream = Stream.empty();  // Creates empty stream


        String [] names = {"Siddhant", "Vishwajeet", "Tanmay", "Ashutosh", "Yash"};

        Stream<String> namesStream = Stream.of(names); // Creates stream of string array

    }
}
