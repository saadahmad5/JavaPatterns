package CreationalPatterns.BuilderPattern.Architect;

import java.util.ArrayList;
import java.util.List;

public class BedroomListBuilder {

    private List<Room> bedrooms;

    public BedroomListBuilder addRooms() {
        bedrooms = new ArrayList<>();
        return this;
    }

    public BedroomListBuilder addRoom(Room bedroom) {
        bedrooms.add(bedroom);
        return this;
    }

    public BedroomBuilder addRoom() {
        return new BedroomBuilder();
    }

    public List<Room> build() {
        return bedrooms;
    }

}
