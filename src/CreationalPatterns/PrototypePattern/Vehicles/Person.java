package CreationalPatterns.PrototypePattern.Vehicles;

public class Person implements Cloneable {

    String name;

    Person(String name) {
        this.name = name;
    }

    Person() {
        this.name = null;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
