package decorator.pizza;

public class PizzaStoreDecor {

  public static void test() {
    Pizza pizza = new ThincrustPizza();
    Pizza cheesePizza = new Cheese(pizza);
    Pizza greekPizza = new Olives(cheesePizza);

    System.out.println(greekPizza.getDescription()
            + " $" + greekPizza.cost());

  }
}
