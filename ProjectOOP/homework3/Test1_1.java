package homework3;

import homework3.bai1_1.Circle;

public class Test1_1 {
    public static void test() {
        Circle circle1 =new Circle();
        System.out.println("the circle has radius of "+circle1.getRadius()+" and area of "+circle1.getArea());
        Circle circle2=new Circle(2.0);
        System.out.println("the circle has radius of "+circle2.getRadius()+" and area of "+circle2.getArea());
    }
}
