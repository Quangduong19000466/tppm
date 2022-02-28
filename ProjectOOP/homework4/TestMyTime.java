package homework4;

import homework4.bai1_4.MyTime;

public class TestMyTime {
    public static void test() {
        MyTime myTime = new MyTime(21, 53, 9);
        System.out.println(myTime);

        myTime.setSecond(59);
        myTime.nextSecond();
        System.out.println(myTime);


        myTime.setMinute(59);
        myTime.nextMinute();
        System.out.println(myTime);

        myTime.nextHour();
        System.out.println(myTime);

        myTime.previousSecond();
        System.out.println(myTime);

        myTime.setHour(23);
        System.out.println(myTime.nextSecond());

        myTime.previousMinute();
        System.out.println(myTime);

        myTime.previousHour();
        System.out.println(myTime);


        System.out.println(myTime.nextHour());


    }
}