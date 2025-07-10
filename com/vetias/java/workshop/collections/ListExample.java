package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
   public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Ashmi");
    names.add("nivi");
    names.add("varjini");
    names.add("dharshini");
    names.add("nithi");
    names.add("john");
    System.out.println(names);
    for(int i=0;i< names.size();i++){
       System.out.println(names.get(i));
   }
}
}