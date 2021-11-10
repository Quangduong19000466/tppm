package bai2_2;


import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    private  String name;
    private Author[] authors;
    private double price;
    private int qty =0;

    public  Book(String name, Author[] authors,double price){
        this.name=name;
        this.authors=authors;
        this.price=price;
    }
    public  Book(String name, Author[] authors,double price,int qty){
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
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

    public String toString() {
        return "Book[name="+this.name+",authors={"+getAuthorNames()+"},"+this.price+","+this.qty+"]";
    }
    //Arrays.toString(authors)
//    public ArrayList<String> getAuthorNames(){
//        ArrayList<String> array= new ArrayList<String>();
//        for (int i =0 ; i<authors.length;i++){
//            array.add(authors[i].toString());
//        }
//
//        return array ;
//    }
    public String getAuthorNames(){
        return Arrays.toString(authors);
    }
}
