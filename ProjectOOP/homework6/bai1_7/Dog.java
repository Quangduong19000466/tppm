package homework6.bai1_7;

public class Dog extends Animal{
    @Override
    public void greeting() {
        System.out.println("woof!");
    }
    public void greeting(Dog anothor) {
        System.out.println("woooof!");
    }
}
