import java.time.*;
public class MyTime {
     int hour = 0;
     int minute = 0;
     int second = 0;
    public MyTime() {
    }
    public MyTime(int hour, int minute, int second) {
        if ( 0 <= hour && hour<=23) {
            this.hour = hour;
        } else System.out.println("Yaroqsiz soat");

        if (0 <= minute && minute <= 59){
            this.minute = minute;
        } else System.out.println("Yaroqsiz minut");

        if (0 <= second && second <= 59){
        this.second = second;
        } else System.out.println("Yaroqsiz sekund");
    }
    public void setTime(int hour, int minute, int second){
        if ( 0 <= hour && hour<=23) {
            this.hour = hour;
        } else System.out.println("Yaroqsiz soat");

        if (0 <= minute && minute <= 59){
            this.minute = minute;
        } else System.out.println("Yaroqsiz minut");

        if (0 <= second && second <= 59){
            this.second = second;
        } else System.out.println("Yaroqsiz sekund");
    }
    public void setHour(int hour) {
        if ( 0 <= hour && hour<=23) {
            this.hour = hour;
        } else System.out.println("Yaroqsiz soat");
    }
    public int getHour() {
        return hour;
    }
    public void setMinute(int minute) {
        if (0 <= minute && minute <= 59){
            this.minute = minute;
        } else System.out.println("Yaroqsiz minut");
    }
    public int getMinute() {
        return minute;
    }
    public void setSecond(int second) {
        if (0 <= second && second <= 59){
            this.second = second;
        } else System.out.println("Yaroqsiz sekund");
    }
    public int getSecond() {
        return second;
    }
    int nextHour (){
        hour += 1;
        if (hour > 23){
            hour = 0;
        }
        return hour;
    }
    int nextMinute (){
        minute += 1;
        if (minute > 59){
            hour += 1;
            minute = 0;
        }
        return minute;
    } int nextSecond (){
        second += 1;
        if (second > 59){
            minute += 1;
            second = 0;
        }
        return second;
    }
    int previousHour (){
        hour -= 1;
        if (hour < 0){
            hour = 23;
        }
        return hour;
    }
    int previousMinute (){
        minute -= 1;
        if (minute < 0){
            minute = 59;
            hour -= 1;
        }
        return minute;
    }  int previousSecond (){
        second -= 1;
        if (second < 0){
            second = 59;
            minute -= 1;
            if (minute < 0){
                minute = 59;
                hour -= 1;
            }
        }
        return second;
    }
    @Override
    public String toString() {
        String hours = Integer.toString(hour);
        if (hours.length() == 1) hours = "0"+hours;
        String minutes = Integer.toString(minute);
        if (minutes.length() == 1) minutes = "0"+minutes;
        String seconds = Integer.toString(second);
        if (seconds.length() == 1) seconds = "0"+seconds;
        return hours + " : " + minutes + " : " + seconds;
    }
}
