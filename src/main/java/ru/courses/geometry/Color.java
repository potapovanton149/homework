package ru.courses.geometry;

public class Color {
    String color;

    Color(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Color %s", color);
    }
}
