package bai1_6;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat("meo");
        Dog dog = new Dog("cho");
        Animal bigdog = new BigDog("nu");

        cat.greets();

        dog.greets();
        dog.greets(dog);

        bigdog.greets();
    }
}
