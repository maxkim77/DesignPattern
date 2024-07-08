public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        // Strategy A 사용
        context.setStrategy(new ConcreteStrategyA());
        context.executeStrategy();  // 출력: Executing strategy A

        // Strategy B 사용
        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();  // 출력: Executing strategy B
    }
}
