package homework5;

import homework5.bai1_5.Cat;
import homework5.bai1_5.Dog;
import homework5.bai1_5.Mammal;

public class Test51_5 {
    public static void test() {
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
