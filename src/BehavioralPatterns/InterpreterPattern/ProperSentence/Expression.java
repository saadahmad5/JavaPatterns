package BehavioralPatterns.InterpreterPattern.ProperSentence;

public class Expression implements IExpression {

  FirstCharOfFirstWordCapitalized firstCharOfFirstWordCapitalized = new FirstCharOfFirstWordCapitalized();

  @Override
  public String validate(String context) {
    return firstCharOfFirstWordCapitalized.validate(context);
  }

}
