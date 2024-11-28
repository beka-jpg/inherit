import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal Animal = new Animal();
        Cat cat1 = new Cat("Cat", LocalDate.of(2024,12,24),"Asia",40, 80, "White", true,4);
        Dog gog1 = new Dog("Dog", LocalDate.of(2024,12,24),"Asia",50, 100, "brown", true,4);
    }
}