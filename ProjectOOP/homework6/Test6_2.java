package homework6;

import homework6.bai1_2.Circle;
import homework6.bai1_2.GeometricObject;
import homework6.bai1_2.Rectangle;

public class Test6_2 {
    public static void test() {
        GeometricObject geometricObject = new Circle(1.2);
        System.out.println(geometricObject);
        System.out.println(geometricObject.getArea());
        System.out.println(geometricObject.getPerimeter());

        GeometricObject geometricObject1 = new Rectangle(1.2, 2.3);
        System.out.println(geometricObject1);
        System.out.println(geometricObject1.getArea());
        System.out.println(geometricObject1.getPerimeter());

        Circle circle = new Circle(2.3);
        System.out.println(circle);
    }
}
