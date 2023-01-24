package traffic;

import people.Busdriver;
import people.Seller;

public class Trolleybus extends Traffic{
    private Seller seller;
    private Busdriver busdriver;
    public Trolleybus() {
    }

    public Trolleybus(String yearOfRelease, String color, int number) {
        super(yearOfRelease, color, number);
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
    public void run() {
        System.out.println("Trolleybus is running");
    }

    @Override
    public void stop() {
        System.out.println("Trolleybus is stopping");
    }
    @Override
    public String toString() {
        return "Trolleybus: " + " Year of release " + getYearOfRelease() + " color " + getColor() + " number " + getNumber()+
                getSeller() + getBusdriver();
    }

}
