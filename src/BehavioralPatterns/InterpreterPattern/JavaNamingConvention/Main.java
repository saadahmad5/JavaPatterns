package BehavioralPatterns.InterpreterPattern.JavaNamingConvention;

public class Main {

    public static void main(String[] args){

        IExpression expression = new Expression();

        System.out.println(expression.check("Int"));
        System.out.println(expression.check("boolean_"));
        System.out.println(expression.check("float"));
        System.out.println(expression.check("Saad"));
        System.out.println(expression.check("ahmad"));


    }

}
