package BehavioralPatterns.StatePattern.MediaPlayer;

public class PlayState implements State {


    @Override
    public void play(MediaPlayer player) {

    }

    @Override
    public void pause(MediaPlayer player) {
        player.setState(new PauseState());
        System.out.println("Paused...");
    }
}
