public abstract class Main {
    public static void main(String[] args) {
        String expression = "3+5";
        Parser parser = new Parser(expression);
        AbstractExpression syntaxTree = parser.parse();
        Context context = parser.getContext(); // 여기서 getContext() 메서드를 사용하여 context를 가져옵니다.
        int result = syntaxTree.interpret(context);
        System.out.println("The result of '" + expression + "' is " + result);
    }
}
