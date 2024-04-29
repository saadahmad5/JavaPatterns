package CreationalPatterns.FactoryPattern.Fifa;

public class Player {

    String name;

    int number;

    Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + "(" + number + ")";
    }

}
