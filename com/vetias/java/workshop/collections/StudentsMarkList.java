package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsMarkList {
   public static void main(String[] args) {
    List<String> Marks = new ArrayList<>();
    Marks.add("76");
    Marks.add("95");
    Marks.add("90");
    Marks.add("88");
    Marks.add("98");

    Collections.sort(Marks);
    System.out.println(Marks);
    Collections.sort(Marks,Collections.reverseOrder());
    Collections.min(Marks);
    System.out.println("max marks"+Collections.max(Marks));

    
   } 
}
