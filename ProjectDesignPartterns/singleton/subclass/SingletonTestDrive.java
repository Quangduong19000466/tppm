package singleton.subclass;

public class SingletonTestDrive {
  public static void test() {
    Singleton foo = CoolerSingleton.getInstance();
    Singleton bar = HotterSingleton.getInstance();
    System.out.println(foo);
    System.out.println(bar);
  }
}
