package homework6;

import homework6.bai1_3.MovablePoint;

public class Test6_3 {
    public static void test() {
        MovablePoint movablePoint = new MovablePoint(1, 2, 3, 4);
        System.out.println(movablePoint);
        movablePoint.moveDown();
//        movablePoint.moveUp();
//        movablePoint.moveLeft();
//        movablePoint.moveRight();
        System.out.println(movablePoint);
    }
}
