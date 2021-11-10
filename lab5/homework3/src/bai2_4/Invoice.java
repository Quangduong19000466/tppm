package bai2_4;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int is, Customer customer, double amount) {
        this.amount = amount;
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {

        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public double getCustomerDiscount() {
        return customer.getDiscount();
    }

    public String toString() {
        return "Invoice[is=" + this.id + ",customer=" + customer.toString() + ",amount=" + this.amount + "]";
    }
}
