package homework5;

import homework5.bai2_2.Circle;
import homework5.bai2_2.Cylinder;

public class Test52_2 {
    public static void test() {
        Circle circle = new Circle(1.2, "red");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(circle, 1);

        System.out.println(cylinder);
    }
}
