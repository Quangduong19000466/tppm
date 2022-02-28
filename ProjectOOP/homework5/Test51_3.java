package homework5;

import homework5.bai1_3.Point2D;
import homework5.bai1_3.Point3D;

import java.util.Arrays;

public class Test51_3 {
    public static void test() {
        Point2D point2D = new Point2D(2f,4f);
        System.out.println(point2D);

        point2D.setXY(2f,3.1f);
        System.out.println(Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D(1f,3f,4f);
        System.out.println(point3D);

    }
}
