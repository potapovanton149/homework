package ru.courses.other;

public enum Sharpness {
    NOT_SHARP("не острый"),
    SHARP("острый"),
    VERY_SHARP("очень острый");

    private String sharp;

    Sharpness(String sharp){
        this.sharp = sharp;
    }

    public String getSharp(){
        return sharp;
    }
}
