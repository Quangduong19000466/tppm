package homework4.bai1_4;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {

    }

    public MyTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    public void setTime() {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        if (hour == 23 && minute == 59 && second == 59) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
        if (minute == 59 && second == 59) {
            this.hour = hour + 1;
            this.minute = 0;
            this.second = 0;
        }
        if (second == 59) {
            this.minute = minute + 1;
            this.second = 0;
        }
        return this;
    }

    public MyTime nextMinute() {
        if (minute == 59 && hour < 23) {
            this.hour = hour + 1;
            this.minute = 0;
        } else {
            this.hour = 0;
        }

        return this;
    }

    public MyTime nextHour() {
        if (hour < 24) {
            this.hour = hour + 1;
        } else {
            this.hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (hour == 0 && minute == 0 && second == 0) {
            this.hour = 23;
            this.second = 59;
            this.minute = 59;
        }
        if (minute == 00 && second == 0) {
            this.hour = hour - 1;
            this.second = 59;
            this.minute = 59;
        }
        if (second == 0) {
            this.minute = minute - 1;
        }
        return this;
    }

    public MyTime previousMinute() {
        if (minute == 0 && hour == 0) {
            this.hour = 23;
            this.minute = 59;
        } else {
            this.minute = minute - 1;
        }
        return this;
    }

    public MyTime previousHour() {
        if (hour == 0) {
            this.hour = 23;
        } else {
            this.hour = hour - 1;
        }
        return this;
    }
}
