public class InterpreterPatternExample {
    public static void main(String[] args) {
        String expression = "3+5";
        Parser parser = new Parser(expression);
        AbstractExpression syntaxTree = parser.parse();
        Context context = parser.getContext();
        int result = syntaxTree.interpret(context);
        System.out.println("The result of '" + expression + "' is " + result);
    }
}
