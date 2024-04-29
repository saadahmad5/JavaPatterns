package BehavioralPatterns.MomentoPattern.TextEditor;

public class TextEditor {

    private String text;
    private Momento momento;

    public TextEditor() {
        this.text = "";
        momento = new Momento(text);
    }

    public void displayText() {
        System.out.println(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void commit() {
        momento.setState(text);
    }

    public void revert() {
        text = momento.getState();
    }

}
