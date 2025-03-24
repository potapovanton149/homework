package ru.courses.birds;

public class Sparrow extends Bird{
    private String text;

    public Sparrow(){
        super("sparrow");
        this.text = "чырык";
    }

    @Override
    public void sing(){
        System.out.println(text);
    }
}
