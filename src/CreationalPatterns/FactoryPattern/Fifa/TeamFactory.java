package CreationalPatterns.FactoryPattern.Fifa;

import java.util.ArrayList;
import java.util.List;

public class TeamFactory {

    public Team generatePsgPlayers() {

        Player messi = new Player("Messi", 50);
        Player ronaldo = new Player("Ronaldo", 7);
        Player mbappe = new Player("Mbappe", 99);

        final List<Player> playersList = new ArrayList<>();
        playersList.add(messi);
        playersList.add(ronaldo);
        playersList.add(mbappe);

        return new Team("PSG", playersList);

    }

}
