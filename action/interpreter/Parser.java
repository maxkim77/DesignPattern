import java.util.Stack;

public class Parser {
    private Context context;

    public Parser(String expression) {
        this.context = new Context(expression);
    }

    public Context getContext() {
        return context;
    }

    public AbstractExpression parse() {
        Stack<AbstractExpression> stack = new Stack<>();
        while (true) {
            String token = context.nextToken();
            if (token == null) break;

            if (Character.isDigit(token.charAt(0))) {
                stack.push(new TerminalExpression(Integer.parseInt(token)));
            } else {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid expression");
                }
                AbstractExpression right = stack.pop();
                AbstractExpression left = stack.pop();
                stack.push(new NonterminalExpression(left, right, token.charAt(0)));
            }
        }
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid expression");
        }
        return stack.pop();
    }
}
