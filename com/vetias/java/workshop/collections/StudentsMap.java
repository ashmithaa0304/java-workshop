package com.vetias.java.workshop.collections;
import java.util.Map;
import java.util.HashMap;

public class StudentsMap {
   Map<Integer,String> students =new HashMap<>();
   students.put(1006,"Ashmitha");
   students.put(1002,"Nivetha");
   students.put(1201,"Varjini");
   students.put(1234,"Dharshini");
   students.put(1324,"Nithi");
   students.put(1543,"John");
   System.out.println(students);
   String studentsname = students.get( 1006);
   System.out.println()
}
