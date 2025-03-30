package ru.courses.mathematics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        double x = 0;
        double y = 0;
        int count = 0;

        for (String string : args) {
            if (!string.matches("^[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?$")){
                continue;
            }

            if (count == 0) {
                x = Double.parseDouble(string);
                count++;
            } else if (count == 1) {
                y = Double.parseDouble(string);
                break;
            }
        }
        System.out.println(x + y);
    }
}

