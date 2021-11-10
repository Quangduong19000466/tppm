package bai1_7;

public class TestPlayer {
    public static void main(String[] args) {
        Ball ball = new Ball(0,0,0);
        Player player1 = new Player(1,2,3);
        Player player2 = new Player(2,4,5);

        System.out.println(player1);
        System.out.println(player2);

        System.out.println(ball + " number 1 kich the ball");
        while (player1.near(ball)){
            player1.kick(ball);
            System.out.println(ball);
        }
        while (!player2.near(ball)){
            player2.move(ball.getX(),ball.getY());
            player2.jump(ball.getZ());
            System.out.println(player2);
            System.out.println(ball);
        }
        System.out.println("number 2 kick the ball ");
        player2.kick(ball);
        System.out.println(ball);
    }
}
