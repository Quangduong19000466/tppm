package bai2_1;

public class TestBook {
    public static void main(String[] args) {
        Author ahteck = new Author("tan a teck", "ahteck@gmail.com", 'm');
        System.out.println(ahteck);


        Book dummyBook = new Book("java for dummy", ahteck, 19.95, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is:" + dummyBook.getName());
        System.out.println("price is:" + dummyBook.getPrice());
        System.out.println("Author is:" + dummyBook.getAuthor());
        System.out.println("qty is:" + dummyBook.getQty());

        System.out.println("author name is:" + dummyBook.getAuthor().getName());
        System.out.println("author email is:" + dummyBook.getAuthor().getEmail());


        Book anotherBook = new Book("more java", new Author("paul tan", "paul@gmail.com", 'm')
                , 29.95);
        System.out.println(anotherBook);


    }
}
