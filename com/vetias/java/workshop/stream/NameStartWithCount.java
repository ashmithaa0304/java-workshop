package com.vetias.java.workshop.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NameStartWithCount {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
    names.add("Ashmi");
    names.add("nivi");
    names.add("varjini");
    names.add("dharshini");
    names.add("nithi");
    names.add("john");
        Stream<String> nameCount = names.stream()
    .filter(name -> name.startsWith("n") || name.startsWith("n"));
    .distinct().map(String::toUpperCase).forEach(System.out::println);
    System.out.println(nameCount);
    }

    

}
