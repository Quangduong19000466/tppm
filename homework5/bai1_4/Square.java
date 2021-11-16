package bai1_4;

public class Square extends Rectangle {
    private double side;

    public Square() {

    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double width, double height, double side) {
        super(width, height);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {

    }

    public void setLength(double side) {

    }

    public String toString() {
        return "Square[" + super.toString() + ",width = " + side + ",length = " + side + "]";
    }
}
