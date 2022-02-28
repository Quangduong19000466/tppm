import java.util.Scanner;
import adapter.*;
import builder.*;
import decorator.pizza.*;
import decorator.starbuzz.*;
import decorator.starbuzzWithSizes.*;
import dinermerger.*;
import factory.pizzaaf.*;
import factory.pizzafm.*;
import factory.pizzas.*;
import observer.simple.*;
import observer.weather.*;
import observer.simpleobservable.*;
import observer.weatherobservable.*;
import singleton.chocolate.*;
import singleton.classic.*;
import singleton.subclass.*;
import strategy.*;
public class TestAll {

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("1: Adapter Parttern");
        System.out.println("2: Build Parttern");
        System.out.println("3: Decorator Parttern");
        System.out.println("4: Dinermerger Parttern");
        System.out.println("5: Factory Parttern");
        System.out.println("6: Obsever Parttern");
        System.out.println("7: Singleton Parttern");
        System.out.println("8: Strategy Parttern");
        System.out.println("9: Thoát.");
        System.out.println("Lựa chọn: ");
        int n = sc.nextInt();
        switch (n){
            case 1:
                DuckTestDriver.test();
                break;
            case 2:
                PizzaDirector.test();
                break;
            case 3:
                System.out.println("1: Pizza");
                System.out.println("2: StarBuzz");
                System.out.println("3: StarBuzzWithSizes");
                int b = sc.nextInt();
                switch (b){
                    case 1:
                        PizzaStoreDecor.test();
                        break;
                    case 2:
                        StarbuzzCoffee.test();
                        break;
                    case 3:
                        StarbuzzCoffee2.test();
                        break;
                    default:
                        menu();
                        break;
                }
                break;
            case 4:
                MenuTestDrive.test();
                break;
            case 5:
                System.out.println("1: Pizzaaf");
                System.out.println("2: Pizzaafm");
                System.out.println("3: Pizzaas");
                int a = sc.nextInt();
                switch (a){
                    case 1:
                        PizzaTestDrive1.test();
                        break;
                    case 2:
                        PizzaTestDrive2.test();
                        break;
                    case 3:
                        PizzaTestDrive3.test();
                        break;
                    default:
                        menu();
                        break;
                }
                break;
            case 6:
                System.out.println("1: Simple");
                System.out.println("2: Simpleobservable");
                System.out.println("3: weather");
                System.out.println("4: Weatherobservable");
                int c = sc.nextInt();
                switch (c){
                    case 1:
                        Example.test();
                        break;
                    case 2:
                        Example1.test();
                        break;
                    case 3:
                        WeatherStation.test();
                        System.out.println("--------------");
                        WeatherStationHeatIndex.test();
                        break;
                    case 4:
                        WeatherStation1.test();
                        System.out.println("--------------");
                        WeatherStationHeatIndex1.test();
                        break;
                    default:
                        menu();
                        break;
                }
                break;
            case 7:
                System.out.println("1: Chôcolate");
                System.out.println("2: Classic");
                System.out.println("3: Subclass");
                int d = sc.nextInt();
                switch (d){
                    case 1:
                        ChocolateController.test();
                        break;
                    case 2:
                        SingletonClient.test();
                        break;
                    case 3:
                        SingletonTestDrive.test();
                        break;
                    default:
                        menu();
                        break;
                }
                break;
            case 8:
                AnimalTest.test();
                break;
            default:
                menu();
            case 9:
                System.exit(0);
        }
    }

    public static void main(String args[]){
        while (true){
            menu();
        }
    }
}
