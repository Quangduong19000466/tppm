package homework5.bai1_5;

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }

    public void greets(){
        System.out.println("Woof");
    }

    public void greets(Dog anothor){
        System.out.println(anothor);
    }
    public String toString(){
        return "Dog[" + super.toString() + "]";
    }
}
