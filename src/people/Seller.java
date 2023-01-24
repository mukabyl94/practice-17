package people;

public class Seller extends People {
    public Seller() {
    }

    public Seller(String name, String gender, int number) {
        super(name, gender, number);
    }

    @Override
    public String toString() {
        return " Seller " + getName() + getGender() + getNumber();
    }
}
