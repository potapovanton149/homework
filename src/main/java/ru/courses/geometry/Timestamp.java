package ru.courses.geometry;


import java.time.LocalTime;


public class Timestamp {
    private LocalTime localTime;

    public String getLocalTime() {
        return localTime.toString();
    }

    public Timestamp(int hour, int minute){
        this.localTime = LocalTime.of(hour, minute);
    }

    @Override
    public String toString() {
        return localTime.toString();
    }
}
