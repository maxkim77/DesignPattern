public class NonterminalExpression implements AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;
    private char operator;

    public NonterminalExpression(AbstractExpression left, AbstractExpression right, char operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public int interpret(Context context) {
        int leftResult = left.interpret(context);
        int rightResult = right.interpret(context);

        switch (operator) {
            case '+':
                return leftResult + rightResult;
            case '-':
                return leftResult - rightResult;
            case '*':
                return leftResult * rightResult;
            case '/':
                if (rightResult == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return leftResult / rightResult;
            default:
                throw new UnsupportedOperationException("Invalid operator: " + operator);
        }
    }
}
