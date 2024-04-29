package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E9 {
    //You have a list of strings and you want to keep only those that start with “A”
    // and you want to return them in lower case".

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Apricot", "Orange", "Avocado");

        List<String> filteredStrings = strings.stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(filteredStrings);
    }
}
