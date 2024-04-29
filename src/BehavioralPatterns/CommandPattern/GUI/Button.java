package BehavioralPatterns.CommandPattern.GUI;

public class Button {

    void click(ICommand command) {
        command.execute();
    }

}
