package homework3;

import homework3.bai1_5.InvoiceItem;

public class Test1_5 {
    public static void test() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.88);
        System.out.println(inv1);


        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1);
        System.out.println("is is:" + inv1.getId());
        System.out.println("desc is:" + inv1.getDesc());
        System.out.println("qty is:" + inv1.getQty());
        System.out.println("unitPrice is:" + inv1.getUnitPrice());

        System.out.println("the total is:" + inv1.getTotal());
    }
}
