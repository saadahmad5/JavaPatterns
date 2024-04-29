package BehavioralPatterns.InterpreterPattern.JavaNamingConvention;

public class CheckCamelCasing implements IExpression {

  private final CheckNotPrimitiveDataType checkNotPrimitiveDataType = new CheckNotPrimitiveDataType();

  @Override
  public String check(String context) {
    if (!isFirstCharacterLowercase(context)) {
      context = context.substring(0, 1).toLowerCase() + context.substring(1);
    }
    return checkNotPrimitiveDataType.check(context);
  }

  private boolean isFirstCharacterLowercase(String value) {
    char firstChar = value.charAt(0);
    return firstChar >= 'a' && firstChar <= 'z';
  }

}
