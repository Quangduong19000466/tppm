package homework4;

import homework4.bai1_6.Ball;
import homework4.bai1_6.Container;

public class TestContainer {
    public static void test() {
        Ball ball1 = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        for (int step = 0; step < 100; ++step) {
            ball1.move();
            box.collidesWith(ball1);
            System.out.println(ball1);
        }
    }
}
