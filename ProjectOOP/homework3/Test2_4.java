package homework3;

import homework3.bai2_4.Customer;
import homework3.bai2_4.Invoice;

public class Test2_4 {
    public static void test() {
        Customer customer1 = new Customer(88, "tan ah teck", 10);
        System.out.println(customer1);

        customer1.setDiscount(8);
        System.out.println(customer1);
        System.out.println("is is:" + customer1.getId());
        System.out.println("name is;:" + customer1.getName());
        System.out.println("discount is:" + customer1.getDiscount());

        Invoice invoice1 = new Invoice(101, customer1, 888.8);
        System.out.println(invoice1);
        invoice1.setAmount(999.9);
        System.out.println(invoice1);
        System.out.println("is iss:" + invoice1.getId());
        System.out.println("customer is:" + invoice1.getCustomer());
        System.out.println("amount is" + invoice1.getAmount());
        System.out.println("customer id is:" + invoice1.getCustomerId());
        System.out.println("customer name is:" + invoice1.getCustomerName());
        System.out.println("customer dicountis:" + invoice1.getCustomerDiscount());
    }
}
