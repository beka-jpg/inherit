public class Programmer extends Person{
    String companyName;

    public Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String coding (String what) {
        return "coding " + what;
    }


    @Override
    public String toString() {
        return "Programmer{" +
                super.toString() +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
