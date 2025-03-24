package ru.courses.geometry;


import java.time.LocalTime;
import java.util.Date;

public class Timestamp {
    LocalTime localTime;

    LocalTime(int hour, int minute){
        this.localTime = LocalTime.of(hour, minute);
    }
}
