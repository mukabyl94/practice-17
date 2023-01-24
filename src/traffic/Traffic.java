package traffic;

public abstract class Traffic {
    private String yearOfRelease;
    private String color;
    private int number;

    public Traffic() {
    }

    public Traffic(String yearOfRelease, String color, int number) {
        this.yearOfRelease = yearOfRelease;
        this.color = color;
        this.number = number;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public abstract void run();
    public abstract void stop();

    @Override
    public String toString() {
        return "Traffic{" +
                "yearOfRelease='" + yearOfRelease + '\'' +
                ", color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
