package CreationalPatterns.FactoryPattern.Fifa;

public class Game {

    static TeamFactory teamFactory = new TeamFactory();

    public static void main(String[] args) {

        teamFactory.generatePsgPlayers().showPlayers();

    }

}
