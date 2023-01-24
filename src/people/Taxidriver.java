package people;

public class Taxidriver extends People{
    public Taxidriver() {
    }

    public Taxidriver(String name, String gender, int number) {
        super(name, gender, number);
    }

    @Override
    public String toString() {
        return " Taxidriver " + getName() + getGender() + getNumber();
    }
}
