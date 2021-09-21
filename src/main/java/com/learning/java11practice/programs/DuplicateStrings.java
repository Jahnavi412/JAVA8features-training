package com.learning.java11practice.programs;

import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateStrings {

  public static void main(String[] args) {
    String str = "TEST 12 TEST 233 TEST1";
    String[] arrStr = str.split(" ");
    Arrays.stream(arrStr)
        .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
        .entrySet()
        .stream()
        .forEach(System.out::println);

    System.out.println("================Using DELIMITER===================");

    String str1 = "TEST|TEST1|123|TEST|12|TEST";
    String[] arrStr1 = str1.split(Pattern.quote("|"), -1);
    Arrays.stream(arrStr1)
        .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
        .entrySet()
        .forEach(System.out::println);

    System.out.println("========Max repeated String from a line using max =====================");
    Arrays.stream(arrStr1)
        .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
        .entrySet()
        .stream()
        .max((o1, o2) -> o1.getValue() < o2.getValue() ? -1 : 1)
        .stream()
        .forEach(System.out::println);

    int[] primenu= {2,3,7,7,3,11,13,2};
      //IntStream.of(primenu).collect();
    
  }
}
