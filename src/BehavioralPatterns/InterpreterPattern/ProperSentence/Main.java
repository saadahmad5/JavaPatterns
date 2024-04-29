package BehavioralPatterns.InterpreterPattern.ProperSentence;

public class Main {

    public static void main(String[] args){

        IExpression expression = new Expression();

        System.out.println(expression.validate("this is a sentence"));
        System.out.println(expression.validate("This is a sentence"));
        System.out.println(expression.validate("this is a sentence."));
        System.out.println(expression.validate("This is a sentence."));

    }

}
