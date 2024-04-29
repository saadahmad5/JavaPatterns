package BehavioralPatterns.InterpreterPattern.JavaNamingConvention;

public class CheckNotPrimitiveDataType implements IExpression {

  @Override
  public String check(String context) {

    if (isPrimitiveDataType(context)) {
      return context + "_";
    }
    return context;
  }

  private boolean isPrimitiveDataType(String value) {

    switch (value) {
      case "boolean":
      case "short":
      case "int":
      case "long":
      case "double":
      case "float":
        return true;
      default:
        return false;
    }
  }

}
