package Animals;

public class Animal {
    private String name;


    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String makeSound(String sound) {
        return name +  ": " +  sound;
    }


}
