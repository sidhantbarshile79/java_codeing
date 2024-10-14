package com.yash.java8_streamAPI;

import java.util.*;
import java.util.stream.*;

public class MapMethod {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Indore");
        cities.add("Bhopal");
        cities.add("Ujjain");
        cities.add("Dewas");

        Stream <String> citiesStream = cities.stream();

        List <String> newCities =  citiesStream.map(str -> str.toUpperCase()).collect(Collectors.toList());
        newCities.stream().forEach(
                e ->
                {
                    System.out.println(e);
                }
        );

    }
}
