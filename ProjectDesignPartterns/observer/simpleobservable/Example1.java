package observer.simpleobservable;

public class Example1 {

  public static void test() {
    SimpleSubject simpleSubject = new SimpleSubject();

    SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

    simpleSubject.setValue(80);
  }
}
