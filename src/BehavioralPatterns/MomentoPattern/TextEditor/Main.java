package BehavioralPatterns.MomentoPattern.TextEditor;

public class Main {

    public static void main(String[] args){

        TextEditor textEditor = new TextEditor();
        textEditor.setText("Saad");
        textEditor.displayText();
        textEditor.commit();
        textEditor.setText("Ahmad");
        textEditor.displayText();
        textEditor.revert();
        textEditor.displayText();

    }

}
