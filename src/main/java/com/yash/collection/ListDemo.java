package com.yash.collection;
import java.util.*;

public class ListDemo
{
    public static int countCharacters(List<String> list)
    {
        int count = 0;
        Iterator<String> iterator = list.iterator();
        System.out.println(iterator);
        while (iterator.hasNext())
        {
            int tempCount = String.valueOf(iterator.next()).length();
            System.out.println(tempCount);
            count += tempCount;
        }
        return count;
    }
    //iterator - interface.
    //list.iterator - use forword and backword
    //hasNext() - next variable

    public static List<String> split(String input) {
        List<String> res = new ArrayList<>();
        if (!input.isEmpty()) {
            String[] temp = input.split(" ");
            for (int i = 0; i < temp.length; i++) {
                res.add(temp[i]);
            }
            return res;
        } else {
            res.add("");
            return res;
        }
    }

    public static List<String> upperCased(List<String> list) {
        List<String> res2 = new ArrayList<>();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String temp = iterator.next();
            res2.add(temp.toUpperCase());
        }
        return res2;
    }

    public static boolean allCapitalizedWords(List<String> list) {
        boolean result = false;
        int length = list.size();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            if (Character.isUpperCase(temp.charAt(0))) {
                count++;
            }
        }
        if (count == length) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static List<String> filterContaining(List<String> list, char c) {
        List<String> res = new ArrayList<>();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String temp = iterator.next().toLowerCase();
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == c) {
                    res.add(temp);
                    break;
                }
            }
        }
        return res;
    }

    public static void insertInOrder(List<String> list, String string) {
        list.add(string);
        Collections.sort(list);
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");
        list1.add("Yash");
        int res = countCharacters(list1);
        System.out.println("Number of characters in list: " + res);

        String input = "I work at Yash technologies";
        List<String> list2 = split(input);
        System.out.println("Splitted String is: " + list2);

        List<String> list3 = new ArrayList<>();
        list3.add("horse");
        list3.add("Dog");
        list3.add("cat");


        List<String> res2 = upperCased(list3);
        System.out.println("Upper Cased String is: " + res2);

        List<String> list4 = new ArrayList<>();
        list4.add("I");
        list4.add("work");
        list4.add("at");
        list4.add("Yash");
        list4.add("tech");
        boolean res3 = allCapitalizedWords(list4);
        System.out.println("All capitalized words in list: " + res3);

        List<String> list5 = new ArrayList<>();
        list5.add("I");
        list5.add("work");
        list5.add("at");
        list5.add("Yash");
        list5.add("tech");
        boolean res5 = allCapitalizedWords(list5);
        System.out.println("All capitalized words in list: " + res5);

        List<String> list6 = new ArrayList<>();
        list6.add("Dog");
        list6.add("Cat");
        list6.add("Horse");
        list6.add("Lion");
        char inp = 'o';
        List<String> res6 = filterContaining(list6, inp);
        System.out.println("Filter containing list: " + res6);

        List<String> list7 = new ArrayList<>();
        insertInOrder(list7, "atharv");
        insertInOrder(list7, "salil");
        System.out.println("Inserted in sorted order: " + list7);
    }
}
