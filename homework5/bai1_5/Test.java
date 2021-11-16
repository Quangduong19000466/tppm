package bai1_5;

public class Test {
    public static void main(String[] args) {
        Mammal mammal = new Mammal("nam");
        System.out.println(mammal);

        Mammal mammal1 = new Cat("quang");
        System.out.println(mammal1);
        Cat cat = new Cat("q");
        cat.greets();

        Mammal mammal2 = new Dog("quan");
        System.out.println(mammal2);
        Dog dog = new Dog("pitbull");
        dog.greets(dog);
    }
}
