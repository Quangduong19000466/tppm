package homework6;

import homework6.bai1_8.Movable;
import homework6.bai1_8.MovableCircle;
import homework6.bai1_8.MovablePoint;

public class Test6_8 {
    public static void test() {
        Movable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
