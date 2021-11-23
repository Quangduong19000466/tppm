package bai1_5;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3.4);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        ResizableCircle resizableCircle = new ResizableCircle(3.4);
        System.out.println(resizableCircle);
        resizableCircle.resize(6);
        System.out.println(resizableCircle);
    }
}
