package homework5.bai2_1;

public class LineSub extends Point{

    Point end;
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end){
        super(begin.getX(),begin.getY());
        this.end = end;
    }
    public Point getBegin() {
        return new Point(getX(),getY());
    }

    public void setBegin(Point begin) {
        begin.setX(getBeginX());
        begin.setY(getBeginY());
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return getX();
    }

    public int getBeginY() {
        return getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        super.setX(beginX);
    }

    public void setBeginY(int beginY) {
        super.setY(beginY);
    }

    public void setEndX(int endX) {
        end.setY(endX);
    }

    public void setEndY(int endY) {
        end.setY(endY);
    }

    public void setBeginXY(int beginX, int beginY) {
        super.setXY(beginX, beginY);
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
