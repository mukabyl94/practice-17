import people.Busdriver;
import people.Seller;
import people.Taxidriver;
import traffic.Bus;
import traffic.Car;
import traffic.Trolleybus;

public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus("2018.09.25", "blue", 12048);
        bus.setSeller(new Seller("Aigul ", " girl ", 555478962));
        bus.setBusdriver(new Busdriver(" Taalai ", "Boy ", 222126548));

        Car car = new Car("2020.02.15", "yellow", 65014);
        car.setTaxidriver(new Taxidriver(" Asan ", " boy ", 778548756));
        car.setBusdriver(new Busdriver(" Taalai ", "Boy ", 222126548));

        Trolleybus trolleybus = new Trolleybus("2020.06.04", "blue white", 80457);
        trolleybus.setSeller(new Seller("Aigul ", " girl ", 555478962));
        trolleybus.setBusdriver(new Busdriver(" Taalai ", "Boy ", 222126548));


        System.out.println(bus);
        bus.run();
        bus.stop();
        System.out.println(trolleybus);
        trolleybus.run();
        trolleybus.stop();
        System.out.println(car);
        car.run();
        car.stop();

    }
}