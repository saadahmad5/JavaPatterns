package CreationalPatterns.BuilderPattern.Architect;

import java.awt.*;

public class Architect {

    // Architect is director
    // Bedroom is product
    // BedroomBuilder and BedroomListBuilder is builder

    public static void main(String[] args){

        Room bedroom1 = new BedroomBuilder()
                .setDimensions(new Dimension(15, 15))
                .setWallColor(Color.green)
                .build();

        Room bedroom2 = new BedroomBuilder()
                .setDimensions(new Dimension(7, 12))
                .setWallColor(Color.black)
                .setFloorNumber(97)
                .setNumberOfWindows(5)
                .setNumberOfDoors(9)
                .build();

        Room bedroom3 = new BedroomBuilder()
                .build();


        House house = new House(
                new BedroomListBuilder().addRooms()
                        .addRoom(new BedroomBuilder()
                                    .setDimensions(new Dimension(12, 7))
                                    .setWallColor(Color.yellow)
                                    .setFloorNumber(20)
                                    .build())
                        .addRoom(bedroom1)
                        .addRoom(bedroom2)
                        .addRoom(bedroom3)
                        .build()
        );

        house.getRooms().forEach(System.out::println);

    }

}
