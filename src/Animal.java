import java.time.LocalDate;

public class Animal {
    private String name;
    private LocalDate dateOfBirths;
    private String country;
    private int weight;
    private int height;
    private String color;


    public Animal(String name, LocalDate dateOfBirths, String country, int weight, int height, String color) {
        this.name = name;
        this.dateOfBirths = dateOfBirths;
        this.country = country;
        this.weight = weight;
        this.height = height;
        this.color = color;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirths() {
        return dateOfBirths;
    }

    public void setDateOfBirths(LocalDate dateOfBirths) {
        this.dateOfBirths = dateOfBirths;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", dateOfBirths=" + dateOfBirths +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}

