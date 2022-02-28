package homework6.bai1_2;

public class Rectangle implements GeometricObject{
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.length = length;
        this.width  = width;
    }
    public String toString(){
        return "Rectangle[width = " + width + ", length = " + length +"]";
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) / 2;
    }
}