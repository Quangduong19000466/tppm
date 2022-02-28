package homework3;

import homework3.bai1_8.Time;

public class Test1_8 {
    public static void test() {
        Time time1 = new Time(1,2,3);
        System.out.println(time1);

        time1.setHour(4);
        time1.setMinute(5);
        time1.setSecond(6);
        System.out.println(time1);
        System.out.println("hour:"+time1.getHour());
        System.out.println("minute:"+time1.getMinute());
        System.out.println("second:"+time1.getSecond());

        time1.setTime(23,59,58);
        System.out.println(time1);

        System.out.println(time1.nextSecond());
        System.out.println(time1.nextSecond().nextSecond());
    }
}
