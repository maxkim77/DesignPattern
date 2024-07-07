public class Context {
    private String expression;
    private int index;

    public Context(String expression) {
        this.expression = expression;
        this.index = 0;
    }

    public String nextToken() {
        if (index >= expression.length()) {
            return null;
        }

        char currentChar = expression.charAt(index);

        if (Character.isDigit(currentChar)) {
            StringBuilder number = new StringBuilder();
            while (index < expression.length() && Character.isDigit(expression.charAt(index))) {
                number.append(expression.charAt(index++));
            }
            return number.toString();
        }

        index++;
        return String.valueOf(currentChar);
    }
}
