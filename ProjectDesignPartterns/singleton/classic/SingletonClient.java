package singleton.classic;

public class SingletonClient {

  public static void test(){
    Singleton singleton = Singleton.getInstance();
    System.out.println(singleton.getDescription());
  }
}
