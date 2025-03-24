package ru.courses.birds;

public class Parrot extends Bird {
    private String text;

    public Parrot(String text) {
        super("cuckoo");
        this.text = text;
    }

    @Override
    public void sing() {
        int randomNumber = (int) (Math.random() * text.length() +1);
        char[] textCharArray = text.toCharArray();
        for (int i = 0; i < randomNumber - 1; i++) {
            System.out.print(textCharArray[i]);
        }
        System.out.println();
    }
}
