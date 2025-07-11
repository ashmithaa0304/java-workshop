package com.vetias.java.workshop.stream;

import java.util.ArrayList;
import java.util.List;

public class NameStartWithSCount {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
    names.add("Ashmi");
    names.add("nivi");
    names.add("varjini");
    names.add("dharshini");
    names.add("nithi");
    names.add("john");
    long nameCount = names.stream()
    .filter(name -> name.startsWith("n")).count();
    System.out.println(nameCount);

    }

}
