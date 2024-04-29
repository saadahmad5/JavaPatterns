package CreationalPatterns.FactoryPattern.Fifa;

import java.util.List;

public class Team {

    List<Player> players;
    String teamName;

    public Team(String teamName, List<Player> players) {
        this.teamName = teamName;
        this.players = players;
    }

    public void showPlayers() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Team: " + this.teamName + ", players: " + players;
    }
}
