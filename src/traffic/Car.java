package traffic;

import people.Busdriver;
import people.Taxidriver;

public class Car extends Traffic {
    private Taxidriver taxidriver;
    private Busdriver busdriver;

    public Car() {
    }

    public Car(String yearOfRelease, String color, int number) {
        super(yearOfRelease, color, number);
    }

    public Taxidriver getTaxidriver() {
        return taxidriver;
    }

    public void setTaxidriver(Taxidriver taxidriver) {
        this.taxidriver = taxidriver;
    }

    @Override
    public void run() {
        System.out.println("Car in running");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    public Busdriver getBusdriver() {
        return busdriver;
    }

    public void setBusdriver(Busdriver busdriver) {
        this.busdriver = busdriver;
    }

    @Override
    public String toString() {
        return "Car: " + " Year of release " + getYearOfRelease() + " color " + getColor() + " number " + getNumber() +
                getTaxidriver() + getBusdriver();
    }

}
