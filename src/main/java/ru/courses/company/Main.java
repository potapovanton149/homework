package ru.courses.company;


public class Main {
    public static void main(String[] args) {
        Department department = new Department("Run", "Bob");
        Employee employee1 = new Employee("Bob", department);
        Employee employee2 =  new Employee("Rob", department);

        System.out.println(employee1);
        System.out.println(employee2);

    }
}