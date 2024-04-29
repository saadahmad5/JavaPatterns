package BehavioralPatterns.StatePattern.MediaPlayer;

public class PauseState implements State {


    @Override
    public void play(MediaPlayer player) {
        player.setState(new PlayState());
        System.out.println("Playing...");
    }

    @Override
    public void pause(MediaPlayer player) {

    }
}
