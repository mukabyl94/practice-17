package traffic;

import people.Busdriver;
import people.Seller;

public class Bus extends Traffic {
    private Seller seller;
    private Busdriver busdriver;
    public Bus() {
    }

    public Bus(String yearOfRelease, String color, int number) {
        super(yearOfRelease, color, number);
    }

    @Override
    public void run() {
        System.out.println("Bus is running");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping");
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Busdriver getBusdriver() {
        return busdriver;
    }

    public void setBusdriver(Busdriver busdriver) {
        this.busdriver = busdriver;
    }

    @Override
    public String toString() {
        return "Bus: " + " Year of release " + getYearOfRelease() + " color " + getColor() + " number " + getNumber()+
                " Seller " + getSeller() + getBusdriver();
    }
}
