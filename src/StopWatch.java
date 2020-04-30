import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;
    Date now = new Date();
    long nowInMs;
    long nowOther;

    public long getStartTime() {
        nowInMs = now.getTime();
        startTime = nowInMs;
        return startTime;
    }
    public long getEndTime() {
        nowOther =System.currentTimeMillis();
        endTime = nowOther;
        return endTime;
    }
    public long getElapsedTime(){
        return endTime -startTime;
    }


}
