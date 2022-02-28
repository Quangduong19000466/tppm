package homework4;

import homework4.bai1_1.MyComplex;

public class TestComplex {
    public static void test() {
        MyComplex myComplex1 = new MyComplex(1.2,1.2);
        MyComplex myComplex2 =  new MyComplex();
        myComplex2.setReal(2.4);
        myComplex2.setImag(3.4);
        System.out.println(myComplex1);
        System.out.println(myComplex2);

        myComplex1.setVlue(2.4,3.4);
        System.out.println(myComplex1);

        System.out.println(myComplex1.isReal());
        System.out.println(myComplex1.isImaginary());

        System.out.println(myComplex1.equals(myComplex2));
        System.out.println(myComplex1.equals(1.2,3.4));

        System.out.println(myComplex1.mangitude());

        System.out.println(myComplex1.addInto(myComplex2));

        myComplex1.addNew(myComplex2);
        System.out.println(myComplex1);
    }
}
