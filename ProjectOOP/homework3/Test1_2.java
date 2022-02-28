package homework3;

import homework3.bai1_2.Circle;

public class Test1_2 {
    public static void test() {
        Circle cir1= new Circle(1.1);
        System.out.println(cir1);
        Circle cir2= new Circle();
        System.out.println(cir2);


        cir1.setRadius(2.2);
        System.out.println(cir1);
        System.out.println("radius is "+ cir1.getRadius());

        System.out.printf("area is : %.2f%n",cir1.getArea());
        System.out.printf("circumference is : %.2f%n",cir1.getCircumference());
    }
}
