package CreationalPatterns.BuilderPattern.Architect;


import java.util.List;

public class House {

    private final List<Room> bedrooms;

    public House(List<Room> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public List<Room> getRooms() {
        return this.bedrooms;
    }

}
