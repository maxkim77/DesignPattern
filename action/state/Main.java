public class Main {
    public static void main(String[] args) {
        Door door = new Door();

        door.open();  // 문을 연다.
        door.open();  // 문이 이미 열려 있다.
        door.close(); // 문을 닫는다.
        door.close(); // 문이 이미 닫혀 있다.
    }
}
