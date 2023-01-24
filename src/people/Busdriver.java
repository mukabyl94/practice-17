package people;

public class Busdriver extends People{
    public Busdriver() {
    }

    public Busdriver(String name, String gender, int number) {
        super(name, gender, number);
    }

    @Override
    public String toString() {
        return " Busdriver" + getName() + getGender() + getNumber();
    }
}
