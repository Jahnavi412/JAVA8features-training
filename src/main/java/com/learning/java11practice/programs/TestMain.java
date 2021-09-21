package com.learning.java11practice.programs;

import java.util.*;
import java.util.stream.Collectors;

public class TestMain {
  public static void main(String[] args) {
    List<Employee> listOfEmp = new ArrayList<>();

    listOfEmp.add(new Employee(1, "IT", 2000, 22));
    listOfEmp.add(new Employee(2, "IT", 3000, 30));
    listOfEmp.add(new Employee(3, "HR", 5000, 45));
    listOfEmp.add(new Employee(4, "HR", 1000, 21));

    int sumOfSal =
        listOfEmp.stream()
            .filter(emp -> emp.getDep().equals("HR"))
            .mapToInt(value -> value.getSal())
            .sum();
    System.out.println(sumOfSal);
    HashMap<String, List<Employee>> mapList = new HashMap<>();
    List<Employee> newListOFEmp = new ArrayList<>();

    listOfEmp.stream()
        .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
        .entrySet()
        .forEach(
            employeeLongEntry ->
                System.out.println(
                    employeeLongEntry.getKey() + "->" + employeeLongEntry.getValue()));

    listOfEmp.stream()
        .collect(
            Collectors.groupingBy(
                Employee::getDep,
                Collectors.filtering(employee -> employee.getSal() > 1, Collectors.toList())))
        .forEach((s, employees) -> System.out.println(s + "-" + employees.toString()));

    listOfEmp.stream()
            .collect(
                    Collectors.groupingBy(
                            Employee::getDep,
                            Collectors.toList()))
            .forEach((s, employees) -> System.out.println(s + "-" + employees.toString()));
    /*listOfEmp.stream()
    .forEach(
        employee ->
            mapList.put(employee.getDep(), ));*/

    System.out.println(mapList);

    // mapList.put(listOfEmp.stream().di)
  }
}
