package bai1_7;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp) {
        x = (x +xDisp) / 2;
        y = (y+ yDisp) / 2;
    }

    public void jump(float zDisp) {
        z = (z + zDisp) / 2;

    }

    public boolean near(Ball ball) {
        double distance = Math.sqrt((x - ball.getX()) * (x - ball.getX()) + (y - ball.getY()) * (y - ball.getY()) + (z - ball.getZ() * (z - ball.getZ())));
        if (distance < 8) {
            return true;
        }
        return false;
    }

    public void kick(Ball ball) {
        ball.setXYZ(ball.getX()+5,ball.getY()+5, ball.getZ()+5);
    }

    @Override
    public String toString() {
        return "Player{" +
                "number" + number +
                "," + x +
                "," + y +
                "," + z +
                '}';
    }
}
