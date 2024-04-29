package CreationalPatterns.BuilderPattern.House;

import java.awt.*;

public class House {

    // House is director
    // Bedroom is product
    // BedroomBuilder is Builder

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

        System.out.println("Bedroom 1: " + bedroom1);
        System.out.println("Bedroom 2: " + bedroom2);
        System.out.println("Bedroom 3: " + bedroom3);
    }

}
