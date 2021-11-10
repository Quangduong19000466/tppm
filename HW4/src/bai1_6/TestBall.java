package bai1_6;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1.1f, 2.2f, 5, 3, 60);
        System.out.println(ball);

        ball.setX(2.1f);
        ball.setY(3.2f);
        ball.setRadius(7);
        ball.setxDelta(12f);
        ball.setyDelta(10f);
        System.out.println(ball);
        System.out.println("x is: " + ball.getX());
        System.out.println("y is: " + ball.getY());
        System.out.println("radius is: " + ball.getRadius());
        System.out.println("xDelta is: " + ball.getxDelta());
        System.out.println("yDelta is: " + ball.getyDelta());

        ball.move();
        System.out.println(ball);

        ball.reflectHorizontal();
        ball.reflectVertical();
        System.out.println(ball);


    }
}
