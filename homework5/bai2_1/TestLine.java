package bai2_1;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3,4);
        System.out.println(l1);

        l1.setBeginX(1);
        l1.setBeginY(2);
        System.out.println(l1);

        Point p1 = new Point(2, 4);
        Point p2 = new Point(3, 5);

        Line l2 = new Line(p1, p2);
        System.out.println(l2);

        System.out.println(l2.getLength());

    }
}
