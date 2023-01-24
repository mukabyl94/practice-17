package people;

public abstract class People {
    private String name;
    private String gender;
    private int number;

    public People() {
    }

    public People(String name, String gender, int number) {
        this.name = name;
        this.gender = gender;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
