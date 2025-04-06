package ru.courses.birds;

public class Cuckoo extends Bird{
    private String text;

    public Cuckoo(){
        super("cuckoo");
        this.text = "ку-ку";
    }

    @Override
    public void sing(){
        int randomNumber = (int) (Math.random() * 9) + 1;
        for (int i = 1; i < randomNumber; i++) {
            System.out.println(text);
        }
    }
}
