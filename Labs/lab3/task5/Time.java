package task5;

public class Time implements Comparable<Time> {
    private int hour;
    private int minute;
    private int second;
    private String type = null;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public void toStandard() {
        if (type == null) {
            if (hour >= 12) {
                hour -= 12;
                type = "PM";
            } else {
                type = "AM";
            }
        }
        showTime();
    }

    public void toUniversal() {
        if (type != null) {
            if ("PM".equals(type)) {
                hour += 12;
            }
            type = null;
        }
        showTime();
    }


    public void showTime() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s", hour, minute, second, (type == null ? "" : type));
    }

    @Override
    public int compareTo(Time other) {
        if (this.hour != other.hour) {
            return Integer.compare(this.hour, other.hour);
        }
        if (this.minute != other.minute) {
            return Integer.compare(this.minute, other.minute);
        }
        return Integer.compare(this.second, other.second);
    }
}
