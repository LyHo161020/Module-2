package com.company;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class StopWatch {
    private LocalTime startTime, endTime;

    public StopWatch() {
        this.startTime = startTime;
    }

    public LocalTime getStartTime() {
        return this.startTime;
    }

    public LocalTime getEndTime() {
       return this.endTime;
    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }

    public long getElapsedTime() {
        return ChronoUnit.MILLIS.between(this.startTime,this.endTime);
    }
}
