package bai2_2;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(1.2, "red");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(circle, 1);

        System.out.println(cylinder);
    }
}
