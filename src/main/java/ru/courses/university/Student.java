package ru.courses.university; /**
 * В ТЗ сказано "Оценки - массив целых чисел", значит в конструктор будем передать только массив
 * или список оценок, а под капотом для удобства будем работать с листом. При этом перегрузил
 * метод addGrades так, что можно добавить как одну оценку, так и перечень аргументов.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    Student(String name, int... grade) {
        this.name = name;
        this.grades = new ArrayList<>();
        for (int i : grade) {
            if (i < 2 || i > 5) {
                throw new IllegalArgumentException("Оценка не может быть меньше 2 или больше 5");
            }
            grades.add(i);
        }
    }

    public void addGrades(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка не может быть меньше 2 или больше 5");
        }
        grades.add(grade);
    }

    public void addGrades(int... grades) {
        for (int i : grades) {
            if (i < 2 || i > 5) {
                throw new IllegalArgumentException("Оценка не может быть меньше 2 или больше 5");
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