package homework6;

import homework6.bai1_4.Movable;
import homework6.bai1_4.MovableCircle;
import homework6.bai1_4.MovablePoint;

public class Test6_4 {
    public static void test() {
        Movable movable = new MovableCircle(1, 2, 4, 6, 12);
        System.out.println(movable);

        movable.moveDown();
        System.out.println(movable);

        MovableCircle movableCircle = new MovableCircle(2, 3, 4, 5, 4);
        System.out.println(movableCircle);

        MovablePoint movablePoint = new MovablePoint(1, 2, 3, 6);
        System.out.println(movablePoint);
        movablePoint.moveLeft();
        System.out.println(movablePoint);

    }
}
