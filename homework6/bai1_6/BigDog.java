package bai1_6;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    public void greets(){
        System.out.println("wooow");
    }

    public void greets(Dog anothor){
        System.out.println("wooooow");
    }

    public void greets(BigDog anothor){
        System.out.println("wooooooooooow");
    }
}
