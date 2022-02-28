package homework6;

import homework6.bai1_5.Circle;
import homework6.bai1_5.ResizableCircle;

public class Test6_5 {
    public static void test() {
        Circle circle = new Circle(3.4);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        ResizableCircle resizableCircle = new ResizableCircle(3.4);
        System.out.println(resizableCircle);
        resizableCircle.resize(6);
        System.out.println(resizableCircle);
    }
}
