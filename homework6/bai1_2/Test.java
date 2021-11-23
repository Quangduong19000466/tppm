package bai1_2;

public class Test {
    public static void main(String[] args) {
        GeometricObject geometricObject = new Circle(1.2);
        System.out.println(geometricObject);
        System.out.println(geometricObject.getArea());
        System.out.println(geometricObject.getPerimeter());

        GeometricObject geometricObject1 = new Rectangle(1.2, 2.3);
        System.out.println(geometricObject1);
        System.out.println(geometricObject1.getArea());
        System.out.println(geometricObject1.getPerimeter());

        Circle circle = new Circle(2.3);
        System.out.println(circle);
    }
}
