package practiseworks;

import practiseworks.Car;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCar {
    public static void main(String[] args) {
        Set<Car> car = new HashSet<>();
        int a = 0;
        Integer A = new Integer(a);
        a = (int) A;
        Integer[] num = new Integer[20];

        Car car6  = new Car("Honda","Silver", 24000);
        Car car1 = new Car("Nissan","Red", 36900);
        Car car2 = new Car("Toyota","Blue", 27000);
        Car car3 = new Car("Jeep","White", 55000);
        Car car4 = new Car("Lambo","Orange", 2224000);
        Car car5 = new Car("Audi","Metal", 3424000);
        Car car7  = new Car("Honda","Silver", 24000);

        car.add(car6);
        car.add(car1);
        car.add(car2);
        car.add(car3);
        car.add(car4);
        car.add(car5);
        car.add(car7);
        System.out.println(car);
        System.out.println("&&&&&&&&&&&$#######@%@@@@@");

        Iterator<Car> it = car.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            it.remove();
        }

        System.out.println("&&&&&&&&&&&$#######@%@@@@@");

        try{
            for(Car c:car){
                System.out.println(c);
                System.out.println("Test");

            }
        }catch(Exception e){
            System.out.println("Test");
        }
        System.out.println("11111111&&@@@@@");

    }
}
