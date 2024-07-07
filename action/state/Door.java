class Door {
    private State openedState;
    private State closedState;
    private State currentState;

    public Door() {
        openedState = new OpenedState(this);
        closedState = new ClosedState(this);
        currentState = closedState; // 초기 상태는 닫힘
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getOpenedState() {
        return openedState;
    }

    public State getClosedState() {
        return closedState;
    }

    public void open() {
        currentState.open();
    }

    public void close() {
        currentState.close();
    }
}
