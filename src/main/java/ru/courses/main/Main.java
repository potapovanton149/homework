package ru.courses.main;

import ru.courses.other.Sauce;
import ru.courses.other.Sharpness;


public class Main {
    public static void main(String[] args) {
        Sauce sauce1 = new Sauce("Keтчуп", Sharpness.VERY_SHARP);
        System.out.println(sauce1);

        Sauce sauce2 = new Sauce("Maйонез", Sharpness.NOT_SHARP);
        System.out.println(sauce2);
    }
}
