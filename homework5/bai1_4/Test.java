package bai1_4;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

    }
}
