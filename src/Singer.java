public class Singer extends Person {
    private String bandName;


    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String  singing(String what) {
        return "singing   " +  what;
    }
    public String playGuitar(String what) {
        return "playing guitar music " + what;
    }

    @Override
    public String toString() {
        return "Singer{" +
                super.toString() +
                "bandName='" + bandName + '\'' +
                '}';
    }
}
