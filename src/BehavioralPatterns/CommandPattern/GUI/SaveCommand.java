package BehavioralPatterns.CommandPattern.GUI;

public class SaveCommand implements ICommand {

    private final Document document;

    public SaveCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.save();
    }
}
