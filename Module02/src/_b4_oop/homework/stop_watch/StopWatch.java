package _b4_oop.homework.stop_watch;

import java.util.Arrays;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public long startTime(){
        return startTime = System.currentTimeMillis();
    }
    public long endTime(){
        return endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        long elapsedTime = endTime - startTime;
        return elapsedTime ;
    }

    public static void main(String[] args) {

        double[] array = new double[100000000];
        for (int j = 0; j < 100000000; j++) {
            array[j] = Math.random()*100000000;
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.startTime();
        Arrays.sort(array);
        stopWatch.endTime();
        long milliseconds = stopWatch.getElapsedTime();
        System.out.println("Thời gian thực hiện thuật toán: " + milliseconds);
    }
}
