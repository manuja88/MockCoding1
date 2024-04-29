package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E10 {
    public static void main(String[] args) {
        //How can you remove all duplicates from ArrayList?

        List<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add(1);
        listWithDuplicates.add(2);
        listWithDuplicates.add(3);
        listWithDuplicates.add(2);
        listWithDuplicates.add(4);
        listWithDuplicates.add(1);

        Set<Integer> setWithoutDuplicates = new HashSet<>(listWithDuplicates);
        List<Integer> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);

        System.out.println(listWithDuplicates);
        System.out.println(listWithoutDuplicates);
    }
}
