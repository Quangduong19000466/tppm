package bai1_7;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1f,2f,3f);
        System.out.println(ball);

        ball.setXYZ(3f,2f,4f);
        System.out.println(ball);

        System.out.println(ball.getX());

    }
}
