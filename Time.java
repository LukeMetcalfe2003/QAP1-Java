// Time.java
public class Time {
    private int hour;
    private int minute;
    private int second;

    // Method for setting the time
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Methods for getiing and setting the hour, minute and second
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // Format for display
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Increase second
    public Time nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    // Decrease second
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}
