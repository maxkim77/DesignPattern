interface Strategy {
    void execute();
}


// ConcreteStrategy 클래스 - Strategy A

class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing StrategyA");
    }
}

// ConcreteStrategy 클래스 - Strategy B

class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing StrategyB");
    }
}

class Context {
    private Strategy strategy;
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}