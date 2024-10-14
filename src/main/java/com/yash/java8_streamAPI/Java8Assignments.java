package com.yash.java8_streamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Assignments {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Siddhant", "Vishwanath", "Ashutosh", "Tanmay");

        // 1. Stream()
        System.out.println("Original List: " + list);
        System.out.println("Stream: " + list.stream().toArray());

        // 2. Filter()
        List<String> filteredList = list.stream()
                .filter(s -> s.startsWith("b"))
                .collect(Collectors.toList());
        System.out.println("Filter: " + filteredList);

        // 3. Map()
        List<String> upperCaseList = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Map: " + upperCaseList);

        // 4. Collect()
        List<String> collectedList = list.stream().collect(Collectors.toList());
        System.out.println("Collect: " + collectedList);

        // 5. Iterate() (using iterator())
        list.stream().iterator().forEachRemaining(System.out::println);
        System.out.println("Iterate: Done");

        // 6. Limit()
        List<String> limitedList = list.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Limit: " + limitedList);

        // 7. ForEach()
        list.stream().forEach(System.out::println);
        System.out.println("ForEach: Done");

        // 8. Reduce()
        int sum = list.stream()
                .mapToInt(String::length)
                .reduce(0, (a, b) -> a + b);
        System.out.println("Reduce: " + sum);

        // 9. Collectors
        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println("Collectors: " + map);
    }
}