package observer.simple;

public class Example {

  public static void test() {
    SimpleSubject simpleSubject = new SimpleSubject();

    SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

    simpleSubject.setValue(80);

    simpleSubject.removeObserver(simpleObserver);
  }
}
