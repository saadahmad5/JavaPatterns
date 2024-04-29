package BehavioralPatterns.CommandPattern.GUI;

public class GUI {

    private static final Document document = new Document();

    public static void main(String[] args){

        Button saveButton = new Button();
        Button printButton = new Button();

        saveButton.click(new SaveCommand(document));
        printButton.click(new PrintCommand(document));
    }

}
