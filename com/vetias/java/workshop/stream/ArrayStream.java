package com.vetias.java.workshop.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStream {
    public static void main(String[] args) {
        int[]marks = {90,80,85,34,96};
        long numberOfSubjectsPassed = Arrays.stream(marks)
        .filter(mark -> mark >40).count();
        System.out.println(numberOfSubjectsPassed);
        IntStream markStream = Arrays.stream(marks);
        numberOfSubjectsPassed = markStream
        .filter(mark -> mark > 40).count();
    }

}
