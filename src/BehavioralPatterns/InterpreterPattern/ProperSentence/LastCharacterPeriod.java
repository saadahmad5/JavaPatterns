package BehavioralPatterns.InterpreterPattern.ProperSentence;

public class LastCharacterPeriod implements IExpression {


    @Override
    public String validate(String context) {
        if (!context.endsWith(".")) {
            context = context + ".";
        }
        return context;
    }

}
