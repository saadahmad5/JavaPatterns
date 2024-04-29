package BehavioralPatterns.InterpreterPattern.ProperSentence;

public class FirstCharOfFirstWordCapitalized implements IExpression {


    LastCharacterPeriod lastCharacterPeriod = new LastCharacterPeriod();

    @Override
    public String validate(String context) {
        if (isFirstCharacterLowercase(context)) {
            context = context.substring(0, 1).toUpperCase() + context.substring(1);
        }
        return lastCharacterPeriod.validate(context);
    }

    private boolean isFirstCharacterLowercase(String value) {
        char firstChar = value.charAt(0);
        return firstChar >= 'a' && firstChar <= 'z';
    }

}
