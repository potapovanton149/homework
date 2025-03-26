package ru.courses.university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Student {
    private String name;
    private List<Integer> grades;
    private ImplementationOfTheContract contract;

    public Student(String name, ImplementationOfTheContract contract) {
        this.name = name;
        grades = new ArrayList<>();
        this.contract = contract;
    }

    public Student(String name, ImplementationOfTheContract contract, int... grade) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.contract = contract;
        for (int i : grade) {
            if (contract.contractValidation(i)) {
                throw new IllegalArgumentException("Оценка не соответствует примененному правилу");
            }
            grades.add(i);
        }
    }

    public void addGrades(int grade) {
        if (contract.contractValidation(grade)) {
            throw new IllegalArgumentException("Оценка не соответствует примененному правилу");
        }
        grades.add(grade);
    }

    public void addGrades(int... grades) {
        for (int i : grades) {
            if (contract.contractValidation(i)) {
                throw new IllegalArgumentException("Оценка не соответствует примененному правилу");
            }
            this.grades.add(i);
        }
    }

    @Override
    public String toString() {
        Integer[] intArrayGrdes = grades.toArray(Integer[]::new);
        return name + " " + Arrays.toString(intArrayGrdes);
    }
}