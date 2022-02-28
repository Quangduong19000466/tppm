package homework6;

import homework6.bai1_6.Animal;
import homework6.bai1_6.BigDog;
import homework6.bai1_6.Cat;
import homework6.bai1_6.Dog;

public class Test6_6 {
    public static void test() {
        Animal cat = new Cat("meo");
        Dog dog = new Dog("cho");
        Animal bigdog = new BigDog("nu");

        cat.greets();

        dog.greets();
        dog.greets(dog);

        bigdog.greets();
    }
}
