package BehavioralPatterns.MomentoPattern.TextEditor;

public class Momento {

    private String state;

    public Momento(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
