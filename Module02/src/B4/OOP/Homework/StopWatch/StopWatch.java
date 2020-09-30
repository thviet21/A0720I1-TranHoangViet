package B4.OOP.Homework.StopWatch;

import java.time.LocalTime;

public class StopWatch {
    private int startTime;
    private int endTime;

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public StopWatch() {
    }
    public LocalTime startTime(){
        LocalTime localTime = LocalTime.now();
        return localTime;
    }
    public LocalTime endTime(){
        LocalTime localTime = LocalTime.now();
        return localTime;
    }
    public int getElapsedTime(){
        return 1;
    }

}
