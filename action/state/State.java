// State 인터페이스
interface State {
    void open();
    void close();
}

// 문이 열려 있는 상태
class OpenedState implements State {
    private Door door;

    public OpenedState(Door door) {
        this.door = door;
    }

    @Override
    public void open() {
        System.out.println("The door is already open.");
    }

    @Override
    public void close() {
        System.out.println("Closing the door.");
        door.setState(door.getClosedState());
    }
}

// 문이 닫혀 있는 상태
class ClosedState implements State {
    private Door door;

    public ClosedState(Door door) {
        this.door = door;
    }

    @Override
    public void open() {
        System.out.println("Opening the door.");
        door.setState(door.getOpenedState());
    }

    @Override
    public void close() {
        System.out.println("The door is already closed.");
    }
}
