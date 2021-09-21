package com.learning.java11practice.programs;

public class Employee {

    private int id;
    private String dep;
    private int sal;
    private int age;

    public Employee(){

    }

    public Employee(int id, String dep, int sal, int age) {
        this.id = id;
        this.dep = dep;
        this.sal = sal;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", dep='" + dep + '\'' +
                ", sal=" + sal +
                ", age=" + age +
                '}';
    }
}
