package bai2_2;

public class TestBook {
    public static void main(String[] args) {
        Author[] authors=new Author[2];
        authors[0]= new Author("tan ah Teck","AhTeck@gmail.com",'m');
        authors[1]= new Author("paul tan","paul@gmail.com",'m');

        Book dummyBook = new Book("java and dummy",authors,19.99,99);
        System.out.println(dummyBook);
    }
}
