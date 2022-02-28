package homework5;

import homework5.bai1_4.Circle;
import homework5.bai1_4.Rectangle;
import homework5.bai1_4.Square;

public class Test51_4 {
    public static void test() {
        Circle circle = new Circle();
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

    }
}
