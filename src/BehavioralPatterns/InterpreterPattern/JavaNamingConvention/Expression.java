package BehavioralPatterns.InterpreterPattern.JavaNamingConvention;

public class Expression implements IExpression {

  private CheckCamelCasing checkCamelCasing = new CheckCamelCasing();

  @Override
  public String check(String context) {
    return checkCamelCasing.check(context);
  }

}
