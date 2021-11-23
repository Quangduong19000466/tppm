package bai1_3;

public class Test {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1, 2, 3, 4);
        System.out.println(movablePoint);
        movablePoint.moveDown();
//        movablePoint.moveUp();
//        movablePoint.moveLeft();
//        movablePoint.moveRight();
        System.out.println(movablePoint);
    }
}
