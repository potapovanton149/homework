package ru.courses.other;

public class Sauce {
    private String name;
    private Sharpness sharpness;

    public Sauce(String name, Sharpness sharpness) {
        this.name = name;
        this.sharpness = sharpness;
    }

    @Override
    public String toString() {
        return String.format("Соус %s: %s", name, sharpness.getSharp());
    }
}

