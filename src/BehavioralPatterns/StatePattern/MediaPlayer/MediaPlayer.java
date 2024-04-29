package BehavioralPatterns.StatePattern.MediaPlayer;

public class MediaPlayer {

    State state = new PauseState();

    protected void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

    public void play() {
        this.state.play(this);
    }

    public void pause() {
        this.state.pause(this);
    }

}
