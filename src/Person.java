public class Person {
    private String name;
    private String designation ;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public Person() {
    }

    public String learn(String what) {
        return "learning " + what;
    }
    public String walk(String where) {
        return "walking " + where;
    }
    public String eat (String what) {
        return "eating " + what;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
