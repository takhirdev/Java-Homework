public class Main{
    public static void main(String[] args) {
        MyTime time = new MyTime();
        time.setTime(21,0,0);
        time.previousMinute();
        time.previousSecond();
        time.previousHour();
        System.out.println(time.toString());
        MyTime time1 = new MyTime(11,59,59);
        time1.nextMinute();
        time1.nextSecond();
        time1.nextHour();
        System.out.println(time1.toString());
    }
}