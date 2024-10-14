package com.yash.java8_streamAPI.Project.handson;

import com.yash.java8_streamAPI.Project.commons.*;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice1
{
    public static List<Person> createPeople()
    {
        return Arrays.asList(
                new Person("pankaj", 42, Gender.MALE),
                new Person("Manvi", 6, Gender.FEMALE),
                new Person("Jaynam", 32, Gender.MALE),
                new Person("Bindu", 23, Gender.FEMALE),
                new Person("Kabir", 45, Gender.MALE),
                new Person("Monika", 45, Gender.FEMALE),
                new Person("Monika", 35, Gender.FEMALE),
                new Person("Vijay", 34, Gender.MALE),
                new Person("Priyanka", 35, Gender.FEMALE));
    }

    public static void main(String[] args) {

        List<Person> people = createPeople();

        //Q1: Get the name of all females in upper case who are in age more than 6.
        // Attempt this without java8 concepts.
        // (Note : This is the imperative way of working).

        List<String> RequiredPeoples = new ArrayList<>();
        for (Person pr : people) {
            if (pr.getGender() == Gender.FEMALE && pr.getAge() > 6) {
                RequiredPeoples.add(pr.getName().toUpperCase());
            }
        }
        System.out.println(RequiredPeoples);


        //Q2: Get the name of all females in upper case who are in age more than 6.
        // Attempt this by using filter, map and collect method of stream api.
        // Use Predicate and Function functional interface as the argument of filter and map methods.
        // (Note : This is the declarative way of working.)

        Stream<Person> RequiredPersons = createPeople().stream();
        System.out.println("Required Streams: "+RequiredPersons);
        Predicate<Person> RequiredFemales = p -> p.getGender() == Gender.FEMALE && p.getAge() > 6;
        System.out.println("Required Females: "+RequiredFemales);
        Function<Person, String> capital = p -> p.getName().toUpperCase();
        System.out.println("Required capitals: "+capital);
        List<String> RequiredOnes = RequiredPersons.filter(RequiredFemales).map(capital).collect(Collectors.toList());

        System.out.println(RequiredOnes);


        //Q3: Get the name of all females in upper case who are in age more than 6.
        // Attempt this by using filter, map and collect method of stream api,
        // now in this instead of Predicate and Function functional interfaces, use Lambda expression.
        // (More concise way of writing code using Java8)

        Stream<Person> RequiredPersonss = createPeople().stream();
        List<String> RequiredOness = RequiredPersonss.filter(p->p.getGender()==Gender.FEMALE && p.getAge()>6).map(p->p.getName().toUpperCase()).collect(Collectors.toList());

        System.out.println(RequiredOness);

    }

}
