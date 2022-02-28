package homework6;

import homework6.bai1_7.Animal;
import homework6.bai1_7.BigDog;
import homework6.bai1_7.Cat;
import homework6.bai1_7.Dog;

public class TestAnimal {
    public static void test() {
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();

        Animal animal1 = new Cat();
        animal1.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal3 = new BigDog();
        animal3.greeting();
        //Animal animal4 = new Animal();

        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
       Dog dog3 = (Dog) animal3;
//        Cat cat2 = (Cat) animal2;
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}
