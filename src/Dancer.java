public class Dancer extends Person {
    private String groupName;



    public Dancer(String name, String designation,String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String dancing(String what) {
        return "dancing " + what;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                super.toString() +
                "groupName='" + groupName + '\'' +
                '}';
    }
}
