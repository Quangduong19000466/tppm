package homework3;

import homework3.bai1_7.Date;

public class Test1_7 {
    public static void test() {
        Date date1=new Date(1,2,2014);
        System.out.println(date1);


        date1.setMonth(12);
        date1.setDay(9);
        date1.setYear(2099);
        System.out.println(date1);
        System.out.println("Month:"+date1.getMonth());
        System.out.println("Day:"+date1.getDay());
        System.out.println("Year:"+date1.getYear());

        date1.setDate(3,4,2016);
        System.out.println(date1);
    }
}
