package bai2_1;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        begin.setX(beginX);
    }

    public void setBeginY(int beginY) {
        begin.setY(beginY);
    }

    public void setEndX(int endX) {
        end.setY(endX);
    }

    public void setEndY(int endY) {
        end.setY(endY);
    }

    public void setBeginXY(int beginX, int beginY) {
        begin.setXY(beginX, beginY);
    }

    public void setEndXY(int endX, int endY) {
        end.setXY(endX, endY);
    }

    public double getLength() {
        return Math.sqrt((getBeginX() - getEndX()) * (getBeginX() - getEndX()) + (getBeginY() - getEndY()) * (getBeginY() - getEndY()));
    }

    public double getGradient() {
        return Math.atan2((getBeginX() - getEndX()) * (getBeginX() - getEndX()), (getBeginY() - getEndY()) * (getBeginY() - getEndY()));
    }


    @Override
    public String toString() {
        return "Line{" +
                "begin = (" + getBeginX() + "," + getBeginY() +
                "), end = (" + getEndX() + "," + getEndY() +
                ")}";
    }
}
