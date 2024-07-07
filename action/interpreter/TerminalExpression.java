public class TerminalExpression implements AbstractExpression {
    private int value;

    public TerminalExpression(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }
}
