import java.time.LocalDate;
import Animals.*;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Lion lion = new Lion("Lion");
        Elephant elephant = new Elephant("Elephant");
        Monkey monkey = new Monkey("Monkey");

        lion.makeSound("Ррр, Я лев!");
        elephant.makeSound("Тру-у-у, Я слон!");
        monkey.makeSound("У-у-у, я обезьяна!");

    }
}