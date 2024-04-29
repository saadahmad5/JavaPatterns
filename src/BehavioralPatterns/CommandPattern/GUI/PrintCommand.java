package BehavioralPatterns.CommandPattern.GUI;

public class PrintCommand implements ICommand {

    private final Document document;

    public PrintCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.print();
    }
}
