package ru.courses.other;

import ru.courses.geometry.Measurable;

public class NewString implements Measurable {
    private String string;

    NewString(String string){
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public double getLength(){
        return string.length();
    }
}
