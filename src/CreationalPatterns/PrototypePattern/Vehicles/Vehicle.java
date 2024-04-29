package CreationalPatterns.PrototypePattern.Vehicles;

public class Vehicle implements Cloneable {

    private Person owner;
    private Brand brand;

    Vehicle(Brand brand, Person owner) {
        this.brand = brand;
        this.owner = owner;
    }

    Vehicle() {
        this.owner = new Person();
    }

    void setOwner(Person person) {
        this.owner = person;
    }

    Person getOwner() {
        return this.owner;
    }

    void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "owner= " + owner +
                ", brand= " + brand +
                '}';
    }

    @Override
    public Vehicle clone() {
        try {
            Vehicle vehicle = (Vehicle) super.clone();
            vehicle.owner = owner.clone();
            return vehicle;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
