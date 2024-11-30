import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        Programmer programmer = new Programmer("Jone", "programmer", "Google");
        Dancer dancer = new Dancer("Steve", "dancer", "kiss");
        Singer singer = new Singer("Criss", "singer", "linking park");

        System.out.println(programmer.coding("calculator"));
        System.out.println(dancer.dancing("dance"));
        System.out.println(singer.singing("in the end"));


        System.out.println(programmer);
        System.out.println(dancer);
        System.out.println(singer);
    }
}