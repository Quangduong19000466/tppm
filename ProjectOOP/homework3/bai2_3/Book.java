package homework3.bai2_3;

public class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String isbn, String name, Author author, double price) {
        this.author = author;
        this.price = price;
        this.name = name;
        this.isbn = isbn;
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.author = author;
        this.price = price;
        this.name = name;
        this.isbn = isbn;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        return author.getName();

    }

    @Override
    public String toString() {
        return "Book[name=" + this.name + ",authors=" + author.toString() + "," + this.price + "," + this.qty + "]";
    }
}

