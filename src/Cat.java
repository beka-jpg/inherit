import java.time.LocalDate;

public class Cat extends Animal {
    boolean isHome;
    private int foots ;




    public Cat(String name, LocalDate dateOfBirths, String country, int weight, int height, String color,boolean isHome, int footsl) {
        super(name, dateOfBirths, country, weight, height, color);
        this.isHome = isHome;
        this.foots = foots;
    }

    public boolean isHome() {
        return isHome;
    }

    public void setHome(boolean home) {
        isHome = home;
    }

    public int getFoots() {
        return foots;
    }

    public void setFoots(int foots) {
        this.foots = foots;
    }

    @Override
    public String toString() {

        return "Cat{" +
                super.toString() +
                "isHome=" + isHome +
                ", foots=" + foots +
                '}';
    }
}
